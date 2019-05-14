package screensframework;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class AfterJEFFloginControl  {
 // use encapsualtion -only this class can acess this methods and variables
    @FXML private Button closeButton;
    @FXML private void viewLogFile (ActionEvent event)throws IOException {
    // this methods loads view log file
        Parent viewlogParent= FXMLLoader.load(getClass().getResource("ViewLogFile.fxml"));
        Scene viewlogScene=new Scene(viewlogParent);
        // this line gets the satge information
        Stage window=(Stage)((Node)event.getSource()).getScene ().getWindow();
        window.setTitle("View Log File Form FXML Application");
        window.setScene(viewlogScene);
        window.show();

    }
    @FXML private void viewReports(ActionEvent event) throws IOException {
        // this method loads view reports form
        Parent viewlogParent= FXMLLoader.load(getClass().getResource("ViewReport.fxml"));
        Scene viewlogScene=new Scene(viewlogParent);
        // this line gets the satge information
        Stage window=(Stage)((Node)event.getSource()).getScene ().getWindow();
        window.setTitle("View Report Form FXML Application");
        window.setScene(viewlogScene);
        window.show();
    }

    @FXML private void AddStaff(ActionEvent event)throws IOException {
        Parent addstaffParent= FXMLLoader.load(getClass().getResource("AddStaff.fxml"));
        Scene addstaffScene=new Scene(addstaffParent);
        // this line gets the satge information
        Stage window=(Stage)((Node)event.getSource()).getScene ().getWindow();
        window.setTitle("Add Staff Form FXML Application");
        window.setScene(addstaffScene);
        window.show();
    }

    @FXML private void performMore(ActionEvent event) throws IOException {
        Parent AloginformParent = FXMLLoader.load(getClass().getResource("AfterStaff.fxml"));
        Scene AloginformScene = new Scene(AloginformParent);
        // this line gets the satge information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Staff Requirements Application");
        window.setScene(AloginformScene);
        window.show();
    }


        @FXML
        private void closeButtonAction( ){
            // get a handle to the stage
            Stage stage = (Stage) closeButton.getScene().getWindow();
            // do what you have to do
            stage.close();

        }
 }

