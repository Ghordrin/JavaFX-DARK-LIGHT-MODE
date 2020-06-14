package JavaFX_CSS_MODES;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("State Machine");
        primaryStage.setResizable(false);
        Scene scene = new Scene(root, 1200, 850);
        scene.getStylesheets().add("Stylesheets/normalmode.css");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
