module com.example.api {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.example.api to javafx.fxml;
    exports com.example.api;
}