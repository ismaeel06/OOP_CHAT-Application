package com.example.groupchat_with_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    private String filename;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Menu"),592,487);
        stage.setTitle("Server");
        stage.setScene(scene);
        stage.show();
    }

    public static FXMLLoader getFXMLLoader(String name) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(name));
        return fxmlLoader;
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public void changeScene(Scene scene)
    {
        this.scene = scene;
    }



    public static void main(String[] args) {
        launch();
    }
}