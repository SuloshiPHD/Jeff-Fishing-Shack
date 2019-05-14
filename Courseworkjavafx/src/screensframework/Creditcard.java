
/*
package screensframework;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.SQLException;
import java.util.Properties;

public class Creditcard {

    public Label showTot;
    public int totAmount;
   // ProductCatalogue product1=new ProductCatalogue();
    public void viewTotal()  {
       ProductCatalogue product1=new ProductCatalogue();
         totAmount=product1.totfr1+product1.totfr2+product1.totfr3+product1.totro1+product1.totro2+
                 product1.totro3+product1.totfh1+product1.totfh2+product1.totfh3+product1.totfl1+
                 product1.totfl2+product1.totfl3+product1.totsi1+product1.totsi2+product1.totsi3+
                 product1.totsw1+product1.totsw2+product1.totsw3;
        System.out.println(product1.totfr1);
        showTot.setText(String.valueOf((totAmount)));
    }

    public void sendInvoice(ActionEvent event) {
        RegiController regi=new RegiController();
        final String username="jeffshack18@gmail.com";
        final String password=" jeffshack2018";

        Properties props=new Properties();
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");//this is the smtp address
        props.put("mail.smtp.port","587"); // this is the port for the smtp server

        Session session=Session.getInstance(props,
                new javax.mail.Authenticator(){

                    protected PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication(username,password);
                        // this is used to authenticate your gmail account
                    }

                });


        try{
            Message message= new MimeMessage(session);
            message.setFrom(new InternetAddress("jeffshack18@gmail"));//from email address
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("dunee1998@gmail.com"));// to email address
            message.setSubject("My First Email");//set the subject of email
            message.setContent("<h:body style=background-color:white;font-family:verdana;color:#0066cc;>"
                    +"Jeff's Fishing Shack. If you are gettig this you wrote your first email !<br/><br/>"
                    +regi.getAddressField()+regi.getFnameField()
                    +"</body>","text/html; charset=utf-8");// set the content body of the email
            Transport.send(message);// send the entire message object

            System.out.println("was the email sent:Done");// verify that code fired


        }catch (MessagingException e){
            throw new RuntimeException(e);// if the email address is bad or doesn't exist
        }

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Validating Purchasing");
        alert.setHeaderText(null);
        alert.setContentText("You Have Successfully Purchase order!, The Tax invoice sent to your Email");
        alert.showAndWait();


    }
}

*/
