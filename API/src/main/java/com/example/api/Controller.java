package com.example.api;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class Controller {
    @FXML
    TextField txtAPI;
    @FXML
    TextArea txtAreaThongTin;

    public void ThongTin() throws IOException {
        String api = txtAPI.getText();
        if (api == null || api.isEmpty()) {
            txtAreaThongTin.setText("Please enter a valid URL.");
        }

            try {
                URL url = new URL(api);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");


                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = br.readLine()) != null) {
                    txtAreaThongTin.setText(inputLine);
                }
                connection.disconnect();

                // Hiển thị kết quả trên giao diện JavaFX


            }catch (Exception e){
                txtAreaThongTin.setText("Exception in NetClientGet:- " + e);
            }


    }
}
