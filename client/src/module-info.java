module client {
    requires javafx.controls;
    requires javafx.fxml;

    opens client.app to javafx.fxml;
    exports client.app to javafx.graphics;
    exports client.app.wrappers;

}