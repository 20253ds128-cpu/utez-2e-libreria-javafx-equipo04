package com.utez.catalogolibros.controller;

import com.utez.catalogolibros.model.Libro;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {

    @FXML
    private TableView<Libro> tablaLibros;

    @FXML
    private TableColumn<Libro, String> colIsbn;

    @FXML
    private TableColumn<Libro, String> colTitulo;

    @FXML
    private TableColumn<Libro, String> colAutor;

    @FXML
    private TableColumn<Libro, String> colAnio;

    @FXML
    private TableColumn<Libro, String> colGenero;

    @FXML
    private TableColumn<Libro, String> colDisponible;

    @FXML
    private Button btnNuevo;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnDetalle;

    @FXML
    private Button btnExportar;

    @FXML
    public void initialize() {
        System.out.println("Controller cargado correctamente");
    }

}
