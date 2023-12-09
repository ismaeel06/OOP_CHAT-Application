package com.example.groupchat_with_gui;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MainController {

    @FXML
    private Button StartChattingBtn;
    @FXML
    private Button AboutUsBtn;
    @FXML
    private Button Exit;


    @FXML
    void connect(MouseEvent event) throws IOException {
            Main.setRoot("View");

        }
    @FXML
    void ShowAboutUs(MouseEvent event) throws IOException {
            Main.setRoot("AboutUs");
    }
    @FXML
    void ExitApplication(MouseEvent event) {
           Platform.exit();
    }


}
