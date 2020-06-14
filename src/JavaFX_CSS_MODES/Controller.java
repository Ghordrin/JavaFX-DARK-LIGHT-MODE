package JavaFX_CSS_MODES;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Controller {
    private double xOffset = 0;
    private double yOffset = 0;


    @FXML
    private Label lblCurrentState;

    @FXML
    private Button btnNormalMode;

    @FXML
    private Button btnBlueMode;

    @FXML
    private Button btnDarkMode;

    @FXML
    private MenuBar menuBar;


    public void Close() {
        Platform.exit();
    }

    // Found this somewhere on Google TODO: Refactor this to perhaps something a little more up to date?
    public void about() throws URISyntaxException, IOException {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI("https://github.com/Yannick-Driessens"));
        }
    }

    public void draggableMenu() {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        menuBar.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        menuBar.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }


    public void DarkMode() {
        btnDarkMode.getScene().getStylesheets().clear();
        btnDarkMode.getScene().getStylesheets()
                .add(getClass()
                        .getResource("Stylesheets/darkmode.css")
                        .toExternalForm());
        lblCurrentState.setText("Current style: Dark");
    }

    public void NormalMode() {
        btnNormalMode.getScene().getStylesheets().clear();
        btnBlueMode.getScene().getStylesheets()
                .add(getClass()
                        .getResource("Stylesheets/normalmode.css")
                        .toExternalForm());
        lblCurrentState.setText("Current style: Blue");
        lblCurrentState.setText("Current style: Normal");

    }

    public void BlueMode() {
        btnDarkMode.getScene().getStylesheets().clear();
        btnBlueMode.getScene().getStylesheets()
                .add(getClass()
                        .getResource("Stylesheets/bluemode.css")
                        .toExternalForm());
        lblCurrentState.setText("Current style: Blue");
    }

}
