package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField display;

    private String operator = "";
    private double firstNumber = 0;
    private boolean startNewNumber = true;

    @FXML
    private void handleNumberAction(ActionEvent event) {
        String digit = ((Button) event.getSource()).getText();
        if (startNewNumber) {
            display.setText(digit);
            startNewNumber = false;
        } else {
            display.setText(display.getText() + digit);
        }
    }

    @FXML
    private void handleOperatorAction(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        // If "=" is pressed, perform calculation
        if (value.equals("=")) {
            if (operator.isEmpty()) return;

            try {
                double secondNumber = Double.parseDouble(display.getText());
                double result = calculate(firstNumber, secondNumber, operator);
                display.setText(String.valueOf(result));
                operator = "";
                startNewNumber = true;
            } catch (NumberFormatException e) {
                display.setText("Error");
                startNewNumber = true;
            }

        } else {
            // Any operator (+, -, ×, ÷)
            try {
                firstNumber = Double.parseDouble(display.getText());
                operator = value;
                startNewNumber = true;
            } catch (NumberFormatException e) {
                display.setText("Error");
                startNewNumber = true;
            }
        }
    }

    @FXML
    private void handleClear(ActionEvent event) {
        display.clear();
        operator = "";
        firstNumber = 0;
        startNewNumber = true;
    }

    private double calculate(double a, double b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "×" -> a * b;
            case "÷" -> b != 0 ? a / b : 0;
            default -> 0;
        };
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Optional: could set default display text here
    }
}
