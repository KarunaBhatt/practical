import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentEntryForm {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Student Entry Form");
        
        // Set frame properties
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the components
        JLabel lblStudentID = new JLabel("Student ID:");
        JLabel lblName = new JLabel("Name:");
        JLabel lblDepartment = new JLabel("Department:");
        JLabel lblSemester = new JLabel("Semester:");
        
        JTextField txtStudentID = new JTextField(15);
        JTextField txtName = new JTextField(15);
        
        // Department options for combo box
        String[] departments = {"Computer Science", "Electrical Engineering", "Mechanical Engineering", "Civil Engineering"};
        JComboBox<String> comboDepartment = new JComboBox<>(departments);
        
        JTextField txtSemester = new JTextField(5);
        
        // TextArea for displaying records
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        // Insert button
        JButton btnInsert = new JButton("Insert");
        
        // Add action listener to Insert button
        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get values from input fields
                String studentID = txtStudentID.getText();
                String name = txtName.getText();
                String department = (String) comboDepartment.getSelectedItem();
                String semester = txtSemester.getText();
                
                // Insert the values into the TextArea in row format
                String record = studentID + "\t" + name + "\t" + department + "\t" + semester + "\n";
                textArea.append(record);
                
                // Clear the input fields after insertion
                txtStudentID.setText("");
                txtName.setText("");
                txtSemester.setText("");
            }
        });
        
        // Set layout for the frame
        frame.setLayout(new FlowLayout());
        
        // Add components to the frame
        frame.add(lblStudentID);
        frame.add(txtStudentID);
        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblDepartment);
        frame.add(comboDepartment);
        frame.add(lblSemester);
        frame.add(txtSemester);
        frame.add(btnInsert);
        frame.add(scrollPane);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
