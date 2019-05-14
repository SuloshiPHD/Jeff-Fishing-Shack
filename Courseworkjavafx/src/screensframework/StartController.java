package screensframework;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class StartController {
    /*
     * when this method is called, it will chang the scene to
     * a Registration Form
     *
     */
    @FXML private void registrationbutton(ActionEvent event) throws IOException {
        Parent regiformParent = FXMLLoader.load(getClass().getResource("Regifxml.fxml"));
        Scene regiformScene = new Scene(regiformParent);
        // this line gets the stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Registration Form FXML Application");
        window.setScene(regiformScene);
        window.show();
    }

    @FXML private void Loginbutton(ActionEvent event) throws IOException {
        Parent loginformParent = FXMLLoader.load(getClass().getResource("LoginFX.fxml"));
        Scene loginformScene = new Scene(loginformParent);

        // this line gets the satge information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Login Form FXML Application");
        window.setScene(loginformScene);
        window.show();
    }

    @FXML private void owner(ActionEvent event) throws IOException {
        Parent JeffloginformParent = FXMLLoader.load(getClass().getResource("JeffLogin.fxml"));
        Scene JeffloginformScene = new Scene(JeffloginformParent);
        // this line gets the satge information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Jeff Login Form FXML Application");
        window.setScene(JeffloginformScene);
        window.show();
    }

    @FXML private void staff(ActionEvent event) throws IOException {
        Parent staffloginformParent = FXMLLoader.load(getClass().getResource("StaffLogin.fxml"));
        Scene staffloginformScene = new Scene(staffloginformParent);

        // this line gets the satge information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Staff Login Form FXML Application");
        window.setScene(staffloginformScene);
        window.show();

    }
}



