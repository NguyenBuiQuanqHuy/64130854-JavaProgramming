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

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine).append("\n");
                }
                in.close();
                connection.disconnect();

                // Hiển thị kết quả trên giao diện JavaFX
                updateResultTextArea(content.toString());

            }catch (Exception e){
               
            }


    }
}
