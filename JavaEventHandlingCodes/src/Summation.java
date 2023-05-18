import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Summation extends JFrame {
    JButton addButton, clear;
    JTextField one, two, three;

    Summation() {
        super("Summation");
        setSize(250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("First Number : "));
        add(one = new JTextField(20));

        add(new JLabel("Second Number : "));
        add(two = new JTextField(20));

        add(new JLabel("Third Number : "));
        add(three = new JTextField(20));

        add(addButton = new JButton("add"));
        add(clear = new JButton("clear"));

        addButton.addActionListener(new Inner());
        clear.addActionListener(new Inner());

        setVisible(true);
    }


    class Inner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            if(actionEvent.getSource() == addButton) {
                String s1 = one.getText();
                int x = Integer.parseInt(s1);

                String s2 = one.getText();
                int y = Integer.parseInt(s1);

                String s3 = one.getText();
                int z = Integer.parseInt(s1);

                int sum = x + y + z;

                System.out.println(sum);
//                int a = Integer.parseInt(textField1.getText());
//                int b = Integer.parseInt(textField2.getText());
//                int c = Integer.parseInt(textField3.getText());
//
//                output.setText("" + (a+b+c));
            }

            else if(actionEvent.getSource() == clear) {
                one.setText("");
                two.setText("");
                three.setText("");
            }
        }
    }

    //main method
    public static void main(String[] args)
    {
        new Summation();
    }
}
