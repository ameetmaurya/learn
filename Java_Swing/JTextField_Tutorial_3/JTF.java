package JTextField_Tutorial_3;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import javax.swing.JTextField;

public class JTF {
    public static void main(String[] args) {
         JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,900);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JTextField t1 = new JTextField();
        t1.setBounds(100, 50, 180, 30);
        c.add(t1);

        t1.setText("Username");
        Font font = new Font("Arial",Font.BOLD,25); // syle , type,size
        t1.setFont(font);


        t1.setForeground(Color.GREEN);
        t1.setBackground(Color.YELLOW);
        t1.setEditable(false);
    }
    
}
