package swing;

import javax.swing.*;
import java.awt.event.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Form");

        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);

        JTextArea ta = new JTextArea();
        ta.setBounds(50, 80, 150, 60);

        JButton b = new JButton("Submit");
        b.setBounds(50, 150, 100, 30);

        JLabel l = new JLabel();
        l.setBounds(50, 190, 300, 20);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Name: " + tf.getText() + ", Address: " + ta.getText());
            }
        });

        f.add(tf); f.add(ta); f.add(b); f.add(l);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
