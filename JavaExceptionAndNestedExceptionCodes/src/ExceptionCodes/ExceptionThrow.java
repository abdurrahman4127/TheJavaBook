package ExceptionCodes;

import java.util.Scanner;

public class ExceptionThrow {

    //add 'throws', if it doesn't handle exception inside this method
    public static void exceptionThrow() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // java creates new InputMismatchException(); obj and assigns to exception reference variable
    }

    //this is to throw an exception manually
    public static void throwingAndCatching() {
        try {
            throw new ArithmeticException(); //throwing manually
        }
        catch (ArithmeticException a) {
            System.out.println("Caught");
        }
    }

    public static void main(String[] args) {
        try {
            exceptionThrow();
        }

        catch (Exception manual) {
            System.out.println("enter an in integer !!");
            System.out.println("getMessage : "+ manual.getMessage());
        }

        throwingAndCatching(); //manually
    }
}
