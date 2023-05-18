package NestedExceptionCodes;

public class NestedException5_3 {
    public static void main(String[] args)
    {
        int N = 24;
        int[] divisors = {2, 3, 0, 4};

        try {
            for (int i = 0; i < 6; i++) { //ArrayIndexOutOfBoundException
                try {
                    int div = divisors[i];
                    int x = N / div;   //ArithmeticException
                    System.out.println("Success");
                }

                catch (ArithmeticException a) {
                    System.out.println("Arithmetic CustomVotingAgeException caught");
                }
            }
        }

        catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("ArrayIndexOutOfBounds caught");
        }
    }

    /*
    output will be :

    Success
    Success
    Arithmetic CustomVotingAgeException caught
    Success
    ArrayIndexOutOfBounds caught

     */

}
