package com.example.client_for_chatappwithgui;

import javafx.scene.layout.VBox;

import java.io.*;
import java.net.Socket;

public class Client {
private Socket socket;
private BufferedReader bufferedReader;
private BufferedWriter bufferedWriter;

public Client(Socket socket) {
    try {
        this.socket = socket;
        this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }catch(IOException e){
        System.out.println("Error Creating Client.");
        e.printStackTrace();
        closeEverything(socket,bufferedReader,bufferedWriter);

    }
}

public void sendMessageToServer(String messageToServer){
    try {
        bufferedWriter.write(messageToServer);
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }catch (IOException e){
        e.printStackTrace();
        System.out.println("Error sending message to the client");
        closeEverything(socket,bufferedReader,bufferedWriter);
    }
}

public void receiveMessageFromServer(VBox vbox){
    new Thread(new Runnable() {
        @Override
        public void run() {
            while(socket.isConnected()) {
                try {
                    String messageFromClient = bufferedReader.readLine();
                    HelloController.addLabel(messageFromClient, vbox);
                }catch (IOException e){
                    e.printStackTrace();
                    System.out.println("Error receiving message from Client");
                    closeEverything(socket,bufferedReader,bufferedWriter);
                    break;
                }
            }
        }
    }).start();
}
    public void closeEverything(Socket socket,BufferedReader bufferedReader,BufferedWriter bufferedWriter){
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if(bufferedWriter != null){
                bufferedWriter.close();
            }
            if(socket != null){
                socket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
