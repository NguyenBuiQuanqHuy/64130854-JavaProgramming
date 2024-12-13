package th.nguyenbuiquanghuy.th5_hashmap;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.HashMap;

public class TuDienController {
    @FXML
    TextField textFieldSearch;
    @FXML
    TextArea textAreaPhienAm,textAreaNghia;

    HashMap<String,PhienAm> tuDien;


    public void setTuDien(HashMap<String, PhienAm> tuDien) {
        this.tuDien = tuDien;
    }

    @FXML
    public void initialize() {
        tuDien = new HashMap<>();
        tuDien.put("Hello", new PhienAm("həˈloʊ", "Xin chào"));
        tuDien.put("World", new PhienAm("wɜːrld", "Thế giới"));
        tuDien.put("Java", new PhienAm("ˈdʒɑːvə", "Ngôn ngữ lập trình Java"));
        tuDien.put("Dictionary", new PhienAm("ˈdɪkʃənɛri", "Từ điển"));
        tuDien.put("Computer", new PhienAm("kəmˈpjuːtər", "Máy tính"));
        tuDien.put("Programming", new PhienAm("ˈproʊˌɡræmɪŋ", "Lập trình"));
        tuDien.put("Language", new PhienAm("ˈlæŋɡwɪdʒ", "Ngôn ngữ"));
        tuDien.put("Mouse", new PhienAm("maʊs", "Chuột (máy tính)"));
        tuDien.put("Keyboard", new PhienAm("ˈkiːˌbɔːrd", "Bàn phím"));
        tuDien.put("Screen", new PhienAm("skriːn", "Màn hình"));
    }

    public void TimKiem(){
        String searchKey = textFieldSearch.getText().trim();
        PhienAm result = tuDien.get(searchKey);
        if (result != null) {
            textAreaPhienAm.setText(result.getPhienam());
            textAreaNghia.setText(result.getNghia());
        } else {
            textAreaPhienAm.setText("Không tìm thấy");
            textAreaNghia.setText("Không tìm thấy");
        }
    }

    public void ThemTu() throws IOException {
            Stage currentStage = (Stage) textFieldSearch.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("themtu-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            currentStage.close();
    }
}
