package com.pepe.EjemploGUI;
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;

import com.pepe.EjemploGUI.Conections.Database;
import com.pepe.EjemploGUI.Models.Cliente;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblOut;
    
    @FXML
    private TableView<Cliente> tabla;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
    	TableColumn<Cliente,Integer> colId = new TableColumn<>("ID");
    	colId.setCellValueFactory(new PropertyValueFactory<>("id"));
    	TableColumn<Cliente,String> colNombre = new TableColumn<>("NOMBRE");
    	colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    	TableColumn<Cliente,String> colEmail = new TableColumn<>("EMAIL");
    	colNombre.setCellValueFactory(new PropertyValueFactory<>("email"));
    	tabla.getColumns().addAll(colId,colNombre,colEmail);
    	lblOut.setText("Hola mundo :D");
        ObservableList<Cliente> datos = Database.obtenerClientes();
        tabla.setItems(datos);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
