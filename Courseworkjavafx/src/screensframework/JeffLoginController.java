package screensframework;

import ConnectionDB.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JeffLoginController {

    @FXML private TextField AdminUsername;
    @FXML private PasswordField AdminPassword;
    public Label isConnected;

    @FXML private void LoginJeff(ActionEvent event) throws SQLException,IOException {
        ConnectionClass connectionClass = new ConnectionClass(); // connect with db
        Connection connection = connectionClass.getConnection();

        try {
            // check whether db details and user input details are matching
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM Admindetails WHERE AdminUsername = '" + AdminUsername.getText() + "' AND AdminPassword = '" + AdminPassword.getText() + "';";
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                isConnected.setText("Login Successful!");

                // display confirmation alert box
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Validate Login of Admin");
                alert.setHeaderText(null);
                alert.setContentText("Jeff, You Have Successfully Login to System!");
                alert.showAndWait();

                Parent AloginformParent = FXMLLoader.load(getClass().getResource("AfterJEFFLogin.fxml"));
                Scene AloginformScene = new Scene(AloginformParent);

                // this line gets the satge information
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("Staff Requirements Application");
                window.setScene(AloginformScene);
                window.show();

            } else {
                isConnected.setText("Incorrect Password or Username");

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Validate Login of Admin");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect Password or Username, Try Again !!");
                alert.showAndWait();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
