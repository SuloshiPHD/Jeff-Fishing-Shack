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
import javafx.stage.Window;
import java.io.IOException;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegiController {

    @FXML
    private TextField FnameField;
    @FXML
    private TextField LnameField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField addressField;
    @FXML
    private Button submitButton;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws SQLException, IOException {
          //give alert message for empty fields

        Window owner = submitButton.getScene().getWindow();

        if(FnameField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your First name");
            return;
        }

        if(LnameField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your Last name");
            return;
        }

        if(emailField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your email id");
            return;
        }
        if(passwordField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter a password");
            return;

        }



        if(addressField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your Address ");
            return;
        }

     //invoking the validatepassword()method
        if(validatePassword()) {
            try {
                AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                        "Welcome " + FnameField.getText() + " " + LnameField.getText() + " to Jeff's Fishing Shack");
                RegiSubmitButton();
                Parent loginformParent1= FXMLLoader.load(getClass().getResource("LoginFX.fxml"));
                Scene loginformScene1=new Scene(loginformParent1);

                // this line gets the satge information
                Stage window=(Stage)((Node)event.getSource()).getScene ().getWindow();

                window.setScene(loginformScene1);
                window.show();

            } catch (Exception e) {
                  e.printStackTrace();
            }

        }else{

        }

    }
    @FXML private void RegiSubmitButton()throws SQLException{
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
// insert registartion details to database
                PreparedStatement stm = connection.prepareStatement("INSERT INTO Registrationdetails(FirstName,LastName,Email,Password,Address)VALUES(?,?,?,?,? )");
                stm.setString(1, FnameField.getText());
                stm.setString(2, LnameField.getText());
                stm.setString(3, emailField.getText());
                stm.setString(4, passwordField.getText());
                stm.setString(5, addressField.getText());
                stm.executeUpdate();

    }
         //validate password using a pattern
        private boolean validatePassword()  {
        Pattern p = Pattern.compile("^(?=.*?[a-zA-Z])(?=.*?[^a-zA-Z]{2,}).{8,}$");
        Matcher m = p.matcher(passwordField.getText());
        if (m.matches()) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);

            alert.setTitle("Valid Password");
            alert.setHeaderText(null);
            alert.setContentText("Password must be EIGHT characters or more and must contain at least TWO NON-ALPHABETIC characters.!!!");
            alert.showAndWait();
            return false;
        }
    }
}


    /*public TextField getFnameField() {
        return FnameField;
    }

    public void setFnameField(TextField fnameField) {
        FnameField = fnameField;
    }

    public TextField getLnameField() {
        return LnameField;
    }

    public void setLnameField(TextField lnameField) {
        LnameField = lnameField;
    }

    public TextField getEmailField() {
        return emailField;
    }

    public void setEmailField(TextField emailField) {
        this.emailField = emailField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public TextField getAddressField() {
        return addressField;
    }

    public void setAddressField(TextField addressField) {
        this.addressField = addressField;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(Button submitButton) {
        this.submitButton = submitButton;
    }

*/



