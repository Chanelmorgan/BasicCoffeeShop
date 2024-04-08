package com.example.basiccoffeeshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private RadioButton radCoffee;

    @FXML
    private RadioButton radCapp;

    @FXML
    private RadioButton radTea;

    @FXML
    private CheckBox chkBag;

    @FXML
    private CheckBox chkCro;

    @FXML
    private CheckBox chkTo;

    @FXML
    private TextField txtSub;

    @FXML
    private TextField txtTax;

    @FXML
    private TextField txtTotal;

    @FXML
    private Button btnEnt;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnClear;

    @FXML
    public void radCoffeeActionPerformed(ActionEvent event) {
        // Select coffee option
        if(radCoffee.isSelected()) {
            radCapp.setSelected(false);
            radTea.setSelected(false);
        }
    }



}