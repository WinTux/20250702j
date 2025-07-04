package com.pepe.EjemploGUI.Conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pepe.EjemploGUI.Models.Cliente;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Database {
	public static ObservableList<Cliente> obtenerClientes(){
		ObservableList<Cliente> lista = FXCollections.observableArrayList();
		String cadenaConexion = "jdbc:postgresql://192.168.1.254:5432/empresax";
		
		try (Connection con = DriverManager.getConnection(cadenaConexion,"super_user","123456Ax+")) {
			Statement statement = con.createStatement();
			ResultSet rs =statement.executeQuery("select * from cliente");
			while(rs.next()) {
				Cliente cliente = new Cliente(
						rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString("email")
						);
				lista.add(cliente);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
