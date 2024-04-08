module com.example.basiccoffeeshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.basiccoffeeshop to javafx.fxml;
    exports com.example.basiccoffeeshop;
}