import javax.swing.*;
import java.awt.*;

public class GUItest5_BorderLayout {
    JFrame frame;   //frame is the reference of JFrame

    //constructor
    GUItest5_BorderLayout() {
        frame = new JFrame();
        frame.setSize(500,400);
//        frame.setLayout(new BorderLayout()); //no need of this since JFrame uses Border Layout as default

        JButton b1 = new JButton("1. NORTH");
        JButton b2 = new JButton("2. SOUTH");
        JButton b3 = new JButton("3. EAST");
        JButton b4 = new JButton("4. WEST");
        JButton b5 = new JButton("5. CENTER");

        //border layouts are of 5 regions; CENTER is the default one
        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(b5, BorderLayout.CENTER);

        //unspecified button and region

        // if we don't specify, it'll be in the center,
        //but b5 is the center therefore, b6 will overlap it

        JButton b6 = new JButton("6. Unspecified");
        frame.add(b6);  // it will overlap b5 button, so b5 will be unseen

        //but if we want to add both, then we'll use Panel (as panel uses Flow Layout by default)
        //therefore we can add b5 & b6 to a panel and add that panel to the JFrame
        JPanel panel = new JPanel();
        panel.add(b5);
        panel.add(b6);
//        panel.setLayout(new FlowLayout()); //no need of this since JPanel uses Flow Layout by default

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new GUItest5_BorderLayout();
    }
}