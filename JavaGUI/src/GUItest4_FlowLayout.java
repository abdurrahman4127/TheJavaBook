import javax.swing.*;
import java.awt.*;

/*
JFrame doesn't use Flowlayout by default, so to add multiple components,
use either inner level container or FlowLayout
 */

public class GUItest4_FlowLayout {
    JFrame f;
    GUItest4_FlowLayout() {  //constructor of the public class
        f = new JFrame();
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panel uses this layout by default
        //will insert the components top to bottom & left to right

        f.setLayout(new FlowLayout());  // FlowLayout() can be modified by accessing static variables with Flaw layout class
//        f.setLayout(new FlowLayout(FlowLayout.LEFT));    //works
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));    //works
        f.setLayout(new FlowLayout());    //if noting is mentioned, then it'll be in the Center (or same as By Default)

        JButton b1=new JButton("1");
        JButton b2=new JButton("Test 2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
        JButton b6=new JButton("6");
        JButton b7=new JButton("7");
        JButton b8=new JButton("8");
        JButton b9=new JButton("Last 9");

        f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
        f.add(b6);f.add(b7);f.add(b8);f.add(b9);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new GUItest4_FlowLayout();  //creating an object of the public class; goes to the constructor
    }
}
