import javax.swing.*;

public class GUItest6_NoLayout {
    JFrame frame;

    GUItest6_NoLayout() {
        frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);  // while inserting components, gotta tell where to which components

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("Test 2");
        JButton b3 = new JButton("3");
//        JButton b4 = new JButton("4");

        b1.setBounds(10, 10, 50, 20); // height, width can be re-written
        b2.setBounds(10, 50, 150, 20);
        b3.setBounds(50, 100, 50, 20);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
//        frame.add(b4);  // adding it won't impact on code since specification (like line 22-24) is not given for b4

        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new GUItest6_NoLayout();
    }
}