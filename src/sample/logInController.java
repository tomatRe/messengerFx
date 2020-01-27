package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class logInController {

    @FXML
    private TextField tb_username;

    @FXML
    private PasswordField tb_password;

    @FXML
    private Hyperlink bt_register;

    @FXML
    private Button bt_login;

    @FXML
    private Button bt_exit;

    @FXML
    void exit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void logIn(ActionEvent event) {
        //TODO
    }

    @FXML
    void register(ActionEvent event) throws IOException {
        screenLoader.loadScreen("register.fxml",
                (Stage) ((Node) event.getSource()).getScene().getWindow());
    }
}
