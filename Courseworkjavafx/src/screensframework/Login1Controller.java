package screensframework;

import ConnectionDB.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Login1Controller{
    public Button loginButton;
    @FXML
    private TextField username;
    @FXML
    private PasswordField userpassword;
    public Label isConnected;


    @FXML
    private void setLoginButton(ActionEvent event) throws SQLException,IOException {

       // connects with db
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();
        try {
            //comparing registraion email and password with login username and password
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM Registrationdetails WHERE Email = '" + username.getText() + "' AND Password = '" + userpassword.getText() + "';";
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                isConnected.setText("Login Successful!");
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Valid Password");
                alert.setHeaderText(null);
                alert.setContentText("Login Successful!");
                alert.showAndWait();

                Parent AloginformParent = FXMLLoader.load(getClass().getResource("Afterlogin.fxml"));
                Scene AloginformScene = new Scene(AloginformParent);
                // this line gets the satge information
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setTitle("User Requirements Application");
                window.setScene(AloginformScene);
                window.show();

            } else {
                isConnected.setText("Incorrect Password or Username");
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Validation Password");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect Password or Username!!");
                alert.showAndWait();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

