
import java.awt.*;
import javax.swing.*;


public class MyFirstFrame 
{
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);//method
        frame.setLocation(100, 50);//method
        frame.setBounds(100, 100, 1000, 500);
        frame.setTitle("My Frame");
        
        ImageIcon ic = new ImageIcon("img01_png");
        frame.setIconImage(ic.getImage());
        
        
        Container c = frame.getContentPane();
        c.setBackground(Color.DARK_GRAY);
        frame.setResizable(false);
    
    }
    
}
