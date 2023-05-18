import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NonEditableCounter {
    JFrame frame = new JFrame();
    JButton count, reset;
    JTextField textField = new JTextField("0",10);  // default text inside the field is '0'

    NonEditableCounter() {
        frame.setName("Count_Reset");
        frame.setSize(400,150);
        frame.setLayout(new FlowLayout());  //otherwise, multiple components wouldn't be visible

        // buttons
        count = new JButton("count");  // will increase value each time it's pressed
        reset = new JButton("reset");  // set everything to 0

        // when false, user cannot edit / insert any sort of values inside the text field
        textField.setEditable(false);

        // adding components to the JFrame
        frame.add(count);
        frame.add(textField);
        frame.add(reset);

        // to perform action using buttons
        count.addActionListener(new Inner()); // pressing the count button will increase the text field value by 1
        reset.addActionListener(new Inner()); // pressing the reset button will set the text field to '0'

        frame.setVisible(true);  // only way to make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Inner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            //detecting which button is pressed
            if(actionEvent.getSource() == count) {
                int textInt = Integer.parseInt(textField.getText());
                textField.setText((textInt + 1) + "");
            }

            // warning : pressing the reset button will set the text field to '0'
            else if(actionEvent.getSource() == reset){
                textField.setText("0");
            }
        }
    }

    // main method
    public static void main(String[] args) {
        // just creating an object to use that constructor
        new NonEditableCounter();
    }
}
