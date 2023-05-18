package ExceptionCodes;

import java.util.Scanner;

class LessThanZero extends Exception {
    public LessThanZero(String s) {
        super(s);
    }
}

public class UserDef_NegativeError {
    public static boolean isEven(int n) throws LessThanZero {
        if(n < 0) {
            throw new LessThanZero("Applicable for non-negative integers");
        }

        return n % 2 == 0;
    }

    public static void main(String[] args)
    {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            isEven(a);
        }

        catch (LessThanZero a) {
            System.out.println(a.getMessage());
        }
    }
}
