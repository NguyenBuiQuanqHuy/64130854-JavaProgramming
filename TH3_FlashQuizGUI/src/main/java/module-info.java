module th.nguyenbuiquanghuy.th3_flashquizgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens th.nguyenbuiquanghuy.th3_flashquizgui to javafx.fxml;
    exports th.nguyenbuiquanghuy.th3_flashquizgui;
}