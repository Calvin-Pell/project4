package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class IntroController implements Initializable {

    //INSTANCE VARIABLES
    @FXML
    private AnchorPane anchor;
    @FXML
    private GridPane grid;
    @FXML
    private Button play;
    @FXML
    private Label title;
    @FXML
    private Label text;

    /*
     *Method implemented from the Initializable interface.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    /*
     *Refreshes the stage and scene with the main game screen using Game.fxml.
     */
    public void play(ActionEvent event) throws Exception {
        Parent gameParent = FXMLLoader.load(getClass().getResource("Game.fxml"));
        Scene gameScene = new Scene(gameParent);

        Stage gameStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        gameStage.setScene(gameScene);
        gameStage.setAlwaysOnTop(true);
        gameStage.show();
    }
}
