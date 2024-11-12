package huy.ntu.dangnhap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginController {
    @FXML
    TextField txtTK,txtMK;
    @FXML
    private void Login(ActionEvent event) {
        String username=txtTK.getText();
        String pass=txtMK.getText();
        if(authenticateUser(username,pass)){
            try {
                loadMainScene(event);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Đăng nhập thất bại");
            alert.setHeaderText(null);
            alert.setContentText("Tên đăng nhập hoặc mật khẩu không đúng.");
            alert.showAndWait();
        }
    }

    private boolean authenticateUser(String username, String password) {
        // Kết nối database, kiểm tra thông tin
        try {
            String strConn = "jdbc:mysql://localhost:3306/dangnhap";
            Connection conn = DriverManager.getConnection(strConn, "root", "");
            String query = "SELECT * FROM user WHERE Username = ? AND Pass = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            return rs.next(); // Trả về true nếu tìm thấy người dùng
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void loadMainScene(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);

            stage.setTitle("Màn hình chính");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
