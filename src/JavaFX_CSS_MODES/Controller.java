package JavaFX_CSS_MODES;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {

    @FXML
    private Label lblCurrentState;

    @FXML
    private Button btnNormalMode;

    @FXML
    private Button btnBlueMode;

    @FXML
    private Button btnDarkMode;


    public void Close() {
        System.exit(0);
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
