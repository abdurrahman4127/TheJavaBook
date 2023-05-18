package NestedExceptionCodes;

public class NestedException_Test2 {
    public static void main(String[] args)
    {
        try {
            test();
        }

        catch (Exception iae) {
            System.out.println("catch from main");
            iae.printStackTrace();
        }
    }

    public static void test() {
        try {
            int a = 4 / 0;  // system generated exception
        }

        catch (ArithmeticException ae) {
            System.out.println("catch from test : " + ae.getMessage());
            // ae.printStackTrace(System.out);   //to get synchronized output
            ae.printStackTrace();

            throw new IllegalArgumentException("Throwing another exception");
        }

        finally {
            System.out.println("Finally from test method");
        }

        System.out.println("After finally from test methode");
    }
}