module com.example.client_for_chatappwithgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.client_for_chatappwithgui to javafx.fxml;
    exports com.example.client_for_chatappwithgui;
}