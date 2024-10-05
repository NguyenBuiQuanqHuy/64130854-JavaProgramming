package com.example.bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    TextField txtCao, txtNang;
    @FXML
    Label lbKQ;
    public void KiemTra(){
        float ChieuCao= Float.parseFloat(txtCao.getText());
        float CanNang= Float.parseFloat(txtNang.getText());
        try {
            float bmi=CanNang/(ChieuCao*ChieuCao);
            if(bmi<18.5f){
                lbKQ.setText("Thiếu Cân");
            } else if (bmi>=18.5f && bmi <24.9f) {
                lbKQ.setText("Bình Thường");
            } else if (bmi >=24.9f && bmi <29.9f) {
                lbKQ.setText("Thừa Cân");
            } else if (bmi>=29.9f) {
                lbKQ.setText("Béo Phì");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
