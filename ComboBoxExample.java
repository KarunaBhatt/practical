import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("ComboBox Example");
        
        // Set the size of the frame
        frame.setSize(400, 200);
        
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create an array of places
        String[] places = {"New York", "London", "Paris", "Tokyo", "Sydney"};
        
        // Create a combo box with the places
        JComboBox<String> comboBox = new JComboBox<>(places);
        
        // Create a label to display the selected place
        JLabel label = new JLabel("Selected Place: ");
        
        // Add an action listener to the combo box
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the combo box
                String selectedPlace = (String) comboBox.getSelectedItem();
                
                // Update the label with the selected place
                label.setText("Selected Place: " + selectedPlace);
            }
        });
        
        // Set the layout of the frame
        frame.setLayout(new FlowLayout());
        
        // Add the combo box and label to the frame
        frame.add(comboBox);
        frame.add(label);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
