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
import java.sql.*;

public class ModifyaccController {

    @FXML private TextField currentEmail;
    @FXML
    private Button update;
    @FXML
    private TextField newemail;
    @FXML
    private TextField newaddress;

    @FXML
    private void UpdateButton(ActionEvent event) throws SQLException {
/*this method allow customer to update thier account details. New details will update
in registration details form*/
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();

        PreparedStatement statement = connection.prepareStatement("select Email from Registrationdetails ");

        //String pw=statement.getString("password");
        statement.execute();
        //String txtpw=password.getText();
       try{

          // if(pw.equals(password.getText())) {

               if (newemail.getText().equals("")) {
                   PreparedStatement stm = connection.prepareStatement("UPDATE Registrationdetails set Address='" + newaddress.getText() + "' where Email='" + currentEmail.getText() + "'");
                   stm.executeUpdate();

                   Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                   alert.setTitle("Confirm Modification");
                   alert.setHeaderText(null);
                   alert.setContentText("You have successfully update your address !");
                   alert.showAndWait();

               } else if (newaddress.getText().equals("")) {
                   PreparedStatement stm = connection.prepareStatement("UPDATE Registrationdetails set Email='" + newemail.getText() + "' where Email='" + currentEmail.getText() + "'");
                   stm.executeUpdate();
                   Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

                   alert.setTitle("Confirm Modification");
                   alert.setHeaderText(null);
                   alert.setContentText("You have successfully update your Email Address !");
                   alert.showAndWait();
               } else {
                   PreparedStatement stm = connection.prepareStatement("UPDATE Registrationdetails set Email='" + newemail.getText() + "',Address='" + newaddress.getText() + "' where Email='" + currentEmail.getText() + "'");
                   stm.executeUpdate();
                   Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

                   alert.setTitle("Confirm Modification");
                   alert.setHeaderText(null);
                   alert.setContentText("You have successfully update your Email Address and Address !");
                   alert.showAndWait();


                   Parent AloginformParent = FXMLLoader.load(getClass().getResource("Afterlogin.fxml"));

                   Scene AloginformScene = new Scene(AloginformParent);

                   // this line gets the satge information
                   Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                   window.setTitle("User Requirements Application");
                   window.setScene(AloginformScene);
                   window.show();

               }

       }catch (Exception e) {
           System.out.println(e);

       }


       }
}




   /* try {
            if(currentaddress.getText().equals("")||newaddress.getText().equals("")){

            }

            } catch (Exception e) {
            System.out.println(e);

            }*/
  /* PreparedStatement stm = connection.prepareStatement("UPDATE Registrationdetails Set Email=?,AddressLine1=? where Email='" + newemail.getText()+  "' AddressLine1  = '" + newaddress.getText() + "';");
// stm.setString(1, currentemail.getText());
           stm.setString(1, newemail.getText());
                   // stm.setString(3, currentaddress.getText());
                   stm.setString(2, newaddress.getText());


                   stm.executeUpdate();*/