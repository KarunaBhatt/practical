import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionFrame {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Addition Program");

        // Set the size of the frame
        frame.setSize(400, 200);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels, text fields, and button
        JLabel lblFirstNumber = new JLabel("Enter First Number:");
        JLabel lblSecondNumber = new JLabel("Enter Second Number:");
        JTextField txtFirstNumber = new JTextField(10);
        JTextField txtSecondNumber = new JTextField(10);
        JLabel lblResult = new JLabel("Result: ");
        JButton btnAdd = new JButton("Add");

        // Add action listener to the button
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the numbers from the text fields
                    int num1 = Integer.parseInt(txtFirstNumber.getText());
                    int num2 = Integer.parseInt(txtSecondNumber.getText());

                    // Calculate the sum
                    int sum = num1 + num2;

                    // Set the result in the label
                    lblResult.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    // Handle invalid input (non-integer values)
                    lblResult.setText("Please enter valid integers.");
                }
            }
        });

        // Set the layout for the frame
        frame.setLayout(new FlowLayout());

        // Add components to the frame
        frame.add(lblFirstNumber);
        frame.add(txtFirstNumber);
        frame.add(lblSecondNumber);
        frame.add(txtSecondNumber);
        frame.add(btnAdd);
        frame.add(lblResult);

        // Make the frame visible
        frame.setVisible(true);
    }
}
