module server {
    requires javafx.controls;
    requires javafx.fxml;
    requires client;

    opens server.app to javafx.fxml;
    exports server.app to javafx.graphics;
}