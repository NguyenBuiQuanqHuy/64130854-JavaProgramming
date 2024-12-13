package th.nguyenbuiquanghuy.th5_hashmap;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.HashMap;

public class ThemTuController {
    @FXML
    TextField textFieldAnh, textFieldPhienAm, textFieldViet;

    private HashMap<String, PhienAm> tuDien;

    public void setTuDien(HashMap<String, PhienAm> tuDien) {
        this.tuDien = tuDien;
    }

    @FXML
    public void ThemTu() {
        tuDien = new HashMap<>();
        String tiengAnh = textFieldAnh.getText().trim();
        String phienAm = textFieldPhienAm.getText().trim();
        String nghiaViet = textFieldViet.getText().trim();

        if (tiengAnh.isEmpty() || phienAm.isEmpty() || nghiaViet.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Cảnh báo", "Vui lòng nhập đầy đủ thông tin!");
        } else {
            tuDien.put(tiengAnh, new PhienAm(phienAm, nghiaViet));
            showAlert(Alert.AlertType.INFORMATION, "Thành công", "Đã thêm từ mới vào từ điển!");
            textFieldAnh.clear();
            textFieldPhienAm.clear();
            textFieldViet.clear();
        }
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void TraCuu() throws IOException {
        tuDien = new HashMap<>();
        Stage currentStage = (Stage) textFieldAnh.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tudien-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        TuDienController tuDienController = fxmlLoader.getController();
        tuDienController.setTuDien(tuDien);

        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
        currentStage.close();
    }
}
