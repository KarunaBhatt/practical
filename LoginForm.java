import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm 
{
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Login Form");

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels, text fields, and button
        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");
        JTextField txtUsername = new JTextField(15);
        JPasswordField txtPassword = new JPasswordField(15);
        JButton btnLogin = new JButton("Login");
        JLabel lblMessage = new JLabel("");

        // Predefined correct username and password
        String correctUsername = "charmi";
        String correctPassword = "123";

        // Add action listener to the login button
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the username and password entered by the user
                String enteredUsername = txtUsername.getText();
                String enteredPassword = new String(txtPassword.getPassword());

                // Check if the credentials match
                if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                    lblMessage.setText("Login Successfully");
                    lblMessage.setForeground(Color.GREEN);
                } else {
                    lblMessage.setText("Invalid credentials");
                    lblMessage.setForeground(Color.RED);
                }
            }
        });

        // Set the layout for the frame
        frame.setLayout(new FlowLayout());

        // Add components to the frame
        frame.add(lblUsername);
        frame.add(txtUsername);
        frame.add(lblPassword);
        frame.add(txtPassword);
        frame.add(btnLogin);
        frame.add(lblMessage);

        // Make the frame visible
        frame.setVisible(true);
    }
}
