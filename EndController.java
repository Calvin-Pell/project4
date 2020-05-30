package View;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import mod.Picture;
import java.net.URL;
import java.util.ResourceBundle;

public class EndController implements Initializable {

    //INSTANCE VARIABLES
    @FXML
    private AnchorPane anchor;
    @FXML
    private Label guessLab;
    @FXML
    private TextField guessField;
    @FXML
    private Label winLab;
    @FXML
    private Label ansLab;
    @FXML
    private ImageView ansPic;
    @FXML
    private Button exitBtn;
    private Picture answer;
    private String guess;

    /*
     *Method implemented from the Initializable interface.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    /*
     *Sets ansPic to be th picture of the correct person, makes winLab tell the user whether or not they won,
     * and makes ansLab tell the user who the correct person is.
     */
    @FXML
    private void fillEnd() {
        guess = guessField.getText();
        if(guess.equalsIgnoreCase(answer.getName())) {
            winLab.setText("You Won!!!!!!!1!!");
        }
        else {
            winLab.setText("You Lost. You're Bad.");
        }
        winLab.setVisible(true);
        ansPic.setImage(new Image(answer.getImage()));

        ansLab.setText("The correct answer is: " + answer.getName());
        ansLab.setVisible(true);
    }

    /*
     *Initializes the answer variable to be equal to the parameter.
     */
    public void getAnswer(Picture answer) {
        this.answer = answer;
    }

    /*
     *Exits the program and stops it from running.
     */
    @FXML
    private void exit() {
        System.exit(0);
    }
}
