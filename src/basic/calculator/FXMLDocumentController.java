/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author th3an
 */
public class FXMLDocumentController implements Initializable {
    
    int num1; 
    int num2; 
    String flag; 
    
    private Label label;
    @FXML
    private TextField displayTextField;
    @FXML
    private Button zero;
    @FXML
    private Button seven;
    @FXML
    private Button four;
    @FXML
    private Button one;
    @FXML
    private Button eight;
    @FXML
    private Button five;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button six;
    @FXML
    private Button nine;
    @FXML
    private Button clear;
    @FXML
    private Button addition;
    @FXML
    private Button result;
    @FXML
    private Button divide;
    @FXML
    private Button multiply;
    @FXML
    private Button minus;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnZeroHandler(ActionEvent event) {
        String oldText=displayTextField.getText(); 
        if(oldText.isEmpty()){
        // do nothing
        System.err.println("Numbers don't start with zero!");
        }
        else{
        String newText = oldText + "0"; 
        displayTextField.setText(newText); 
        }
    }

    @FXML
    private void btnSevenHandler(ActionEvent event) {
         String oldText=displayTextField.getText(); 
        String newText = oldText + "7"; 
        displayTextField.setText(newText); 
    }

    @FXML
    private void btnFourHandler(ActionEvent event) {
         String oldText=displayTextField.getText(); 
        String newText = oldText + "4"; 
        displayTextField.setText(newText); 
    }

    @FXML
    private void btnOneHandler(ActionEvent event) {
         String oldText=displayTextField.getText(); 
        String newText = oldText + "1"; 
        displayTextField.setText(newText); 
    }

    @FXML
    private void btnEightHandler(ActionEvent event) {
         String oldText=displayTextField.getText(); 
        String newText = oldText + "8"; 
        displayTextField.setText(newText); 
    }

    @FXML
    private void btnFiveHandler(ActionEvent event) {
         String oldText=displayTextField.getText(); 
        String newText = oldText + "5"; 
        displayTextField.setText(newText); 
    }

    @FXML
    private void btnTwoHandler(ActionEvent event) {
         String oldText=displayTextField.getText(); 
        String newText = oldText + "2"; 
        displayTextField.setText(newText); 
    }

    @FXML
    private void btnThreeHandler(ActionEvent event) {
         String oldText=displayTextField.getText(); 
        String newText = oldText + "3"; 
        displayTextField.setText(newText); 
    }

    @FXML
    private void btnSixHandler(ActionEvent event) {
         String oldText=displayTextField.getText(); 
        String newText = oldText + "6"; 
        displayTextField.setText(newText); 
    }

    @FXML
    private void btnNineHandler(ActionEvent event) {
         String oldText=displayTextField.getText(); 
        String newText = oldText + "9"; 
        displayTextField.setText(newText); 
    }

    @FXML
    private void btnClearHandler(ActionEvent event) {
        displayTextField.setText("");
    }

    @FXML
   
    private void btnResult(ActionEvent event) {
        
        String oldValue = displayTextField.getText(); 
        num2 = Integer.parseInt(oldValue); 
        
        if(flag.equals("ADDITION")){
            int res=num1+num2; 
            displayTextField.setText(""+res);
        }
        else if(flag.equals("SUBTRACT")){
            int res=num1-num2; 
            displayTextField.setText(""+res);
        }
        else if(flag.equals("MULTIPLY")){
            int res=num1*num2; 
            displayTextField.setText(""+res);
        }
        else if(flag.equals("DIVISION")){
            int res=num1/num2; 
            displayTextField.setText(""+res);
        }
        else{
            System.err.println("That's Odd!"); 
        }
        
        
        
    }

    @FXML
    private void btnAdditionHandler(ActionEvent event) {
        
        String oldValue = displayTextField.getText(); 
        num1 = Integer.parseInt(oldValue);
        flag = "ADDITION"; 
        displayTextField.clear();
        
    }

    @FXML
    private void btnDivisionHandler(ActionEvent event) {
        String oldValue = displayTextField.getText(); 
        num1 = Integer.parseInt(oldValue);
        flag = "DIVISION"; 
        displayTextField.clear();
    }

    @FXML
    private void btnMultiplyHandler(ActionEvent event) {
        String oldValue = displayTextField.getText(); 
        num1 = Integer.parseInt(oldValue);
        flag = "MULTIPLY"; 
        displayTextField.clear();
    }

    @FXML
    private void btnSubtractHandler(ActionEvent event) {
        String oldValue = displayTextField.getText(); 
        num1 = Integer.parseInt(oldValue);
        flag = "SUBTRACT"; 
        displayTextField.clear();
    }
    
}
