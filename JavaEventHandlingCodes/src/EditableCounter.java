import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditableCounter {
    JFrame frame = new JFrame("Counter");
    JButton count = new JButton("count");
    JButton reset = new JButton("reset");
    JTextField textField;

    // this constructor takes the inputted value from main method
    EditableCounter() {
        frame.setSize(400,150);
        frame.setLayout(new FlowLayout());  //otherwise, multiple components wouldn't be visible

        // test field will have used user inputted value
        textField = new JTextField("0", 10);

        //adding components to the JFrame
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
            //detecting which button is pressed via getting source
            if(actionEvent.getSource() == count)
            {
                // try-catch : don't wanna get any exception if the user enters random characters
                try {
                    int num = Integer.parseInt(textField.getText());
                    textField.setText((num + 1) + "");  // the value in text field + 1
                }
                catch (NumberFormatException e){
                    System.out.println("you should've gone for a number in the text field");
                }
            }

            // warning : pressing the reset button will set the text field to '0'
            else {
                textField.setText("0");
            }
        }
    }

    // main method
    public static void main(String[] args) {
        new EditableCounter();
    }
}
