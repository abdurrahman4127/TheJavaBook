package NestedExceptionCodes;

public class NestedException_Test4 {
    public static void main(String[] args)
    {
        try {
            test3();
        }

        catch (Exception t) {   //won't get executed as exception has been handled at line 30

            System.out.println("Catch from main : " + t.getMessage());
        }

        finally {
            System.out.println("finally from main method");
        }
    }

    public static void test3()
    {
        try {
            throw new ArithmeticException("throwing another exception");
        }

        catch (ArithmeticException a) {
            System.out.println("catch from test3 : " + a.getMessage());
        }

        finally {
            System.out.println("finally from test3 method");
        }

        System.out.println("after finally from test3 methode"); // will get executed
    }
}
