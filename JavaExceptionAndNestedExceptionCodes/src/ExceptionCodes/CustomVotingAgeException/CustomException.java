package ExceptionCodes.CustomVotingAgeException;

/*
question :

Write a custom CustomVotingAgeException InvalidAgeException that will be thrown
if the validate(); methode receives a parameter that is less than 18.

 */

//custom exception
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message) {
        super(message);
    }
}

//custom exception
class InEx extends Exception {
    public InEx(int s) {
        System.out.println(s*s);
    }
}

public class CustomException {
    public static void main(String[] args)
    {
        validate(13);
    }

    public static void validate(int age)
    {
        try {
            if (age < 18) {
                throw new InvalidAgeException("Cannot vote");
            }
            else
                System.out.println("Welcome to vote");
        }

        catch (InvalidAgeException a) {
            System.out.println(a.getMessage());
        }
    }

}
