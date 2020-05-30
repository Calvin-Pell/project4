package View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import mod.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    //INSTANCE VARIABLES
    @FXML
    private GridPane picGrid;
    @FXML
    private ImageView almeidaPic;
    @FXML
    private ImageView barretoPic;
    @FXML
    private ImageView delrioPic;
    @FXML
    private ImageView escobedoPic;
    @FXML
    private ImageView forjanPic;
    @FXML
    private ImageView jaureguiPic;
    @FXML
    private ImageView martinezPic;
    @FXML
    private ImageView oteroPic;
    @FXML
    private ImageView ricoPic;
    @FXML
    private ImageView sirvenPic;
    @FXML
    private MenuButton menu;
    @FXML
    private Label answerLab;
    @FXML
    private Button guessBtn;
    @FXML
    private Label topLab;
    @FXML
    private HBox topBox;
    @FXML
    private Button hairBtn;
    @FXML
    private Button faceBtn;
    @FXML
    private Button clothesBtn;
    @FXML
    private VBox hairBox;
    @FXML
    private Label hairLab;
    @FXML
    private RadioButton brownHair;
    @FXML
    private RadioButton blackHair;
    @FXML
    private RadioButton grayHair;
    @FXML
    private RadioButton blondeHair;
    @FXML
    private Button hairFinishBtn;
    @FXML
    private Button hairBackBtn;
    @FXML
    private VBox faceBox;
    @FXML
    private Label faceLab;
    @FXML
    private RadioButton beard;
    @FXML
    private RadioButton glasses;
    @FXML
    private Button faceFinishBtn;
    @FXML
    private Button faceBackBtn;
    @FXML
    private VBox clothesBox;
    @FXML
    private Label clothesLab;
    @FXML
    private RadioButton polo;
    @FXML
    private RadioButton formal;
    @FXML
    private RadioButton casual;
    @FXML
    private Button clothesFinishBtn;
    @FXML
    private Button clothesBackBtn;
    private Picture almeida;
    private Picture barreto;
    private Picture delrio;
    private Picture escobedo;
    private Picture forjan;
    private Picture jauregui;
    private Picture martinez;
    private Picture otero;
    private Picture rico;
    private Picture sirven;
    private Picture[] pictures = new Picture[10];
    private Picture correctPic;


    /*
     *Initializes all of the Picture and ImageView instance variables to be the pictures of the
     * appropriate people and determines randomly which picture is the correct picture for the player
     * to guess.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        almeida = new Picture("Almeida.jpg", "none", "gray", "casual");
        barreto = new Picture("Barreto.jpg", "beard", "black", "formal");
        delrio = new Picture("Delrio.jpg", "beard", "brown", "polo");
        escobedo = new Picture("Escobedo.jpg", "none", "black", "casual");
        forjan = new Picture("Forjan.jpg", "glasses", "blonde", "polo");
        jauregui = new Picture("Jauregui.jpg", "none", "brown", "casual");
        martinez = new Picture("Martinez.jpg", "none", "black", "polo");
        otero = new Picture("Otero.jpg", "glasses", "black", "casual");
        rico = new Picture("Rico.jpg", "beard", "black", "polo");
        sirven = new Picture("Sirven.jpg", "none", "gray", "formal");

        almeidaPic.setImage(new Image(almeida.getImage()));
        barretoPic.setImage(new Image(barreto.getImage()));
        delrioPic.setImage(new Image(delrio.getImage()));
        escobedoPic.setImage(new Image(escobedo.getImage()));
        forjanPic.setImage(new Image(forjan.getImage()));
        jaureguiPic.setImage(new Image(jauregui.getImage()));
        martinezPic.setImage(new Image(martinez.getImage()));
        oteroPic.setImage(new Image(otero.getImage()));
        ricoPic.setImage(new Image(rico.getImage()));
        sirvenPic.setImage(new Image(sirven.getImage()));

        pictures[0] = almeida;
        pictures[1] = barreto;
        pictures[2] = delrio;
        pictures[3] = escobedo;
        pictures[4] = forjan;
        pictures[5] = jauregui;
        pictures[6] = martinez;
        pictures[7] = otero;
        pictures[8] = rico;
        pictures[9] = sirven;
        Random r = new Random();
        correctPic = pictures[r.nextInt(10)];

        hairBox.setVisible(false);
    }

    /*
     *Exits the program and stops it from continuing to run.
     */
    @FXML
    private void exit() {
        System.exit(0);
    }

    /*
     *Displays the help screen for the user, which tells them how to play the game.
     */
    @FXML
    private void help() {
        JOptionPane.showMessageDialog(null, "You must ask questions in order to determine the who is the correct person \n \n To do that, you must first choose the topic of your question, then choose what specifically your question will be \n \n There are four hair colors to choose from, black, brown, grey, and blonde(any amount of gray counts as gray) \n \n There are two facial features you can ask about. You can ask if the correct person has a beard or if they have glasses \n \n There are three types of clothing you can ask about \n \n Polo means they are wearing a polo shirt. Formal means they are wearing a suit and tie. Casual includes anything else \n \n When you think you know who the answer is, click the button at the bottom to submit your guess");
    }

    /*
     *Hides the buttons for selecting the topic group and reveals the buttons for selecting exactly
     * which hair feature to ask a question about.
     */
    @FXML
    private void showHairTopic() {
        topBox.setVisible(false);
        topLab.setVisible(false);
        hairBox.setVisible(true);
    }

    /*
     *Hides the buttons for selecting the topic group and reveals the buttons for selecting exactly
     * which face feature to ask a question about.
     */
    @FXML
    private void showFaceTopic() {
        topBox.setVisible(false);
        topLab.setVisible(false);
        faceBox.setVisible(true);
    }

    /*
     *Hides the buttons for selecting the topic group and reveals the buttons for selecting exactly
     * which clothes feature to ask a question about.
     */
    @FXML
    private void showClothesTopic() {
        topBox.setVisible(false);
        topLab.setVisible(false);
        clothesBox.setVisible(true);
    }

    /*
     *Hides the buttons for asking a question about a hair feature and shows the buttons for deciding
     * which topic group to ask about.
     */
    @FXML
    private void showTopicsFromHair() {
        hairBox.setVisible(false);
        topBox.setVisible(true);
        topLab.setVisible(true);
    }

    /*
     *Hides the buttons for asking a question about a face feature and shows the buttons for deciding
     * which topic group to ask about.
     */
    @FXML
    private void showTopicsFromFace() {
        faceBox.setVisible(false);
        topBox.setVisible(true);
        topLab.setVisible(true);
    }

    /*
     *Hides the buttons for asking a question about a clothes feature and shows the buttons for deciding
     * which topic group to ask about.
     */
    @FXML
    private void showTopicsFromClothes() {
        clothesBox.setVisible(false);
        topBox.setVisible(true);
        topLab.setVisible(true);
    }

    /*
     *Determines if the hair feature asked about matches the correct picture and eliminates all pictures
     * that do not have the same color as the correct picture.
     */
    @FXML
    private void askHairQuestion() {
        if(brownHair.isSelected()) {
            if(correctPic.getHairColor().equals("brown")) {
                answerLab.setText("The correct person has brown hair");
                answerLab.setVisible(true);
                eliminatePics("brown", true);
                showTopicsFromHair();
            }
            else{
                answerLab.setText("The correct person does not have brown hair");
                answerLab.setVisible(true);
                eliminatePics("brown", false);
                showTopicsFromHair();
            }
        }
        else if(blackHair.isSelected()) {
            if(correctPic.getHairColor().equals("black")) {
                answerLab.setText("The correct person has black hair");
                answerLab.setVisible(true);
                eliminatePics("black", true);
                showTopicsFromHair();
            }
            else {
                answerLab.setText("The correct person does not have black hair");
                answerLab.setVisible(true);
                eliminatePics("black", false);
                showTopicsFromHair();
            }
        }
        else if(grayHair.isSelected()) {
            if(correctPic.getHairColor().equals("gray")) {
                answerLab.setText("The correct person has gray hair");
                answerLab.setVisible(true);
                eliminatePics("gray", true);
                showTopicsFromHair();
            }
            else {
                answerLab.setText("The correct person does not have gray hair");
                answerLab.setVisible(true);
                eliminatePics("gray", false);
                showTopicsFromHair();
            }
        }
        else if(blondeHair.isSelected()) {
            if(correctPic.getHairColor().equals("blonde")) {
                answerLab.setText("The correct person has blonde hair");
                answerLab.setVisible(true);
                eliminatePics("blonde", true);
                showTopicsFromHair();
            }
            else {
                answerLab.setText("The correct person does not have blonde hair");
                answerLab.setVisible(true);
                eliminatePics("blonde", false);
                showTopicsFromHair();
            }
        }
    }

    /*
     *Determines if the face feature asked about matches the correct picture and eliminates all pictures
     * that do not have the same face feature as the correct picture.
     */
    @FXML
    private void askFaceQuestion() {
        if(beard.isSelected()) {
            if(correctPic.getFace().equals("beard")) {
                answerLab.setText("The correct person has a beard");
                answerLab.setVisible(true);
                eliminatePics("beard", true);
                showTopicsFromFace();
            }
            else {
                answerLab.setText("The correct person does not have a beard");
                answerLab.setVisible(true);
                eliminatePics("beard", false);
                showTopicsFromFace();
            }
        }
        else if(glasses.isSelected()) {
            if(correctPic.getFace().equals("glasses")) {
                answerLab.setText("The correct person has glasses");
                answerLab.setVisible(true);
                eliminatePics("glasses", true);
                showTopicsFromFace();
            }
            else {
                answerLab.setText("The correct person does not have glasses");
                answerLab.setVisible(true);
                eliminatePics("glasses", false);
                showTopicsFromFace();
            }
        }
    }

    /*
     *Determines if the clothes type asked about matches the correct picture and eliminates all pictures
     * that do not have the same clothes type as the correct picture.
     */
    @FXML
    private void askClothesQuestion() {
        if(polo.isSelected()) {
            if(correctPic.getClothes().equals("polo")) {
                answerLab.setText("The correct person has a polo");
                answerLab.setVisible(true);
                eliminatePics("polo", true);
                showTopicsFromClothes();
            }
            else {
                answerLab.setText("The correct person does not have a polo");
                answerLab.setVisible(true);
                eliminatePics("polo", false);
                showTopicsFromClothes();
            }
        }
        else if(formal.isSelected()) {
            if(correctPic.getClothes().equals("formal")) {
                answerLab.setText("The correct person has formal clothes");
                answerLab.setVisible(true);
                eliminatePics("formal", true);
                showTopicsFromClothes();
            }
            else {
                answerLab.setText("The correct person does not have formal clothes");
                answerLab.setVisible(true);
                eliminatePics("formal", false);
                showTopicsFromClothes();
            }
        }
        else if(casual.isSelected()) {
            if(correctPic.getClothes().equals("casual")) {
                answerLab.setText("The correct person has casual clothes");
                answerLab.setVisible(true);
                eliminatePics("casual", true);
                showTopicsFromClothes();
            }
            else {
                answerLab.setText("The correct person does not have formal clothes");
                answerLab.setVisible(true);
                eliminatePics("casual", false);
                showTopicsFromClothes();
            }
        }
    }

    /*
     *Eliminates all pictures that have the specified trait if isCorrect is false, and eliminates all
     * pictures that do not have the specified trait if isCorrect is true, then refreshes all of the
     *  pictures.
     */
    private void eliminatePics(String trait, boolean isCorrect) {
        if(isCorrect) {
            for(int i = 0; i < pictures.length; i++) {
                if(trait.equals("brown") || trait.equals("black") || trait.equals("gray") || trait.equals("blonde")) {
                    if(!pictures[i].getHairColor().equals(trait)) {
                        pictures[i].eliminate();
                    }
                }
                if(trait.equals("beard") || trait.equals("glasses")) {
                    if(!pictures[i].getFace().equals(trait)) {
                        pictures[i].eliminate();
                    }
                }
                if(trait.equals("polo") || trait.equals("formal") || trait.equals("casual")) {
                    if(!pictures[i].getClothes().equals(trait)) {
                        pictures[i].eliminate();
                    }
                }
            }
        }
        else {
            for(int i = 0; i < pictures.length; i++) {
                if(trait.equals("brown") || trait.equals("black") || trait.equals("gray") || trait.equals("blonde")) {
                    if(pictures[i].getHairColor().equals(trait)) {
                        pictures[i].eliminate();
                    }
                }
                if(trait.equals("beard") || trait.equals("glasses")) {
                    if(pictures[i].getFace().equals(trait)) {
                        pictures[i].eliminate();
                    }
                }
                if(trait.equals("polo") || trait.equals("formal") || trait.equals("casual")) {
                    if(pictures[i].getClothes().equals(trait)) {
                        pictures[i].eliminate();
                    }
                }
            }
        }

        almeidaPic.setImage(new Image(almeida.getImage()));
        barretoPic.setImage(new Image(barreto.getImage()));
        delrioPic.setImage(new Image(delrio.getImage()));
        escobedoPic.setImage(new Image(escobedo.getImage()));
        forjanPic.setImage(new Image(forjan.getImage()));
        jaureguiPic.setImage(new Image(jauregui.getImage()));
        martinezPic.setImage(new Image(martinez.getImage()));
        oteroPic.setImage(new Image(otero.getImage()));
        ricoPic.setImage(new Image(rico.getImage()));
        sirvenPic.setImage(new Image(sirven.getImage()));
    }

    /*
     *Refreshes the scene and stage to show the end screen using end.fxml. Also passes the correct
     * picture as a parameter to the controller of the end scene.
     */
    public void guess(javafx.event.ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("End.fxml"));
        Parent endParent = loader.load();
        Scene endScene = new Scene(endParent);

        EndController endCont = loader.getController();
        endCont.getAnswer(correctPic);

        Stage endStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        endStage.setScene(endScene);
        endStage.setAlwaysOnTop(true);
        endStage.show();
    }
}