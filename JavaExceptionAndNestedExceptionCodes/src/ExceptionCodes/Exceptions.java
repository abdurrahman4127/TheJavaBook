package ExceptionCodes;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Grandparents -> Throwable
    Uncle 1 -> CustomVotingAgeException
    Uncle 2 -> Error
    Son of uncle 1 -> Runtime CustomVotingAgeException
 */

public class Exceptions {
    public static void main(String[] args)
    {
//        String num = "7";
//        int a = Integer.parseInt(num); //convert string into integer
//
//        System.out.println(a);
//
//        num = num + 7;
//        a = a + 7;
//
//        System.out.println(a);  // 14 ; integer adds
//        System.out.println(num); //77 ; string appends
//
//        num = num + " hello world " + 7;
//        System.out.println(num);  // 77 hello world 7

        Scanner scanner = new Scanner(System.in);

        //paste you code to try block from when you think any sort of exception can arise
        try {
            int integer = scanner.nextInt();   // new InputMismatchException (); creates object then assigns to exception reference (sun-class polymorphism)
            String string = scanner.next();  // while scanning string, there's no exception since anything can be of string

            int convert = Integer.parseInt(string); // NumberFormatException

            int divide = integer / convert;  // ArithmeticException

            System.out.println(divide); // No exception can arise
        }

        //to catch exception, catch (typeOfException variableName) {}
        catch (InputMismatchException ime) {
            System.out.println("enter an integer, you idiot!!");
            ime.printStackTrace(); //to trace where the exception arose from
        }

        catch (NumberFormatException nfe) {
            System.out.println("enter a number, you idiot!!");
        }

        catch (ArithmeticException ae) {
            System.out.println("You cannot divide by 0");
            System.out.println(ae.getMessage()); // prints : / by zero ; it's java build-in message
        }

        /*
          if you don't know which exception you are expecting, use 'CustomVotingAgeException'; it's general exception
          don't write 'CustomVotingAgeException' typed exception at first; otherwise only this block will be executed
          CustomVotingAgeException is the super class of all type of exception
         */
        catch (Exception b) //public class can't be named after 'CustomVotingAgeException'
        {
            System.out.println("something's wrong. I can feel it");
        }

        //whatever happens, this block will get executed
        finally {
            System.out.println("code has been executed !!");
        }
    }
}