package JLabel_Tutorial_2;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JL 
{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,900);

        Container c = frame.getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("User name");
        label.setBounds(100, 50, 1000, 90);
        // label.setText("Password");

        Font font = new Font("arial",Font.PLAIN,30);
        label.setFont(font);
        c.add(label);

    }
}
