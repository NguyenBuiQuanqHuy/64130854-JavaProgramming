package huy.ntu.dangnhap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainController {
    @FXML
    TableView<SanPham> tableView;
    @FXML
    TableColumn<SanPham,Integer> idColumn;
    @FXML
    TableColumn<SanPham,String> nameColumn;
    @FXML
    TableColumn<SanPham,Float> costColumn;
    @FXML
    TableColumn<SanPham,String> motaCol;

    ObservableList<SanPham> SPList;

    public void initialize(){
        SPList= FXCollections.observableArrayList();
        // Cài đặt các cột
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        costColumn.setCellValueFactory(new PropertyValueFactory<>("gia"));
        motaCol.setCellValueFactory(new PropertyValueFactory<>("mota"));

        tableView.setItems(SPList);

        loadDataBase();
    }



    public void loadDataBase(){
        try {
//      Class.forName("com.mysql.jdbc.Driver");
            String strConn = "jdbc:mysql://localhost:3306/dangnhap";
            Connection conn = DriverManager.getConnection(strConn, "root", "");

            String sqlSelect = "SELECT * FROM hanghoa";
            Statement lenh = conn.createStatement();
            ResultSet ketQua = lenh.executeQuery(sqlSelect);

            // Đưa dữ liệu vào ObservableList
            while (ketQua.next()) {
                int id = ketQua.getInt(1);
                String tenSP = ketQua.getString(2);
                float giaSP = ketQua.getFloat(3);
                String mota =ketQua.getString(4);

                SPList.add(new SanPham(id, tenSP, giaSP,mota));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void Add() {
        showAlert("Thêm sản phẩm thành công.");
    }

    // Thao tác Xóa
    @FXML
    private void Del() {
        showAlert("Xoá sản phẩm thành công");
    }

    // Thao tác Sửa
    @FXML
    private void Fix() {
        showAlert("Sửa sản phẩm thành công");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Thông báo");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
