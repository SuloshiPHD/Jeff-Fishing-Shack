package screensframework;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;







import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class GmailEmail {


    public static void main(String[] args) {
        //start the email code

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
                    +"</body>","text/html; charset=utf-8");// set the content body of the email
            Transport.send(message);// send the entire message object

            System.out.println("was the email sent:Done");// verify that code fired


        }catch (MessagingException e){
            throw new RuntimeException(e);// if the email address is bad or doesn't exist
        }


    }
}


