package com.utez.catalogolibros.controller;

import com.utez.catalogolibros.model.Libro;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

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

        colIsbn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        colTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        colAutor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        colAnio.setCellValueFactory(new PropertyValueFactory<>("anio"));
        colGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
        colDisponible.setCellValueFactory(new PropertyValueFactory<>("disponible"));

        ObservableList<Libro> lista = FXCollections.observableArrayList(
                new Libro("123", "El Principito", "Antoine de Saint-Exupéry", 1943, "Ficción", true),
                new Libro("456", "1984", "George Orwell", 1949, "Distopía", true),
                new Libro("789", "Clean Code", "Robert C. Martin", 2008, "Programación", false)
        );

        tablaLibros.setItems(lista);

    }

}
