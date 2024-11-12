module huy.ntu.dangnhap {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens huy.ntu.dangnhap to javafx.fxml;
    exports huy.ntu.dangnhap;
}