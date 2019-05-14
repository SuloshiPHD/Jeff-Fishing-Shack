package screensframework;

import ConnectionDB.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaffLoginControl {

    @FXML private TextField Staffusername;
    @FXML private PasswordField Staffpassword;
    public Label isConnected;

    @FXML private void setStaffLoginButton(ActionEvent event) throws SQLException,IOException {
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();
//compare the details with db and verify login for staff
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM Staffdetails WHERE StaffUsername = '" + Staffusername.getText() + "' AND StaffPassword = '" + Staffpassword.getText() + "';";
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                isConnected.setText("Login Successful!");

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Validate Login of Staff");
                alert.setHeaderText(null);
                alert.setContentText(" You Have Successfully Login to System!");
                alert.showAndWait();
                Parent AloginformParent = FXMLLoader.load(getClass().getResource("AfterStaff.fxml"));

                Scene AloginformScene = new Scene(AloginformParent);

                // this line gets the satge information
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("User Requirements Application");
                window.setScene(AloginformScene);
                window.show();

            } else {
                isConnected.setText("Incorrect Password or Username");

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Validate Login of Staff");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect Password or Username, Try Again !!");
                alert.showAndWait();
            }
         //staff details were added by owner (previously

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
