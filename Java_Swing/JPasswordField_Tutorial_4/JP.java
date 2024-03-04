package JPasswordField_Tutorial_4;

import javax.swing.*;
import java.awt.*;

public class JP {
    public static void main(String[] args) 
    {
          JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,900);
      
        Container c =  frame.getContentPane();
        c.setLayout(null);

        JPasswordField password = new JPasswordField();
        password.setBounds(100,50,120,30);
        c.add(password);

        password.setText("123455");
        password.setFont(new Font("Arial",Font.PLAIN,30));

        frame.setVisible(true);
    }
    
}
