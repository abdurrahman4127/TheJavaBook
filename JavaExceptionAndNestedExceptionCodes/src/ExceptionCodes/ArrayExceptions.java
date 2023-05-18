package ExceptionCodes;/*
     either 'try' or 'catch' gets executed; but finally surely gets executed
     'try' block must be followed by either 'catch' or 'finally' ;
     if (after try block), only 'finally' block exits, program won't show compile-time
     error, but it won't solve the exception problem
 */

public class ArrayExceptions {
    public static void main(String[] args)
    {
        int []arr = {10, 20, 30};

        //either 'try' or 'catch' works
        try {
            System.out.println(arr[7] / 0); //out of bounds & Arithmetic exception
            System.out.println("end of try");
        }

        //index 3; but tryna access 7
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Outta bounds");
        }

        //can't divide by 0
        catch (ArithmeticException ae) {
            System.out.println("Arithmetic");
        }

/*              //use it, if properties of exceptions are same
        catch (ArrayIndexOutOfBoundsException | ArithmeticException a) {
            a.getMessage();
            a.printStackTrace();
        }
*/

        finally {
            System.out.println("inside finally");
        }

        System.out.println("end of code");
    }
}
