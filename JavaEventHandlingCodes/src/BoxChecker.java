import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoxChecker {
    JFrame frame = new JFrame("BoxChecker");
    JButton button = new JButton();
    JCheckBox checkBox = new JCheckBox();

    BoxChecker() {
        frame.setSize(400,150);
        frame.setLayout(new FlowLayout());  //otherwise, multiple components wouldn't be visible

        button.setText("Unchecked");  // by default, it's unchecked since it hasn't been checked (yet)

        //adding components to the JFrame
        frame.add(checkBox);
        frame.add(button);

        // to perform action using button
        checkBox.addActionListener(new Inner());

        frame.setVisible(true);  // only way to make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Inner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            // isSelected() method checks if the box is selected
            if(checkBox.isSelected())
                button.setText("checked");
            else
                button.setText("Unchecked");
        }
    }

    // main method
    public static void main(String[] args) {
        // just creating an object to use that constructor
        new BoxChecker();
    }
}