import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    JFrame frame;
    JButton button;
    JTextField textField;

    Counter() {
        frame = new JFrame("Frame");
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("add");
        textField = new JTextField("add");

        textField.setText("0");
        textField.setColumns(10);

        frame.add(new JLabel("counter"));
        frame.add(textField);
        frame.add(button);

//        Event source : button
//        Event Listener : new inner (); // Action Performed

        button.addActionListener(new Inner());  //register event listener for event source

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

    //main method
    public static void main(String[] args)   //main method
    {
        new Counter();
    }
}