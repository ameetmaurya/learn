package JLabel_Tutorial_2;

import java.awt.Container;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class add_image {

    public static void main(String[] args) {
         JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,900);
      
        Container c =  frame.getContentPane();
        c.setLayout(null);
        ImageIcon icon = new ImageIcon("/home/sachin/Desktop/Java_Swing/MyJLabel/a.png");
         
        // JLabel label = new JLabel(icon);

        // label.setBounds(100, 50,icon.getIconWidth(),icon.getIconHeight());

        

        JLabel label = new JLabel("USERNAME",icon,JLabel.LEFT); 
        label.setBounds(0, 100, 500, 100);
        c.add(label);
    }
    
}
