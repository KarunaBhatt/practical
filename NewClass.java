import javax.swing.*;
import java.awt.*;
public class NewClass {
    public static void main(String[] args) {
    
        JFrame f = new JFrame("Registration Form");
        
        JPanel peln = new JPanel();
        peln.setLayout(null);
        
        //title
        JLabel lbl = new JLabel("Registration Form:");
        lbl.setBounds(150,10,200,30);
        lbl.setFont(new Font("Arial",Font.BOLD,15));
        peln.add(lbl);
        //name
        JLabel namlbl = new JLabel("Name:");
        namlbl.setBounds(50,60,120,10);
        peln.add(namlbl);
        
         JTextField T1 = new JTextField();
            T1.setBounds(150,60,200,20);
            peln.add(T1);
        
        JLabel mbllbl = new JLabel("Mobile:");
        mbllbl.setBounds(50, 100, 120, 20);
        peln.add(mbllbl);
        
        JTextField mobileField = new JTextField();
        mobileField.setBounds(150, 100, 200, 20);
        peln.add(mobileField);
        
        JLabel genlabel = new JLabel("Gender :");
        genlabel.setBounds(50, 140, 120, 20);
      peln.add(genlabel);
        
        JRadioButton malebtn = new JRadioButton("Male");
        malebtn.setBounds(150, 140, 70, 20);
        JRadioButton femalebtn = new JRadioButton("FeMale");
        femalebtn.setBounds(220, 140, 80, 20);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(malebtn);
        bg.add(femalebtn);
        
        peln.add(malebtn);
        peln.add(femalebtn);
        
        JLabel dblabel = new JLabel("DOB:");
        dblabel.setBounds(50, 180, 80, 20);
        peln.add(dblabel);
        
        JComboBox<String>Daycmb = new JComboBox<>();
        JComboBox<String>moncmb = new JComboBox<>();
        JComboBox<String>yearcmb = new JComboBox<>();
        
        for (int i = 1; i <= 31; i++) {
            Daycmb.addItem(String.valueOf(i));
            
            String [] Months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
            for (String Month : Months)
            moncmb.addItem(Month);            {
                
            }
        }
        
        Daycmb.setBounds(150, 180, 50, 20);
        moncmb.setBounds(210, 180, 70, 20);
        yearcmb.setBounds(290, 180, 60, 20);

        peln.add(Daycmb);
        peln.add(moncmb);
        peln.add(yearcmb);
        
        JLabel addlbl = new JLabel("Address");
        addlbl.setBounds(50, 220, 120, 20);
        peln.add(addlbl);
        
        JTextArea addarea = new JTextArea();
        JScrollPane spane = new JScrollPane(addarea);
        spane.setBounds(150, 220, 200, 50);
        peln.add(spane);
        
        JCheckBox check = new JCheckBox("Accept Terms And Condition");
        check.setBounds(50, 290, 300, 20);
        peln.add(check);
        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 330, 100, 25);
        peln.add(submitButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(250, 330, 100, 25);
        peln.add(resetButton);
        
        JTextArea ta = new JTextArea();
        ta.setEditable(true);
        JScrollPane resultScrollPane = new JScrollPane();
         resultScrollPane.setBounds(400, 60, 250, 300);
         peln.add(resultScrollPane);
        
         JLabel statusLabel = new JLabel("");
        statusLabel.setForeground(Color.BLACK);
        statusLabel.setBounds(150, 370, 200, 20);
        peln.add(statusLabel);
         
        f.add(peln);
        f.setSize(700,500);
        f.setVisible(true);
    
    }
    
}
