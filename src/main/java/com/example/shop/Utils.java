package com.example.shop;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

abstract public class Utils {

    public static void updateScene(String fileName, Node source) throws IOException {
        Parent rootObject = new FXMLLoader(App.class.getResource(fileName)).load();
        Stage stage = (Stage)(((Node) source).getScene().getWindow());
        Scene sceneObject = new Scene(rootObject);
        stage.setScene(sceneObject);
        stage.show();
    }

}
