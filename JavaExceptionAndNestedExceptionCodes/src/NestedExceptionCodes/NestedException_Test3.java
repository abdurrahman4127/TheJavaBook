package NestedExceptionCodes;

public class NestedException_Test3 {
    public static void main(String[] args)
    {
        try {
            test2();
        }

        catch (Exception t) {
            System.out.println("Catch from main : " + t.getMessage());
        }

        finally {
            System.out.println("finally from main method");
        }
    }

    public static void test2()
    {
        try {
            throw new IllegalArgumentException("throwing another exception");
        }

        catch (ArithmeticException a) {
            System.out.println("catch from test2 : " + a.getMessage());
        }

        finally {
            System.out.println("finally from test2 method");
        }

        System.out.println("after finally from test2 methode"); // won't get executed
    }
}
