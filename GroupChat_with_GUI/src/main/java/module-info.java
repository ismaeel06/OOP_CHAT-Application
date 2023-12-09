module com.example.groupchat_with_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.groupchat_with_gui to javafx.fxml;
    exports com.example.groupchat_with_gui;
}