import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter_Reset_OBJ extends JFrame {
    /*
     why here ? it's because, if we write these inside the constructor, it won't be
     accessible out of the constructor.
    */

    JButton b1, b2;
    JTextField textField;

    //constructor
    Counter_Reset_OBJ()  {
        super("Counter Box");
        setSize(400,100);
        setLayout(new FlowLayout());

        add(new JLabel("Counter : "));

        textField = new JTextField(10);
        textField.setText("0");

        b1 = new JButton("add");
        b2 = new JButton("reset");
        add(textField); add(b1); add(b2);

        b1.addActionListener(new Inner());
        b2.addActionListener(new Inner());

        setVisible(true);
    }

    class Inner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            if(actionEvent.getSource() == b1) {
                String extract = textField.getText();
                int number = Integer.parseInt(extract);

                number = number + 1;
                extract = "" + number;

                textField.setText(extract);
            }

            else if(actionEvent.getSource() == b2) {
                textField.setText("0");
            }
        }
    }

    public static void main(String[] args)  //main method
    {
        new Counter_Reset_OBJ();
    }
}