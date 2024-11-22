module huy.ntu.demobanhang {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens huy.ntu.demobanhang to javafx.fxml;
    exports huy.ntu.demobanhang;
}