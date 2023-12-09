package com.example.client_for_chatappwithgui;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.Optional;

public class Main_Controller {


    private static String input;
    @FXML
    private Button StartChattingBtn;
    @FXML
    private Button AboutUsBtn;

    @FXML
    private Button ExitBtn;

    @FXML
    void connect() throws IOException {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("IPV4 address");
        dialog.setHeaderText("Enter IP: ");

        Optional<String> result = dialog.showAndWait();

        if(result.isPresent())
        {

            input = result.get();
            dialog.close();
            HelloApplication.setRoot("hello-view");

        }


    }
    @FXML
    void ExitApplication(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    void ShowAboutUs(MouseEvent event) throws IOException {
        HelloApplication.setRoot("AboutUs");
    }

    public static String getIP()
    {
        return input;
    }
}
