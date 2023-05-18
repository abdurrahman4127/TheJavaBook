import javax.swing.*;
import java.awt.*;

/*
   benefit : after calling the constructor can be called multiple times to create multiple frame
*/

public class GUItest7_ClassConstructor extends JFrame {
    JFrame frame;

    GUItest7_ClassConstructor() {
        super("Frame");  //actually, its : JFrame ref = new JFrame("Frame")
        setSize(300,300); //reference is unnecessary as JFrame is being extended by this class
        setBackground(Color.BLUE);

        JButton button = new JButton("Button 1");
        button.setBackground(Color.RED);

        add(button);
        setVisible(true);   // it is the same as : ref.setVisible(true);
    }

    public static void main(String[] args)
    {
        new GUItest7_ClassConstructor();
        new GUItest7_ClassConstructor();
    }
}