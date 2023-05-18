package NestedExceptionCodes;

public class NestedException5_2 {
    public static void main(String[] args)
    {
        int N = 24;
        int[] divisor = {2, 3, 0, 4};

        for(int i=0; i<6; i++) {
            int div = divisor[i];
            int x = N / div;
            System.out.println("Success");
        }

        /*
        desired output after using try-catch:

        Success
        Success
        ArithmeticException Caught
        Success
        ArrayIndexOutOfBounds caught

         */
    }
}
