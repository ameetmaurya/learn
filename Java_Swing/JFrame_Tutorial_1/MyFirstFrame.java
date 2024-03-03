 package JFrame_Tutorial_1;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

class MyFirstFrame
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLocation(300, 70);
        frame.setBounds(100,100,1000,900); // locattion x ,location y, width , height 
        frame.setTitle("My Frame");
        
        
       ImageIcon icon = new ImageIcon("Decentralized.webp");
       frame.setIconImage(icon.getImage());

      Container c = frame.getContentPane();
          c.setBackground(Color.RED);
           
    }
}