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

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;

public class  EmailenqController {
    @FXML private PasswordField emailpw;
    @FXML private TextField emailAdd;
    @FXML private TextField enqtxt;
    @FXML
    private void sendEmail(ActionEvent event) throws SQLException {
         // to send mails from this way senders email address must activate less secure option
        try {
            String host = "smtp.gmail.com";
            String user = emailAdd.getText(); // get customer email from the textfield
            String pass = emailpw.getText() ;
            String to = "jeffshack18@gmail.com";
            String from = emailAdd.getText();
            String subject = "This is a email enquery from your customer";
            String messageText = enqtxt.getText();
            boolean sessionDebug = false;

            Properties props = System.getProperties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);//this is the smtp address
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] addresses = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, addresses);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(messageText);

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            System.out.println("Message send Successfully!");

            // show confirmation message to user
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirm Email Enquiries");
            alert.setHeaderText(null);
            alert.setContentText("You have successfully Sent your Email !");
            alert.showAndWait();

            //loads next form
            Parent AloginformParent = FXMLLoader.load(getClass().getResource("Afterlogin.fxml"));
            Scene AloginformScene = new Scene(AloginformParent);

            // this line gets the satge information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setTitle("User Requirements Application");
            window.setScene(AloginformScene);
            window.show();

             // connect with database. add details of customer email enquries to db using prepared statements
            ConnectionClass connectionClass=new ConnectionClass();
            Connection connection=connectionClass.getConnection();

            PreparedStatement stm = connection.prepareStatement("INSERT INTO EmailEnquiries(EmailAddress,EmailText)VALUES(?,? )");
            stm.setString(1, emailAdd.getText());
            stm.setString(2, enqtxt.getText());
            stm.executeUpdate();



        } catch (Exception ex) {
            System.out.println(ex);
        }


    }
}

