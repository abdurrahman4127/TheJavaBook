import javax.swing.*;

public class GUItest1 {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Test_1");
        frame.setSize(500,300);

        JButton button = new JButton();
        button.setText("OK");
        frame.add(button); //JButton object to the JFrame class

        JCheckBox checkBox = new JCheckBox();
//        frame.add(checkBox);  //checkBox object to the JFrame class

        frame.setVisible(true);  //won't show any GUI unless it's visible

        /*
        cannot add multiple components in the JFrame right now; therefore only
        the last component will stay on the JFrame
         */

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 'EXIT_ON_CLOSE' is a static type variable; that's why we used class name to access it
    }
}
