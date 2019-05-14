package screensframework;
import ConnectionDB.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ProductCatalogue {

    public CheckBox pFR1, pFR2, pFR3, RO1, RO2, RO3, FH1, FH2, FH3, FL1, FL2, FL3, SI1, SI2, SI3, SW1, SW2, SW3;
    public TextField FR1QTY, FR2QTY, FR3QTY, RO1QTY, RO2QTY, RO3QTY, FH1QTY, FH2QTY, FH3QTY,
            FL1QTY, FL2QTY, FL3QTY, SI1QTY, SI2QTY, SI3QTY, SW1QTY, SW2QTY, SW3QTY;
    public Label showtot;
    public TextField purchaseEmail;

    // public DatePicker cdate;

   // use linkedlist to store checkboxes values and product quantites
    List<String> checkboxlist = new LinkedList<String>();
    List<String> orderlist = new LinkedList<String>();
    List<String> orderqty = new LinkedList<String>();
    List<String> qtylist = new LinkedList<String>();
    public int totfr1, totfr2, totfr3, totro1, totro2, totro3, totfh1, totfh2, totfh3, totfl1, totfl2, totfl3,
            totsi1, totsi2, totsi3, totsw1, totsw2, totsw3, totAmount;

    public void AddtocartButton(ActionEvent event) throws SQLException, IOException {

        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();
        // get the values from checkboxes
        // FISHING REELS
        if (pFR1.isSelected()) {
            checkboxlist.add(pFR1.getText());
            orderlist.add(pFR1.getText());
            qtylist.add(FR1QTY.getText());
            orderqty.add(FR1QTY.getText());
            Integer value1 = Integer.valueOf(FR1QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            //stm.setString(4, cdate.getDayCellFactory());
            stm.executeUpdate();
            totfr1 = value1 * 400;
            System.out.println(totfr1);
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }
        if (pFR2.isSelected()) {
            checkboxlist.add(pFR2.getText());
            orderlist.add(pFR2.getText());
            qtylist.add(FR2QTY.getText());
            orderqty.add(FR2QTY.getText());
            Integer value2 = Integer.valueOf(FR2QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totfr2 = value2 * 800;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }
        if (pFR3.isSelected()) {
            checkboxlist.add(pFR3.getText());
            orderlist.add(pFR3.getText());
            qtylist.add(FR3QTY.getText());
            orderqty.add(FR3QTY.getText());
            Integer value3 = Integer.valueOf(FR3QTY.getText());

            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totfr3 = value3 * 1200;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }

        //FISHING RODS
        if (RO1.isSelected()) {
            checkboxlist.add(RO1.getText());
            orderlist.add(RO1.getText());
            qtylist.add(RO1QTY.getText());
            orderqty.add(RO1QTY.getText());
            Integer value4 = Integer.valueOf(RO1QTY.getText());

            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());

            stm.executeUpdate();
            totro1 = value4 * 300;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }
        if (RO2.isSelected()) {
            checkboxlist.add(RO2.getText());
            orderlist.add(RO2.getText());
            qtylist.add(RO2QTY.getText());
            orderqty.add(RO2QTY.getText());
            Integer value5 = Integer.valueOf(RO2QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totro2 = value5 * 600;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }
        if (RO3.isSelected()) {
            checkboxlist.add(RO3.getText());
            orderlist.add(RO3.getText());
            qtylist.add(RO3QTY.getText());
            orderqty.add(RO3QTY.getText());
            Integer value6 = Integer.valueOf(RO3QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totro3 = value6 * 900;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }

        //FISHING HOOKS
        if (FH1.isSelected()) {
            checkboxlist.add(FH1.getText());
            orderlist.add(FH1.getText());
            qtylist.add(FH1QTY.getText());
            orderqty.add(FH1QTY.getText());
            Integer value7 = Integer.valueOf(FH1QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totfh1 = value7 * 500;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }
        if (FH2.isSelected()) {
            checkboxlist.add(FH2.getText());
            orderlist.add(FH2.getText());
            qtylist.add(FH2QTY.getText());
            orderqty.add(FH2QTY.getText());
            Integer value8 = Integer.valueOf(FH2QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totfh2 = value8 * 1000;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }
        if (FH3.isSelected()) {
            checkboxlist.add(FH3.getText());
            orderlist.add(FH3.getText());
            qtylist.add(FH3QTY.getText());
            orderqty.add(FH3QTY.getText());
            Integer value9 = Integer.valueOf(FH3QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totfh3 = value9 * 1500;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);

        }

        //FISHING LINE

        if (FL1.isSelected()) {
            checkboxlist.add(FL1.getText());
            orderlist.add(FL1.getText());
            qtylist.add(FL1QTY.getText());
            orderqty.add(FL1QTY.getText());
            Integer value10 = Integer.valueOf(FL1QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());

            stm.executeUpdate();
            totfl1 = value10 * 600;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);

        }
        if (FL2.isSelected()) {
            checkboxlist.add(FL2.getText());
            orderlist.add(FL2.getText());
            qtylist.add(FL2QTY.getText());
            orderqty.add(FL2QTY.getText());
            Integer value11 = Integer.valueOf(FL2QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totfl2 = value11 * 1200;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }
        if (FL3.isSelected()) {
            checkboxlist.add(FL3.getText());
            orderlist.add(FL3.getText());
            qtylist.add(FL3QTY.getText());
            orderqty.add(FL3QTY.getText());
            Integer value12 = Integer.valueOf(FL3QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totfh3 = value12 * 1800;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }

        //SINKERS

        if (SI1.isSelected()) {
            checkboxlist.add(SI1.getText());
            orderlist.add(SI1.getText());
            qtylist.add(SI1QTY.getText());
            orderqty.add(SI1QTY.getText());
            Integer value13 = Integer.valueOf(SI1QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totsi1 = value13 * 250;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);

        }
        if (SI2.isSelected()) {
            checkboxlist.add(SI2.getText());
            orderlist.add(SI2.getText());
            qtylist.add(SI2QTY.getText());
            orderqty.add(SI2QTY.getText());
            Integer value14 = Integer.valueOf(SI2QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totsi2 = value14 * 500;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }
        if (SI3.isSelected()) {
            checkboxlist.add(SI3.getText());
            orderlist.add(SI3.getText());
            qtylist.add(SI3QTY.getText());
            orderqty.add(SI3QTY.getText());
            Integer value15 = Integer.valueOf(SI3QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totsi3 = value15 * 750;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }

        //SWIVELS

        if (SW1.isSelected()) {
            checkboxlist.add(SW1.getText());
            orderlist.add(SW1.getText());
            qtylist.add(SW1QTY.getText());
            orderqty.add(SW1QTY.getText());
            Integer value16 = Integer.valueOf(SW1QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totsw1 = value16 * 450;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);

        }
        if (SW2.isSelected()) {
            checkboxlist.add(SW2.getText());
            orderlist.add(SW2.getText());
            qtylist.add(SW2QTY.getText());
            orderqty.add(SW2QTY.getText());
            Integer value17 = Integer.valueOf(SW2QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totsi2 = value17 * 900;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);

        }
        if (SW3.isSelected()) {
            checkboxlist.add(SW3.getText());
            orderlist.add(SW3.getText());
            qtylist.add(SW3QTY.getText());
            orderqty.add(SW3QTY.getText());
            Integer value18 = Integer.valueOf(SW3QTY.getText());
            PreparedStatement stm = connection.prepareStatement("INSERT INTO Order1Details(CEmail,ProductCode,ProductQty)VALUES(?,?,? )");
            stm.setString(1, purchaseEmail.getText());
            stm.setString(2, checkboxlist.toString());
            stm.setString(3, qtylist.toString());
            stm.executeUpdate();
            totsi3 = value18 * 1550;
            for (String a : checkboxlist) {
                System.out.println(a);
            }
            for (String b : qtylist) {
                System.out.println(b);
            }
            checkboxlist.remove(0);
            qtylist.remove(0);
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Validating Purchase Items");
        alert.setHeaderText(null);
        alert.setContentText("You Have Successfully Ordered items!!");
        alert.showAndWait();

    }

    public void ViewTotButton() {
        totAmount = totfr1 + totfr2 + totfr3 + totro1 + totro2 + totro3 + totfh1 + totfh2 +
                totfh3 + totfl1 + totfl2 + totfl3 + totsi1 + totsi2 + totsi3 + totsw1 + totsw2 + totsw3;
        System.out.println(totAmount);
        showtot.setText("Your Total Amount is RS : " + String.valueOf(totAmount));
    }

    public void sendInvoice(ActionEvent event) throws SQLException, IOException {
        ConnectionClass connectionClass = new ConnectionClass();
          //creation invoice
        final String username = "jeffshack18@gmail.com";
        final String password = " jeffshack2018";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");//this is the smtp address
        props.put("mail.smtp.port", "587"); // this is the port for the smtp server
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                        // this is used to authenticate your gmail account
                    }

                });

        try {

            Connection connection = connectionClass.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT Reg_id,FirstName,LastName,Email,Address FROM Registrationdetails WHERE Email = '" + purchaseEmail.getText() + "'");
            ResultSet result = statement.executeQuery();

            ArrayList<String> arrayList = new ArrayList<String>();
            while (result.next()) {

                System.out.println(orderlist);
                System.out.println(orderqty);
               // selection sort -to sort quantity and find the max quantity
                int i;
                int j;
                int minValue;
                int minIndex;
             //sorting the list and search for maxiumum  value
                for (i = 0; i < orderqty.size(); i++) {
                    System.out.println("The list Quantites of purchase items: ");
                    System.out.println(orderqty.get(i));
                    char iLetter = (orderqty.get(i).charAt(0));
                    int iValue = (int) iLetter;
                    minValue = iValue;
                    minIndex = i;
                    for (j = i; j < orderqty.size(); j++) {
                        char jLetter = orderqty.get(j).charAt(0);
                        int jValue = (int) jLetter;
                        if (jValue < minValue) {
                            minValue = jValue;
                            minIndex = j;
                        }
                    }
                    if(minValue < iValue) {
                        int temp = iValue;
                        char idx = orderqty.get(minIndex).charAt(0);
                        int idxValue = (int) idx;
                        iValue = idxValue;
                        idxValue = temp;
                    }
                    if(minValue < iValue) {
                        Collections.swap (orderqty, i, minIndex);
                    }
                    orderqty.set(i, orderqty.set(minIndex, orderqty.get(i)));
                }
                System.out.println("The sorted quantity list(Ascending order):");
                System.out.println(orderqty);

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("jeffshack18@gmail"));//from email address
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse("dunee1998@gmail.com"));// to email address
                message.setSubject("Tax Invoice Confirming your payments-Jeff's Fishing Shack");//set the subject of email
                // message contains HTML markups
                String msg = "<center><i><b><h2>Jeff's Fishing Shack!</h2></b></i><br><h3>Tax Invoice</h3><br></center>";
                msg += "<h4>Jeff's Fishing Shack<br> Trading as:Octopus Pty Ltd<br>Shop 4, Hillarys Boat Harbour<br>Hillarys, WA,6025<br><b>T:08 9402 2222<br>Email:jeffshack18@gmail.com</b></h4><br>";
                //msg += "<font color=red>Duke</font>";
                msg += " Customer : ";
                msg += result.getString("FirstName");
                msg += " ";
                msg += result.getString("LastName");
                msg += " <br> ";
                msg += result.getString("Address");
                msg += " <br><br><br>Customer# : ";
                msg += result.getString("Reg_id");
                msg += " <br>Customer Email : ";
                msg += result.getString("Email");
                msg += " <br><br><br>Purchases# : <br> ";
                msg += " <br><b><center><h3>Item Code:  ";
                msg += orderlist;
                msg += " <br><b><center>Quantity :  ";
                msg += orderqty;
                msg += " <br><br><br><center><h3><font color=red>Total Paid: Rs. ";
                msg += totAmount;
                msg += " </h3></font><br><br><br><center><h4><b>Thank You For Your Business. <br> Jeff's-Where the Real Fishermen Shop</b></h4></center> ";
                arrayList.add(result.getString("LastName"));

                message.setContent(msg, "text/html; charset=utf-8");
                Transport.send(message);// send the entire message object
                System.out.println("was the email sent:Done");// verify that code fired

                // arrayList.add(result.getString("LastName"));
            }

        } catch (MessagingException e) {
            throw new RuntimeException(e);// if the email address is bad or doesn't exist
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Validating Purchasing");
        alert.setHeaderText(null);
        alert.setContentText("You Have Successfully Purchase order!, The Tax invoice sent to your Email");
        alert.showAndWait();

        Parent AloginformParent = FXMLLoader.load(getClass().getResource("Afterlogin.fxml"));
        Scene AloginformScene = new Scene(AloginformParent);
        // this line gets the satge information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("User Requirements Application");
        window.setScene(AloginformScene);
        window.show();
    }

}






/*for (String element : orderlist) {
        //System.out.println(element);
        msg+=element;
        }
        orderlist.forEach(System.out::println);*/

// System.out.println("All records have been selected!");
// System.out.println(arrayList);





