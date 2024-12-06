module th.nguyenbuiquanghuy.th1_simplemath {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jfr;


    opens th.nguyenbuiquanghuy.th1_simplemath to javafx.fxml;
    exports th.nguyenbuiquanghuy.th1_simplemath;
}