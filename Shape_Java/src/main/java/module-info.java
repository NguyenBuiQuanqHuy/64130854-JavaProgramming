module huy.ntu.shape_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens huy.ntu.shape_java to javafx.fxml;
    exports huy.ntu.shape_java;
}