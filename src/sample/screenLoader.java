package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class screenLoader {
    public static void loadScreen(String viewPath, Stage stage) throws IOException {
        Parent view = FXMLLoader.load(screenLoader.class.getResource(viewPath));
        Scene view1Scene = new Scene(view);
        stage.hide();
        stage.setScene(view1Scene);
        stage.show();
    }
}