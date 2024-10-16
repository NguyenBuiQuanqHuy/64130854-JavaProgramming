package com.example.api;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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
                URL url = new URL("https://pokeapi.co/api/v2/pokemon/"+api);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");


                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = br.readLine()) != null) {
                    content.append(inputLine);
                }
                br.close();
                connection.disconnect();

                // Hiển thị kết quả trên giao diện JavaFX
                String jsonString = content.toString();
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(jsonString);

                //Lấy thông tin
                String pokemonName =(String) jsonObject.get("name");
                long weight= (long) jsonObject.get("weight");
                long height= (long) jsonObject.get("height");

                //Lấy loại pokemon
                StringBuilder types =new StringBuilder("Types: ");
                JSONArray typeArray =(JSONArray) jsonObject.get("types");
                for (Object typeObject : typeArray){
                    JSONObject type =(JSONObject) ((JSONObject) typeObject).get("type");
                    types.append(type.get("name")).append(" ");
                }

                txtAreaThongTin.setText("Name: " + pokemonName + "\nWeight: " + weight + "\nHeight: " + height + "\n" + types);
            }catch (Exception e){
                txtAreaThongTin.setText("Exception in NetClientGet:- " + e);
            }


    }
}
