package NestedExceptionCodes;

/*
question :

Write a custom CustomVotingAgeException InvalidAgeException that will be thrown
if the validate(); methode receives a parameter that is less than 18.

 */

class InvalidAgeException extends Exception {
    InvalidAgeException(String a)
    {
       super(a);
    }
}

public class NestedException_Test7 {
    public static void validate(int age)
    {
        try
        {
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

    public static void main(String[] args) {
        validate(13);
    }
}
