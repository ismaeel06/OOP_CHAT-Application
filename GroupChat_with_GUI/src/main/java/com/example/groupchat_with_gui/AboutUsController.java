package com.example.groupchat_with_gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class AboutUsController {

    @FXML
    private Button BackBtn;

    @FXML
    void GoBack(MouseEvent event) throws IOException {
        Main.setRoot("Menu");
    }

}
