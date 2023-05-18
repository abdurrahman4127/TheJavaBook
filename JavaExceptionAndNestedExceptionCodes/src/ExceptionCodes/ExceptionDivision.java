package ExceptionCodes;

public class ExceptionDivision {
    public static void main(String[] args)
    {
        try {
            int a = 7;
            int b = 0;
            System.out.println(division(a,b));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static int division(int a, int b) throws Exception {
        return a / b;
    }
}

