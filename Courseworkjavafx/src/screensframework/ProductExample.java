package screensframework;

import ConnectionDB.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.LinkedList;
import java.util.List;


public class ProductExample {

    public CheckBox pFR1;
    public CheckBox pFR2;
    public CheckBox pFR3;
    public TextField FR1QTY;
    public TextField FR2QTY;
    public TextField FR3QTY;
    public Button addCart;
    public CheckBox RO1;
    public CheckBox RO2;
    public CheckBox RO3;
    public TextField RO1QTY;
    public TextField RO2QTY;
    public TextField RO3QTY;
    public CheckBox FH1;
    public CheckBox FH2;
    public CheckBox FH3;
    public TextField FH1QTY;
    public TextField FH2QTY;
    public TextField FH3QTY;
    public CheckBox FL1;
    public CheckBox FL2;
    public CheckBox FL3;
    public TextField FL1QTY;
    public TextField FL2QTY;
    public TextField FL3QTY;
    public CheckBox SI1;
    public CheckBox SI2;
    public CheckBox SI3;
    public TextField SI1QTY;
    public TextField SI2QTY;
    public TextField SI3QTY;
    public CheckBox SW1;
    public CheckBox SW2;
    public CheckBox SW3;
    public TextField SW1QTY;
    public TextField SW2QTY;
    public TextField SW3QTY;


    List<String> linkedList = new LinkedList<String>();

    public void AddtocartButton(ActionEvent event) throws SQLException {

        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();
      // FISHING REELS
        if (pFR1.isSelected()) {
            PreparedStatement stm = connection.prepareStatement("INSERT INTO OrderDetails(ProductCode,Qty)VALUES(?,?)");
            stm.setString(1, pFR1.getText());
            stm.setString(2, FR1QTY.getText());
           // stm.execute();

            Product pFR1 = new Product("FR1", "Fishing Reels", "#3", 400);
            linkedList.add(0, "FR1");

        }
        if (pFR2.isSelected()) {
            PreparedStatement stm = connection.prepareStatement("INSERT INTO OrderDetails(ProductCode,Qty)VALUES(?,?)");
            stm.setString(1, pFR2.getText());
            stm.setString(2, FR2QTY.getText());
            //stm.executeUpdate();
            Product pFR2 = new Product("FR2", "Fishing Reels", "#6", 800);
            linkedList.add(1, "FR2");
        }
        if (pFR3.isSelected()) {
            PreparedStatement stm = connection.prepareStatement("INSERT INTO OrderDetails(ProductCode,Qty)VALUES(?,?)");
            stm.setString(1, pFR3.getText());
            stm.setString(2, FR3QTY.getText());
            //stm.executeUpdate();
            Product pFR3 = new Product("FR3", "Fishing Reels", "#9", 1200);
            linkedList.add(2, "FR3");

        }
        //FISHING RODS
        if (RO1.isSelected()) {

            Product pRO1 = new Product("RO1", "Fishing Rods", "3", 300);
            linkedList.add(3, "RO1");

        }
        if (RO2.isSelected()) {

            Product pRO2 = new Product("RO2", "Fishing Rods ", "6", 600);
            linkedList.add(4, "R02");

        }
        if (RO3.isSelected()) {

            Product pRO3 = new Product("RO3", "Fishing Rods", "9", 900);
            linkedList.add(5, "RO3");

        }

        //FISHING HOOKS

        if (FH1.isSelected()) {

            Product pFH1 = new Product("FH1", "Fishing Hooks", "small", 500);
            linkedList.add(6, "FH1");
        }
        if (FH2.isSelected()) {

            Product pFH2 = new Product("FH2", "Fishing Hooks", "medium", 1000);
            linkedList.add(7, "FH2");

        }
        if (FH3.isSelected()) {

            Product pFH3 = new Product("FH3", "Fishing Hooks", "large", 1500);
            linkedList.add(8, "FH3");

        }
        //FISHING LINE
        if (FL1.isSelected()) {

            Product pFL1 = new Product("FL1", "Fishing Line", "100", 600);
            linkedList.add(9, "FL1");

        }
        if (FL2.isSelected()) {

            Product pFL2 = new Product("FL2", "Fishing Line", "200", 1200);
            linkedList.add(10, "FL2");

        }
        if (FL3.isSelected()) {

            Product pFL3 = new Product("FL3", "Fishing Line", "300", 1800);
            linkedList.add(11, "FL3");

        }
        //SINKERS
        if (SI1.isSelected()) {

            Product pSI1 = new Product("SI1", "Sinkers", "30", 250);
            linkedList.add(12, "SI1");

        }if (SI2.isSelected()) {

            Product pSI2 = new Product("SI2", "Sinkers ", "60", 500);
            linkedList.add(13, "SI2");

        }if (SI3.isSelected()) {

            Product pSI3 = new Product("SI3", "Sinkers ", "90", 700);
            linkedList.add(14, "SI3");

        }
        //SWIVELS
        if (SW1.isSelected()) {

            Product pSW1 = new Product("SW1", "Swivels ", "small", 450);
            linkedList.add(15, "SW1");

        }if (SW2.isSelected()) {

            Product pSW2 = new Product("SW2", "Swivels ", "medium", 900);
            linkedList.add(16, "SW2");

        }if (SW3.isSelected()) {

            Product pSW3 = new Product("SW3", "Swivels ", "large", 1550);
            linkedList.add(17, "SW3");

        }



       for(String a:linkedList){
            System.out.println(a);
        }
    }


}