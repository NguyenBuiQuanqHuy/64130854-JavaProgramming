package com.example.pheptinh;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CalculateController {
    @FXML
    TextField txtA,txtB;
    @FXML
    TextArea textAreaKQ;

    float a,b;
    String c;
    @FXML
   private void Cong(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(a + b);
        textAreaKQ.setText(c);
    }

    @FXML
    private void Tru(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(a - b);
        textAreaKQ.setText(c);
    }

    @FXML
    private void Nhan(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(a * b);
        textAreaKQ.setText(c);
    }

    @FXML
    private void Chia(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(a / b);
        textAreaKQ.setText(c);
    }

    @FXML
    private void Can(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(Math.sqrt(a));
        String d=String.valueOf(Math.sqrt(b));
        textAreaKQ.setText("sqrt("+a+")= "+c+"\n"+"sqrt("+b+")= "+d);
    }

    @FXML
    private void Sin(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(Math.sin(a));
        String d=String.valueOf(Math.sin(b));
        textAreaKQ.setText("sin("+a+")= "+c+"\n"+"sin("+b+")= "+d);
    }

    @FXML
    private void Cos(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(Math.cos(a));
        String d=String.valueOf(Math.cos(b));
        textAreaKQ.setText("cos("+a+")= "+c+"\n"+"cos("+b+")= "+d);
    }

    @FXML
    private void Exp(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(Math.exp(a));
        String d=String.valueOf(Math.exp(b));
        textAreaKQ.setText("exp("+a+")= "+c+"\n"+"exp("+b+")= "+d);
    }

    @FXML
    private void Ln(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(Math.log10(a));
        String d=String.valueOf(Math.log10(b));
        textAreaKQ.setText("log10("+a+")= "+c+"\n"+"log10("+b+")= "+d);
    }

    @FXML
    private void Log(){
        a = Float.parseFloat(txtA.getText().toString());
        b = Float.parseFloat(txtB.getText().toString());
        c = String.valueOf(Math.log(a));
        String d=String.valueOf(Math.log(b));
        textAreaKQ.setText("log("+a+")= "+c+"\n"+"log("+b+")= "+d);
    }
}
