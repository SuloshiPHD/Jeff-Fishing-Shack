package screensframework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class AfterloginController {
    @FXML private Button email;
    @FXML private Button modify;
    @FXML private Button products;
    @FXML private Button closeButton;

     // this metod loads the product catalogue form
    @FXML private void  purchaseproducts(ActionEvent event)throws IOException {
        Parent productsformParent= FXMLLoader.load(getClass().getResource("productcatalogue.fxml"));
        Scene productsformScene=new Scene(productsformParent);
        // this line gets the satge information
        Stage window=(Stage)((Node)event.getSource()).getScene ().getWindow();
        window.setTitle("Purchase Product Form FXML Application");
        window.setScene(productsformScene);
        window.show();
    }
     // this method loads the modify account details form
    @FXML private void modifyAcc(ActionEvent event)throws IOException {
        Parent modifyaccformParent= FXMLLoader.load(getClass().getResource("Modifyacc.fxml"));

        Scene modifyaccformScene=new Scene(modifyaccformParent);

        // this line gets the satge information
        Stage window=(Stage)((Node)event.getSource()).getScene ().getWindow();
        window.setTitle("Modify Account Form FXML Application");
        window.setScene(modifyaccformScene);
        window.show();
    }
// this method loads the email enquiry form
    @FXML private void emailenquiries(ActionEvent event)throws IOException {
        Parent emailformParent= FXMLLoader.load(getClass().getResource("Emailenq.fxml"));

        Scene emailformScene=new Scene(emailformParent);

        // this line gets the satge information
        Stage window=(Stage)((Node)event.getSource()).getScene ().getWindow();
        window.setTitle("Email Enquiries Form FXML Application");
        window.setScene(emailformScene);
        window.show();
    }

   // exit from the program
    @FXML
    private void closeButtonAction( ){
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();

    }
}
