
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


public class register_form {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        
            JPanel panel = new JPanel();
            panel.setLayout(null);
        //title
            JLabel title = new JLabel("Registration Form");
            title.setFont(new Font("Arial",Font.BOLD,20));
            title.setBounds(150,10,200,30);
            panel.add(title);
            
            //name
            JLabel label1 = new JLabel("Name:");
            label1.setBounds(50,60,120,10);
            panel.add(label1);
            
            JTextField T1 = new JTextField();
            T1.setBounds(150,60,200,20);
            panel.add(T1);
        
           JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(50, 100, 120, 20);
        panel.add(mobileLabel);

        JTextField mobileField = new JTextField();
        mobileField.setBounds(150, 100, 200, 20);
        panel.add(mobileField);
        
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
        
        //dob
        JLabel dblabel = new JLabel("DOB:");
        dblabel.setBounds(50, 180, 80, 20);
        panel.add(dblabel);
        
        JComboBox<String> daycombo=new JComboBox<>();
        JComboBox<String> monthcombo=new JComboBox<>();
        JComboBox<String> yearcombo=new JComboBox<>();
        
        daycombo.setBounds(150, 180, 50, 20);
        monthcombo.setBounds(210, 180, 70, 20);
        yearcombo.setBounds(290, 180, 60, 20);

        panel.add(daycombo);
        panel.add(monthcombo);
        panel.add(yearcombo);
        
        //adderess
        
        JLabel addlbl = new JLabel("Address");
        addlbl.setBounds(50, 220, 120, 20);
        panel.add(addlbl);
        
        JTextArea addressArea = new JTextArea();
        JScrollPane addressScrollPane = new JScrollPane(addressArea);
        addressScrollPane.setBounds(150, 220, 200, 50);
        panel.add(addressScrollPane);
        
        //Checkbox And Terms
        JCheckBox termsCheckBox = new JCheckBox("Accept Terms And Conditions.");
        termsCheckBox.setBounds(50, 290, 300, 20);
        panel.add(termsCheckBox);
        
         JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 330, 100, 25);
        panel.add(submitButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(250, 330, 100, 25);
        panel.add(resetButton);
        
         JTextArea resultTextArea = new JTextArea();
         resultTextArea.setEditable(true);
         JScrollPane resultScrollPane = new JScrollPane();
         resultScrollPane.setBounds(400, 60, 250, 300);
         panel.add(resultScrollPane);
         
         JLabel statusLabel = new JLabel("");
        statusLabel.setForeground(Color.BLACK);
        statusLabel.setBounds(150, 370, 200, 20);
        panel.add(statusLabel);

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
            frame.add(panel);
        frame.setSize(700, 450);
            frame.setVisible(true);
        
    }
    
}
