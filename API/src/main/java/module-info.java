module com.example.api {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.api to javafx.fxml;
    exports com.example.api;
}