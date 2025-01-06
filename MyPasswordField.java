

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class MyPasswordField
{
    



    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);//method
        frame.setBounds(100, 100, 1000, 500);
        
        Container c = frame.getContentPane();
        c.setLayout(null);
        
        /*JLabel label = new JLabel("Username");
        label.setVisible(true);
        label.setBounds(100, 80, 100, 50);
        label.setText("Label");//it used for change a text*/
 
       JPasswordField pass = new JPasswordField();
       pass.setBounds(100, 50, 120, 50);
       c.add(pass); 
       pass.setText("12345");
       pass.setFont(new Font("Arial",Font.CENTER_BASELINE,25));
       pass.setForeground(Color.red);
       
       pass.setEchoChar('*');
     //  pass.setBorder(new Border());
               
      
        
        //method cant't chage j textfield 
        
    }
}

    

