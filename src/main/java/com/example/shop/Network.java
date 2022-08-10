package com.example.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Network {

    HttpURLConnection connection;
    URL url;

    BufferedReader input;


    public Network(String url) {
        try {
            this.url = new URL(url);
            connection = (HttpURLConnection) this.url.openConnection();
            connection.setRequestMethod("GET");

            input = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = input.readLine()) != null) {
                content.append(inputLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void prepareEntranceData(StringBuilder jsonData) {

    }

    protected void makeRequest(String url) {

    }



}
