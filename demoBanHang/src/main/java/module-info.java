module huy.ntu.demobanhang {
    requires javafx.controls;
    requires javafx.fxml;


    opens huy.ntu.demobanhang to javafx.fxml;
    exports huy.ntu.demobanhang;
}