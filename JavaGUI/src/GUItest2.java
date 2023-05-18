import javax.swing.*;

//Container -> 2 types; 1.JFrame (outer level) 2. JPanel (inner level)

public class GUItest2 {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Test");
        frame.setSize(300,300);

        //passing string to the parameterless constructor of JLevel class
        JLabel label = new JLabel("Label 1");

        JTextField textField = new JFormattedTextField(); // if string is passed in its constructor, it'll be written on the text field
        textField.setColumns(10); //can pass it to the constructor, too
        JButton buttonOK = new JButton("OK");

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        JPanel panel1 = new JPanel();  // to add label and textField
        JPanel panel2 = new JPanel();  // to add buttons
        JPanel panel3 = new JPanel();  // to add panel1 & panel2

        // adding label & textField to panel 1
        panel1.add(label);
        panel1.add(textField);
        panel1.add(buttonOK);

        // adding buttons to panel 1
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);

        panel1.setVisible(true);  //panels are by default visible; no need to write this line

//        panel3.add(panel1,panel2); maybe not possible; do one at a time
//        since JFrame can't hold more than one component, we're assigning those 2 components (panels) to another panel

        // adding panel1 & panel2
        panel3.add(panel1);
        panel3.add(panel2);

        frame.add(panel3);

        frame.setVisible(true);  //better if we write it in the last moment
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 'EXIT_ON_CLOSE' is a static type variable; that's why we used class name to access it
    }
}
