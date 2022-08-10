package com.example.shop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        loadUI(stage);

        stage.setTitle("CoffeeShop!");
        stage.getIcons().add(new Image(App.class.getResourceAsStream("img/coffee_cup.png")));
        Network networkData = new Network("http://127.0.0.1:8080");
    }

    private void loadUI(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("entrance-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("CoffeeShop!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}