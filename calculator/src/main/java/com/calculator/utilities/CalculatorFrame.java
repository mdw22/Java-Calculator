/*
 * Class which sets up and configures popup window
 */
package com.calculator.utilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        // Set the title of the window
        setTitle("Calculator v0.1");
        
        // Create a panel to hold the components
        JPanel panel = new JPanel();
        
        // Add a button to the panel
        JButton button = new JButton("Click me!");
        panel.add(button);
        
        // Add the panel to the center of the window
        add(panel, BorderLayout.CENTER);
        
        // Set the size of the window
        setSize(500, 750);
        
        // Set the location of the window
        setLocationRelativeTo(null);
        
        // Make the window visible
        setVisible(true);
        
        // Exit the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
