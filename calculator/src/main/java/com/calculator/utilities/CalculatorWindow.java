/*
 * Copyright 2023
 * Code by Michael White
 * CalculatorWindow class designed to simulate a calculator interface
 * Use :
 * x, y are numbers
 * Enter x, Enter operation, Enter y, Enter equal
 * OR
 * For n numbers
 * Enter n1, Enter operation, Enter n2, Enter operation, Enter n3, Enter operation, ... Enter n, Enter equal
 */
package com.calculator.utilities;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.calculator.utilities.Calculation;
import com.calculator.utilities.Operator;

public class CalculatorWindow extends JFrame {

    // Value to check if an operation is continually being used, i.e. 1 + 2 + 3 + 4 + ... instead of 1 + 2 = 3
    private boolean OPERATOR_IN_USE = false; 

    // Boolean for Error message
    private boolean ERROR_BOOL = false;

    // Calculator output label
    private JLabel NUM_LABEL = new JLabel("0", SwingConstants.RIGHT);

    // Variable to track which operation is currently being used
    private Operator CURRENT_OPERATION = null; 

    private void resetVars() {
        OPERATOR_IN_USE = false;
        ERROR_BOOL = false;
        CURRENT_OPERATION = null; 
    }

    private void clearScreen() {
        NUM_LABEL.setText("0");
    }

    private void displayError() {
        NUM_LABEL.setText("ERROR");
    }

    private boolean isEmpty() {
        try {
            // Attempt to convert current text to float. Error means operator present
            Float fl = Float.parseFloat(NUM_LABEL.getText());
            // Text is just 0
            if(fl == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            // Frame is NOT EMPTY but not 0, has ERROR message or operator
            return false; 
        }
    }

    private ActionListener createActionListener(String name) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (ERROR_BOOL) {
                    return;
                }
                // Field is 0, Set to number pressed
                else if (isEmpty()) {
                    NUM_LABEL.setText(name);
                }
                // Operator on screen
                else if (OPERATOR_IN_USE) {
                    clearScreen();
                    OPERATOR_IN_USE = false;
                    NUM_LABEL.setText(name);
                }
                // Not operator on screen and not ERROR but not 0, append number to end
                else if (!OPERATOR_IN_USE && NUM_LABEL.getText().length() < 8) {
                    NUM_LABEL.setText(NUM_LABEL.getText() + name);
                }
            }
            
        };
    }

    private ActionListener operatorActionListener(Operator operation) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
               // Already pressed operator button or ERROR message showing
               if (OPERATOR_IN_USE || ERROR_BOOL) {
                    ERROR_BOOL = true;
                    displayError();
                    return;
                }
                // Attempt to convert current number
                OPERATOR_IN_USE = true;
                try {
                    Float xFloat = Float.parseFloat(NUM_LABEL.getText());
                    // At least second time pressing operator
                    if (Calculation.x != 0) {
                        switch (CURRENT_OPERATION) {
                            case ADDITION:
                                Calculation.x += xFloat;
                                break;
                            case SUBTRACTION:
                                Calculation.x -= xFloat;
                                break;
                            case MULTIPLICATION:
                                Calculation.x *= xFloat;
                                break;
                            case DIVISION:
                                Calculation.x /= xFloat;
                                break;
                            // null case, should never call
                            default:
                                break;
                        }
                        NUM_LABEL.setText(Float.toString(Calculation.x));
                    }
                    // First use of operator
                    else {
                        switch (operation) {
                            case ADDITION:
                                NUM_LABEL.setText("+");
                                break;
                            case SUBTRACTION:
                                NUM_LABEL.setText("-");
                                break;
                            case MULTIPLICATION:
                                NUM_LABEL.setText("*");
                                break;
                            case DIVISION:
                                NUM_LABEL.setText("/");
                                break;
                            default:
                                break;
                        }
                        Calculation.x = xFloat; 
                    }
                    CURRENT_OPERATION = operation;
                } catch (Exception e) {
                    ERROR_BOOL = true; 
                    displayError();
                    return;
                }
            }
            
        };
    }
    
    public CalculatorWindow() {
        // Set the title of the window
        setTitle("Calculator v0.1");
        
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        
        // Add a button to the panel
        // JButton button = new JButton("Click me!");
        // panel.add(button);
        NUM_LABEL.setFont(new Font(Font.SANS_SERIF, 0, 36));
        
        // Add the panel to the center of the window
        add(NUM_LABEL, BorderLayout.NORTH);

        // Create the button panel
        panel.setLayout(new GridLayout(4, 4));

         // Create the number buttons
         JButton button0 = new JButton("0");
         JButton button1 = new JButton("1");
         JButton button2 = new JButton("2");
         JButton button3 = new JButton("3");
         JButton button4 = new JButton("4");
         JButton button5 = new JButton("5");
         JButton button6 = new JButton("6");
         JButton button7 = new JButton("7");
         JButton button8 = new JButton("8");
         JButton button9 = new JButton("9");
 
         // Create the operation buttons
         JButton buttonPlus = new JButton("+");
         JButton buttonMinus = new JButton("-");
         JButton buttonMultiply = new JButton("*");
         JButton buttonDivide = new JButton("/");
         JButton buttonEquals = new JButton("=");
         JButton buttonClear = new JButton("C");

         // Assign action listeners to buttons
         button0.addActionListener(createActionListener("0"));
         button1.addActionListener(createActionListener("1"));
         button2.addActionListener(createActionListener("2"));
         button3.addActionListener(createActionListener("3"));
         button4.addActionListener(createActionListener("4"));
         button5.addActionListener(createActionListener("5"));
         button6.addActionListener(createActionListener("6"));
         button7.addActionListener(createActionListener("7"));
         button8.addActionListener(createActionListener("8"));
         button9.addActionListener(createActionListener("9"));

         // Operator listeners
         buttonPlus.addActionListener(operatorActionListener(Operator.ADDITION));
         buttonMinus.addActionListener(operatorActionListener(Operator.SUBTRACTION));
         buttonMultiply.addActionListener(operatorActionListener(Operator.MULTIPLICATION));
         buttonDivide.addActionListener(operatorActionListener(Operator.DIVISION));

         buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // Invalid case for equals
                if (OPERATOR_IN_USE || ERROR_BOOL || CURRENT_OPERATION == null) {
                    displayError();
                }
                else {
                    // Attempt to get y variable
                    try {
                        Float yValue = Float.valueOf(NUM_LABEL.getText());
                        Calculation.y = yValue;
                        switch (CURRENT_OPERATION) {
                            case ADDITION:
                                Calculation.x += Calculation.y;
                                break;
                            case SUBTRACTION:
                                Calculation.x -= Calculation.y;
                                break;
                            case MULTIPLICATION:
                                Calculation.x *= Calculation.y;
                                break;
                            case DIVISION:
                                Calculation.x = Calculation.division();
                                break;
                            // null case, should never call
                            default:
                                break;
                        }
                        NUM_LABEL.setText(Float.toString(Calculation.x));
                    } catch (Exception e) {
                        displayError();
                    }
                }
            }
         });

         buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                clearScreen();
                resetVars();
                Calculation.resetVars();    
            }  
         });

         // Add the buttons to the panel
         panel.add(button7);
         panel.add(button8);
         panel.add(button9);
         panel.add(buttonDivide);
         panel.add(button4);
         panel.add(button5);
         panel.add(button6);
         panel.add(buttonMultiply);
         panel.add(button1);
         panel.add(button2);
         panel.add(button3);
         panel.add(buttonMinus);
         panel.add(button0);
         panel.add(buttonEquals);
         panel.add(buttonClear);
         panel.add(buttonPlus);
 
         // Add the button panel to the calculator panel
         add(panel, BorderLayout.CENTER);
        
        // Set the size of the window
        setSize(500, 800);
        
        // Set the location of the window
        setLocationRelativeTo(null);
        
        // Make the window visible
        setVisible(true);
        
        // Exit the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Test thread
    // TODO : remove
    public static void main(String[] args) {
        CalculatorWindow c = new CalculatorWindow();
    }
}
