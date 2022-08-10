package com.example.shop.Controllers;

import com.example.shop.App;
import com.example.shop.Utils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class EntranceController {

    @FXML
    protected void openBaristaMenu(MouseEvent event) throws IOException {
        Utils.updateScene("barista-view.fxml", (Node) event.getSource());
    }

    @FXML
    protected void knockDoor(MouseEvent event) {
        System.out.println("knock-knock");
    }

}