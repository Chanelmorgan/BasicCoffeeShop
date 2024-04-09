package com.example.basiccoffeeshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.text.DecimalFormat;

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

    @FXML
    public void radCappActionPerformed(ActionEvent event) {
        // Select capp option
        if(radCapp.isSelected()) {
            radCoffee.setSelected(false);
            radTea.setSelected(false);
        }
    }


    @FXML
    public void radTeaActionPerformed(ActionEvent event) {
        // Select tea option
        if(radTea.isSelected()) {
            radCoffee.setSelected(false);
            radCapp.setSelected(false);
        }
    }

    public void btnEntActionPerformed(ActionEvent event){
        DecimalFormat df = new DecimalFormat("0.000");
        double total = 0;
        double subtotal = 0;
        final double TAXRATE = 0.08;
        double tax = 0;

        if(radCoffee.isSelected()){
            subtotal = subtotal + 1;
        } else if(radCapp.isSelected()) {
            subtotal = subtotal + 1.25;
        } else if(radTea.isSelected()){
            subtotal = subtotal + 1;
        }

        if(chkBag.isSelected()) {
            subtotal = subtotal + 1.25;
        }
        if(chkCro.isSelected()){
            subtotal = subtotal + 1.15;
        }
        if(chkTo.isSelected()){
            subtotal = subtotal + 0.5;
        }


        txtSub.setText(Double.toString(subtotal));
        subtotal = Double.parseDouble(txtSub.getText());
        tax = subtotal *TAXRATE;
        total = tax + subtotal;

        txtTax.setText(Double.toString(tax));
        txtTotal.setText(Double.toString(total));

        txtTax.setText(df.format(tax));
        txtTotal.setText(df.format(total));
        txtSub.setText(df.format(subtotal));
    }

    public void btnExitActionPerformed(ActionEvent event){
        // Exits the application
        System.exit(0);
    }

    public void btnClearActionPerformed(ActionEvent event){
        // Clears the text fields
        radCoffee.setSelected(false);
        radCapp.setSelected(false);
        radTea.setSelected(false);
        chkBag.setSelected(false);
        chkCro.setSelected(false);
        chkTo.setSelected(false);
        txtTotal.setText("");
        txtTax.setText("");
        txtSub.setText("");

    }








}