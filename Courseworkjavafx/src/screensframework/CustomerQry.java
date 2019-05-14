package screensframework;

import ConnectionDB.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerQry {

    @FXML private TextField emailC; // email address and enqueries can't access by any other classes
    @FXML private Label emailenq;

    @FXML private void check(ActionEvent event) throws IOException {
        ConnectionClass connectionClass = new ConnectionClass();
        try {

            Connection connection = connectionClass.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT EmailAddress,EmailText FROM Emailenquiries WHERE EmailAddress = '" + emailC.getText() + "'");
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                //customerEmail.setText(result.getString("PurchaseDate"));
                emailenq.setText(result.getString("EmailText"));// set email to a lable text

            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    }

