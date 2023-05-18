package ExceptionCodes;

// CustomVotingAgeException is a built-in class
class CustomException extends Exception {
     CustomException() {   //exception has parameterless constructor too
         super();   //calling CustomVotingAgeException's parameterless constructor
     }

     CustomException(String message) {
         super(message);  //string parameter constructor of CustomVotingAgeException class
     }

     CustomException(int a) {
//         super(a); //no const. available in CustomVotingAgeException that accepts integer
         super("The number is : " + a); //allowed as it's passing as string; not as integer; passes to CustomVotingAgeException class
     }
}


public class UserDefinedException {
    public static void main(String[] args)
    {
        try {
            throw new CustomException(50);  //creates an obj. and calling the constructor
            //CustomVotingAgeException class receives the parameter and prints : The number is : 50;
        }

        catch (CustomException c) {
            System.out.println(c.getMessage());  // prints : The number is : 50
        }
    }
}
