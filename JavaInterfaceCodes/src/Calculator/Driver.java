package Calculator;

import javax.swing.*;

public class Driver {
    public static void main(String[] args)
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("enter your number :"));
        MyCalculator myCalculator = new MyCalculator();

        int sumOfDivs = myCalculator.divisorSum(num);
        System.out.println("sum of all divisors : " + sumOfDivs);
    }
}