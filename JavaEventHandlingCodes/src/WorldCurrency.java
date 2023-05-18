import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorldCurrency extends JFrame {
    JTextField taka, usd;
    JButton toUSD, reset;

    WorldCurrency(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);

        JPanel panel = new JPanel();
        JLabel l1 = new JLabel("Taka : ");
        panel.add(l1);

        taka = new JTextField(10);
        taka.setText("0.0");
        panel.add(taka);   // 1 USD = 84.75 Taka;

        JLabel l2 = new JLabel("U$D : ");
        panel.add(l2);

        usd = new JTextField(10);
        usd.setText("0.0");
        panel.add(usd);

        toUSD = new JButton("get U$D value");
        reset = new JButton("reset");

        panel.add(toUSD);
        panel.add(reset);

        toUSD.addActionListener(new Inner());
        reset.addActionListener(new Inner());

        add(panel);
        setVisible(true);
    }

    class Inner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            if(actionEvent.getSource() == toUSD) {
                String s = taka.getText();
                double money = Double.parseDouble(s);

                money = money * 84;
                s = "" + money;
                usd.setText(s);
            }

            else if(actionEvent.getSource() == reset) {
                usd.setText("0.0");
                taka.setText("0.0");
            }
        }
    }

    //main method
    public static void main(String[] args)
    {
        new WorldCurrency("Currency Converter");
    }
}
