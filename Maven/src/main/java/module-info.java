module com.example.maven {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.example.maven to javafx.fxml;
    exports com.example.maven;
}