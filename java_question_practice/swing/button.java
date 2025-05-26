package swing;
 
import javax.swing.*;
public class button {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("button example");
        
        JButton ok = new JButton("ok");
        ok.setBounds(50, 100, 250, 350);

        JButton reset =new JButton("Reset");
        reset.setBounds(40, 30, 100, 200);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(50, 150, 500, 600);
        frame.add(ok);
        frame.add(reset);
        frame.add(cancel);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
