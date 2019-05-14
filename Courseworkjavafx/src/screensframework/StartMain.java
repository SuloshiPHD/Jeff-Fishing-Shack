package screensframework;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// use extends as inheritance-Startmain extends application
    public class  StartMain extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
            primaryStage.setTitle("Welcome Form FXML Application");
            primaryStage.setScene(new Scene(root, 500, 450));
            primaryStage.show();
        }

          // main method
        public static void main(String[] args) {
            launch(args);

        }
    }


