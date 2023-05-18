package NestedExceptionCodes;

//Grandparents -> Throwable
//Uncle 1 -> CustomVotingAgeException
//Uncle 2 -> Error
//son of uncle 1 -> Runtime CustomVotingAgeException

public class NestedException_Test {
    public static void main(String[] args)
    {
        int []course = new int[10];

        try {
            System.out.println("outer try block");

            try {
                System.out.println("Start change");
                course[10] = 1;    //exception can arise from here
                System.out.println("End change");
            }

            catch (NumberFormatException n) {
                System.out.println("Inner catch :" + n.getMessage());
                n.printStackTrace();  // to keep a trace
            }

            catch (ArrayIndexOutOfBoundsException inner) {
                System.out.println("Inner catch :" + inner.getMessage());
                inner.printStackTrace();
            }
        }

        catch (ArrayIndexOutOfBoundsException outer) {
            System.out.println("Outer catch :" + outer.getMessage());
            outer.printStackTrace();
        }
    }
}
