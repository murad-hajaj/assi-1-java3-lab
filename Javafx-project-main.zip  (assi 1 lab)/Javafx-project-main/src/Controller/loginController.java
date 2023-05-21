/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.SystemPage.SystemPage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class loginController implements Initializable {

    @FXML
    private Label userName;
    @FXML
    private TextField textFieldUserName;
    @FXML
    private Label password;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button buttonLogin;
    @FXML
    private Label labelErorr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource() == buttonLogin){
            if(textFieldUserName.getText().equals("murad") && passwordField.getText().equals("123_123")){
                labelErorr.setText("");
                new SystemPage().show();
            }else{
                labelErorr.setText("Name OR Password Invalid!");
            }  
        }
    }
    
}
