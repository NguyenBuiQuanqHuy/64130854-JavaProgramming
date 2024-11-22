package huy.ntu.demobanhang.Untils;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;

public class DBUtils {
    @FXML
    TextField txtTenDN,txtMK;
    @FXML
    Button btnDN;
    static public Connection DBConnect() throws ClassNotFoundException, SQLException, NoSuchAlgorithmException, InvalidKeySpecException {
        Class.forName("com.mysql.jdbc.Driver");
        String strConn="jdbc:mysql://localhost:3306/demobanhang";
        Connection conn= DriverManager.getConnection(strConn,"root","");
        return conn;
    }
}
