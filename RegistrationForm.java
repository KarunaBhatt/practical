import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setPreferredSize(new Dimension(120, 20));
        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setPreferredSize(new Dimension(120, 20));
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setPreferredSize(new Dimension(120, 20));
        JLabel dobLabel = new JLabel("DOB:");
        dobLabel.setPreferredSize(new Dimension(120, 20));
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setPreferredSize(new Dimension(120, 20));

        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(200, 20));
        JTextField mobileField = new JTextField();
        mobileField.setPreferredSize(new Dimension(200, 20));
        JTextField dobField = new JTextField();
        dobField.setPreferredSize(new Dimension(200, 20));
        JTextArea addressArea = new JTextArea(3, 20);
        JScrollPane addressScrollPane = new JScrollPane(addressArea);

        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        maleButton.setPreferredSize(new Dimension(100, 20));
        femaleButton.setPreferredSize(new Dimension(100, 20));

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JCheckBox termsCheckBox = new JCheckBox("Accept Terms and Conditions");
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        JTextArea resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);

        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(mobileLabel);
        frame.add(mobileField);
        frame.add(genderLabel);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(dobLabel);
        frame.add(dobField);
        frame.add(addressLabel);
        frame.add(addressScrollPane);

        JPanel termsPanel = new JPanel();
        termsPanel.setLayout(new BoxLayout(termsPanel, BoxLayout.Y_AXIS));
        termsPanel.add(termsCheckBox);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        buttonPanel.add(submitButton);
        buttonPanel.add(resetButton);
        termsPanel.add(buttonPanel);

        frame.add(termsPanel);
        frame.add(scrollPane);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!termsCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Please accept the terms and conditions to register.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String name = nameField.getText();
                String mobile = mobileField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String dob = dobField.getText();
                String address = addressArea.getText();

                if (name.isEmpty() || mobile.isEmpty() || dob.isEmpty() || address.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String userData = "Name: " + name + "\nMobile: " + mobile + "\nGender: " + gender +
                                  "\nDOB: " + dob + "\nAddress: " + address + "\nSuccessful!\n\n";
                resultTextArea.append(userData);

                nameField.setText("");
                mobileField.setText("");
                dobField.setText("");
                addressArea.setText("");
                genderGroup.clearSelection();
                termsCheckBox.setSelected(false);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                mobileField.setText("");
                dobField.setText("");
                addressArea.setText("");
                genderGroup.clearSelection();
                termsCheckBox.setSelected(false);
                resultTextArea.setText("");
            }
        });

        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
