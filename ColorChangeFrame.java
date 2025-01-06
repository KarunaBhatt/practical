import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangeFrame {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Color Change Frame");

        // Set the size of the frame
        frame.setSize(400, 200);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons for different colors
        JButton btnRed = new JButton("Red");
        JButton btnGreen = new JButton("Green");
        JButton btnBlue = new JButton("Blue");
        JButton btnYellow = new JButton("Yellow");

        // Add action listeners to change the background color on button click
        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.RED);
            }
        });

        btnGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.GREEN);
            }
        });

        btnBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLUE);
            }
        });

        btnYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.YELLOW);
            }
        });

        // Set the layout of the frame (FlowLayout for simple horizontal arrangement)
        frame.setLayout(new FlowLayout());

        // Add the buttons to the frame
        frame.add(btnRed);
        frame.add(btnGreen);
        frame.add(btnBlue);
        frame.add(btnYellow);

        // Make the frame visible
        frame.setVisible(true);
    }
}
