package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class RegisterController {

    @FXML
    private TextField tb_username;

    @FXML
    private PasswordField tb_password1;

    @FXML
    private PasswordField tb_password2;

    @FXML
    private ImageView iv_image;

    @FXML
    private Button bt_cancel;

    @FXML
    private Button bt_selectImage;

    @FXML
    private Button bt_register;

    @FXML
    void accept(ActionEvent event) {

    }

    @FXML
    void cancel(ActionEvent event) throws IOException {
        screenLoader.loadScreen("login.fxml",
                (Stage) ((Node) event.getSource()).getScene().getWindow());
    }

    @FXML
    void selectImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select profile picture");
        File file = fileChooser.showOpenDialog(null);

        Path path;
        if (file != null)
            path = file.toPath();
        else
            path = null;

        iv_image.setImage(new Image((InputStream) path));
    }

}
