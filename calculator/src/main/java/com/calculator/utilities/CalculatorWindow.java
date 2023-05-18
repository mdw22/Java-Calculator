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

public class CalculatorWindow extends JFrame {

    private ActionListener createActionListener(JButton button, String name) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        };
    }

    private void clearScreen() {
        
    }
    
    public CalculatorWindow() {
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
    }
}
