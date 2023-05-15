/*
 * Class which sets up and configures popup window
 * This class is designed to be in control of the UI and interface
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

public class CalculatorFrame extends JFrame {
   
    Calculation calculation = new Calculation();

    public CalculatorFrame() {
        // Set the title of the window
        setTitle("Calculator v0.1");
        
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        
        // Add a button to the panel
        // JButton button = new JButton("Click me!");
        // panel.add(button);
        JLabel num_Label = new JLabel("0", SwingConstants.RIGHT);
        num_Label.setFont(new Font(Font.SANS_SERIF, 0, 36));
        
        // Add the panel to the center of the window
        add(num_Label, BorderLayout.NORTH);

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


         // Add listeners to the buttons with defined functions
         buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_Label.setText("0");
            }
         });
         button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                // Calc is not set to 0
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "0";
                        num_Label.setText(current_text);
                    }
                }
            }
         });
         button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "1";
                        num_Label.setText(current_text);
                    }
                }
                else {
                    num_Label.setText("1");
                }
            }
         });
         button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "2";
                        num_Label.setText(current_text);
                    }
                }
                else {
                    num_Label.setText("2");
                }
            }
         });
         button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "3";
                        num_Label.setText(current_text);
                    }
                }
                else {
                    num_Label.setText("3");
                }
            }
         });
         button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "4";
                        num_Label.setText(current_text);
                    }
                }
                else {
                    num_Label.setText("4");
                }
            }
         });
         button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "5";
                        num_Label.setText(current_text);
                    }
                }
                else {
                    num_Label.setText("5");
                }
            }
         });
         button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "6";
                        num_Label.setText(current_text);
                    }
                }
                else {
                    num_Label.setText("6");
                }
            }
         });
         button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "7";
                        num_Label.setText(current_text);
                    }
                }
                else {
                    num_Label.setText("7");
                }
            }
         });
         button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "8";
                        num_Label.setText(current_text);
                    }
                }
                else {
                    num_Label.setText("8");
                }
            }
         });
         button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float.valueOf(num_Label.getText());
                } catch (Exception ex) {
                    // TODO: handle exception
                    num_Label.setText("0");
                }
                if(!num_Label.getText().equals("0")) {
                    String current_text = num_Label.getText();
                    // Digits are under 8
                    if(current_text.length() < 8) {
                        current_text += "9";
                        num_Label.setText(current_text);
                    }
                }
                else {
                    num_Label.setText("9");
                }
            }
         });
         buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calculation.set_X(Float.parseFloat(num_Label.getText()));
                    num_Label.setText("/");

                } catch (Exception ex) {
                    ex.printStackTrace();
                    num_Label.setText("ERROR");
                }
            }          
         });
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calculation.set_X(Float.parseFloat(num_Label.getText()));
                    num_Label.setText("*");

                } catch (Exception ex) {
                    ex.printStackTrace();
                    num_Label.setText("ERROR");
                }
            }          
         });
         buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calculation.set_X(Float.parseFloat(num_Label.getText()));
                    num_Label.setText("+");

                } catch (Exception ex) {
                    ex.printStackTrace();
                    num_Label.setText("ERROR");
                }
            }          
         });
         buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calculation.set_X(Float.parseFloat(num_Label.getText()));
                    num_Label.setText("-");

                } catch (Exception ex) {
                    ex.printStackTrace();
                    num_Label.setText("ERROR");
                }
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



    public static void main(String[] args) {
        CalculatorFrame frame = new CalculatorFrame();
    }
}
