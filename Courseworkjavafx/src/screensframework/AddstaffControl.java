package screensframework;

import ConnectionDB.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddstaffControl {
    // use encapsulation for variables
    @FXML private TextField Staffusername;
    @FXML private PasswordField Staffpassword;

    // this method allow owner to add staff members and insert their details to database
    @FXML private void AddStaffButton(ActionEvent event) throws SQLException,IOException {
          //connect to the database
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();


        PreparedStatement stm = connection.prepareStatement("INSERT INTO Staffdetails(StaffUsername,StaffPassword)VALUES(?,? )");
        stm.setString(1, Staffusername.getText());
        stm.setString(2, Staffpassword.getText());
        stm.executeUpdate();

        //display confirmation message
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm adding Staff");
        alert.setHeaderText(null);
        alert.setContentText("You have Successfully add a member to the system!!");
        alert.showAndWait();

        //loads next form
        Parent AloginformParent = FXMLLoader.load(getClass().getResource("AfterJeffLogin.fxml"));
        Scene AloginformScene = new Scene(AloginformParent);
        // this line gets the satge information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Staff Requirements Application");
        window.setScene(AloginformScene);
        window.show();

    }
}
