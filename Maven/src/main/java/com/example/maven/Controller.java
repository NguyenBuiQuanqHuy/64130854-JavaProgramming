package com.example.maven;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.json.simple.JSONObject;

public class Controller {
    @FXML
    TextField txtMaSV,txtName,txtDob;
    @FXML
    TextArea textAreaThongtin;
    public void Add(){
        String MaSV=txtMaSV.getText();
        String hoten=txtName.getText();
        String DoB=txtDob.getText();

        JSONObject jsonStudent =new JSONObject();
        jsonStudent.put("Mã SV",MaSV);
        jsonStudent.put("Họ tên SV",hoten);
        jsonStudent.put("Năm sinh",DoB);
        textAreaThongtin.setText(jsonStudent.toJSONString());
    }

    public void Reload(ActionEvent event){

    }

    public void Save(ActionEvent event){

    }
}
