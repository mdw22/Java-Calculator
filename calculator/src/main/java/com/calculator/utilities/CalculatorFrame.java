/*
 * Class which sets up and configures popup window
 */
package com.calculator.utilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        // Set the title of the window
        setTitle("Calculator v0.1");
        
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        
        // Add a button to the panel
        // JButton button = new JButton("Click me!");
        // panel.add(button);
        JLabel test = new JLabel("Test");
        test.setFont(new Font(Font.SANS_SERIF, 0, 36));
        
        // Add the panel to the center of the window
        add(test, BorderLayout.PAGE_START);

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
