package ExceptionCodes;

import java.util.Scanner;

public class ThrowExceptionAge {
    public static void main(String[] args)
    {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new NumberFormatException();
            }
            else {
                System.out.println("Welcome to the Club!");
            }
        }
        catch (Exception e) {
            System.out.println(("You are under aged."));
        }
    }
}
