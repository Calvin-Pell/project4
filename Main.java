package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /*
     *Creates a stage and a scene that is used to show the Intro screen using Intro.fxml.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Intro.fxml"));
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }


    /*
     *Runs the start method when the program is run.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
