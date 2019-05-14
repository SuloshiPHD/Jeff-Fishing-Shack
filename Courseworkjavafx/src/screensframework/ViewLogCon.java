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

public class ViewLogCon {
    public TextField purDate;
    public Label email;
    public Label pCode;
    public Label pQty;

    public void searchByDate(ActionEvent event) {
        ConnectionClass connectionClass = new ConnectionClass();

        try {

            Connection connection = connectionClass.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT CEmail,ProductCode,ProductQty,PurchaseDate FROM Order1details WHERE PurchaseDate = '" + purDate.getText() + "'");
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                email.setText(result.getString("CEmail"));
                //customerEmail.setText(result.getString("PurchaseDate"));
                pCode.setText(result.getString("ProductCode"));
                pQty.setText(result.getString("ProductQty"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void GoNext(ActionEvent event)throws IOException {
        Parent AloginformParent = FXMLLoader.load(getClass().getResource("AfterJEFFLogin.fxml"));

        Scene AloginformScene = new Scene(AloginformParent);

        // this line gets the satge information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setTitle("Staff Requirements Application");
        window.setScene(AloginformScene);
        window.show();
    }
}
