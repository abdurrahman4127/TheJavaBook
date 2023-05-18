package ExceptionCodes;

//Grandparents -> Throwable
//Uncle 1 -> CustomVotingAgeException
//Uncle 2 -> Error
//son of uncle 1 -> Runtime CustomVotingAgeException

public class ExceptionTest {
    public static void main(String[] args) //main function
    {
        testSqrt(-1);  //1. goto : testSqrt() method
    }

    public static void testSqrt(int s ) {
        try {
            System.out.println(callSqr(s));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static int sqr(int a) throws Exception {
        if (a < 0) {
            throw new Exception("Can't be less than 0");
        }
        return (a * a);
    }

    public static int callSqr(int a) throws Exception
    {
        return sqr(a);
    }
}
