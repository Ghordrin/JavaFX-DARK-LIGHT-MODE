package JavaFX_CSS_MODES;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Example of color modes");
        primaryStage.setResizable(false);
        Scene scene = new Scene(root, 1200, 850);
        scene.getStylesheets().add(getClass().getResource("Stylesheets/normalmode.css").toExternalForm());


        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.UNDECORATED);


        primaryStage.show();

    }


}
