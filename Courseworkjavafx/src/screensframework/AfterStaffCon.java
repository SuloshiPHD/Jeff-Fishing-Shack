package screensframework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AfterStaffCon {

  // this method cant be access by any other classes
    @FXML
    private void checkTransaction(ActionEvent event)throws IOException{
        // this method loads check transactions form
        Parent AloginformParent = FXMLLoader.load(getClass().getResource("Check transactions.fxml"));
        Scene AloginformScene = new Scene(AloginformParent);

        // this line gets the satge information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Check transactions Application");
        window.setScene(AloginformScene);
        window.show();
    }

    @FXML private void checkEnq(ActionEvent event)throws IOException {
        Parent AloginformParent = FXMLLoader.load(getClass().getResource("CustomerQry.fxml"));

        Scene AloginformScene = new Scene(AloginformParent);

        // this line gets the satge information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Staff Requirements Application");
        window.setScene(AloginformScene);
        window.show();
    }
}
