import javax.swing.*;
import java.awt.*;

public class GUItest3 {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Test 3");
        f.setSize(500,300);

        JButton b = new JButton("Click Here");
        b.setBackground(Color.RED);  //setting colour
        b.setForeground(Color.blue);

        JPanel panel = new JPanel();
        panel.add(b);
        panel.setBackground(Color.YELLOW);

        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
