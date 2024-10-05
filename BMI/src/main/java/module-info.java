module com.example.bmi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.bmi to javafx.fxml;
    exports com.example.bmi;
}