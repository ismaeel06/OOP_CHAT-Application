package com.example.client_for_chatappwithgui;

import com.example.client_for_chatappwithgui.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class AboutUsController {

    @FXML
    private Button BackBtn;

    @FXML
    void GoBack(MouseEvent event) throws IOException {
        HelloApplication.setRoot("Menu");
    }

}
