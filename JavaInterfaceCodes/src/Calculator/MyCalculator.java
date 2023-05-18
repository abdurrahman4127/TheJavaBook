package Calculator;

public class MyCalculator implements AdvancedArithmetic {
    int sumOfDivs = 0;

    @Override
    public int divisorSum(int n) {
        for(int i = 1; i<=n; i++)   // not from 0 since 0/x = arithmetic exception
        {
            if(n % i == 0) {
                sumOfDivs = sumOfDivs + i;
            }
        }
        return sumOfDivs;
    }
}