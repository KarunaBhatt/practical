import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm_02{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");

        // Main Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Title
        JLabel titleLabel = new JLabel("Registration Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(150, 10, 200, 30);
        panel.add(titleLabel);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 60, 120, 20);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 60, 200, 20);
        panel.add(nameField);

        // Mobile
        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(50, 100, 120, 20);
        panel.add(mobileLabel);

        JTextField mobileField = new JTextField();
        mobileField.setBounds(150, 100, 200, 20);
        panel.add(mobileField);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 140, 120, 20);
        panel.add(genderLabel);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setBounds(150, 140, 70, 20);
        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(220, 140, 80, 20);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        panel.add(maleButton);
        panel.add(femaleButton);

        // DOB
        JLabel dobLabel = new JLabel("DOB:");
        dobLabel.setBounds(50, 180, 120, 20);
        panel.add(dobLabel);

        JComboBox<String> dayCombo = new JComboBox<>();
        JComboBox<String> monthCombo = new JComboBox<>();
        JComboBox<String> yearCombo = new JComboBox<>();

        // Populate day, month, year
        for (int i = 1; i <= 31; i++) {
            dayCombo.addItem(String.valueOf(i));
        }
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (String month : months) {
            monthCombo.addItem(month);
        }
        for (int i = 1900; i <= 2025; i++) {
            yearCombo.addItem(String.valueOf(i));
        }

        dayCombo.setBounds(150, 180, 50, 20);
        monthCombo.setBounds(210, 180, 70, 20);
        yearCombo.setBounds(290, 180, 60, 20);

        panel.add(dayCombo);
        panel.add(monthCombo);
        panel.add(yearCombo);

        // Address
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 220, 120, 20);
        panel.add(addressLabel);

        JTextArea addressArea = new JTextArea();
        JScrollPane addressScrollPane = new JScrollPane(addressArea);
        addressScrollPane.setBounds(150, 220, 200, 50);
        panel.add(addressScrollPane);

        // Terms and Conditions
        JCheckBox termsCheckBox = new JCheckBox("Accept Terms And Conditions.");
        termsCheckBox.setBounds(50, 290, 300, 20);
        panel.add(termsCheckBox);

        // Buttons
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 330, 100, 25);
        panel.add(submitButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(250, 330, 100, 25);
        panel.add(resetButton);

        // Text Area for Output
        JTextArea resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        JScrollPane resultScrollPane = new JScrollPane(resultTextArea);
        resultScrollPane.setBounds(400, 60, 250, 300);
        panel.add(resultScrollPane);

        JLabel statusLabel = new JLabel("");
        statusLabel.setForeground(Color.BLACK);
        statusLabel.setBounds(150, 370, 200, 20);
        panel.add(statusLabel);

        // Submit Button Action
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!termsCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Please accept the terms and conditions.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String name = nameField.getText();
                String mobile = mobileField.getText();
                String gender = maleButton.isSelected() ? "Male" : (femaleButton.isSelected() ? "Female" : "");
                String dob = dayCombo.getSelectedItem() + "/" + monthCombo.getSelectedItem() + "/" + yearCombo.getSelectedItem();
                String address = addressArea.getText();

                if (name.isEmpty() || mobile.isEmpty() || gender.isEmpty() || address.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String userData = "Name : " + name + "\nMobile : " + mobile + "\nGender : " + gender + "\nDOB : " + dob + "\nAddress : " + address + "\n";
                resultTextArea.append(userData + "\n");

                statusLabel.setText("Registration Successfully..");

                // Clear fields
                nameField.setText("");
                mobileField.setText("");
                genderGroup.clearSelection();
                dayCombo.setSelectedIndex(0);
                monthCombo.setSelectedIndex(0);
                yearCombo.setSelectedIndex(0);
                addressArea.setText("");
                termsCheckBox.setSelected(false);
            }
        });

        // Reset Button Action
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                mobileField.setText("");
                genderGroup.clearSelection();
                dayCombo.setSelectedIndex(0);
                monthCombo.setSelectedIndex(0);
                yearCombo.setSelectedIndex(0);
                addressArea.setText("");
                termsCheckBox.setSelected(false);
                resultTextArea.setText("");
                statusLabel.setText("");
            }
        });

        // Frame Settings
        frame.add(panel);
        frame.setSize(700, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
