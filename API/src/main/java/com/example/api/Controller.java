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
                // Lấy khả năng (abilities)
                StringBuilder abilities = new StringBuilder("Abilities: ");
                JSONArray abilitiesArray = (JSONArray) jsonObject.get("abilities");
                for (Object abilityObject : abilitiesArray) {
                    JSONObject ability = (JSONObject) ((JSONObject) abilityObject).get("ability");
                    abilities.append(ability.get("name")).append(" ");
                }

                // Lấy chỉ số (stats)
                StringBuilder stats = new StringBuilder("Stats:\n");
                JSONArray statsArray = (JSONArray) jsonObject.get("stats");
                for (Object statObject : statsArray) {
                    JSONObject stat = (JSONObject) statObject;
                    JSONObject statInfo = (JSONObject) stat.get("stat");
                    stats.append(statInfo.get("name")).append(": ").append(stat.get("base_stat")).append("\n");
                }

                // Lấy hình ảnh (sprites)
                JSONObject sprites = (JSONObject) jsonObject.get("sprites");
                String frontSprite = (String) sprites.get("front_default");

                // Hiển thị thông tin trong TextArea
                txtAreaThongTin.setText("Name: " + pokemonName +
                        "\nWeight: " + weight +
                        "\nHeight: " + height +
                        "\n" + types +
                        "\n" + abilities +
                        "\n" + stats +
                        "\nSprite: " + frontSprite);
            }catch (Exception e){
                txtAreaThongTin.setText("Exception in NetClientGet:- " + e);
            }


    }
}
