import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter_Reset {
    JFrame frame;
    JTextField textField;

    Counter_Reset() {
        frame = new JFrame("Frame");
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        JButton addButton = new JButton("add");
        JButton resetButton = new JButton("reset");
        textField = new JTextField();

        textField.setText("0");
        textField.setColumns(10);

        frame.add(new JLabel("counter"));
        frame.add(textField);
        frame.add(addButton);
        frame.add(resetButton);

//        Event source : button
//        Event Listener : new inner (); // Action Performed

        addButton.addActionListener(new Inner());  //register event listener for event source
        resetButton.addActionListener(new Inner2());  //register event listener for event source

        frame.setVisible(true);
    }

    class Inner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//            step 1 : extract the current value of the counter
            String s = textField.getText();

//            step 2 : add 1 to the current value
            int number = Integer.parseInt(s);
            number = number + 1;
            s = "" + number;

//            step 3 : set this new value to the counter
            textField.setText(s);

        }

    }

    class Inner2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            /*  either :
//            step 1 : extract the current value of the counter
            String s = textField.getText();

//            step 2 : add 1 to the current value
            int number = Integer.parseInt(s);
            number = 0;
            s = "" + number;

//            step 3 : set this new value to the counter
            textField.setText(s);
            */

            //or :
            
            textField.setText("0");
        }
    }

    //main method
    public static void main(String[] args)
    {
        new Counter_Reset();
    }
}