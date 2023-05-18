package ExceptionCodes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_Catch {
    static boolean isEven(int n) {
        if(n < 0) {
            throw new ArithmeticException("Applicable for non-negative integers");
            // it won't show anything unless a negative input is given; that's why caller method should be inside try-catch
        }

        return n % 2 == 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            System.out.println(isEven(n));
        }

        catch (InputMismatchException im) {
            System.out.println("input must be an integer");
        }

        catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }
    }
}
