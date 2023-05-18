package ExceptionCodes;

public class ExceptionAge {
    public static void main(String[] args)
    {
        int aAge = 18;
        int bAge = 0;

        try {
            entry(aAge);
            entry(bAge);
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("code has been executed successfully");
        }
    }

    static void entry(int age) throws Exception {
        if(age < 18)
            throw new Exception("no entry");
        else
            System.out.println("welcome");
    }
}
