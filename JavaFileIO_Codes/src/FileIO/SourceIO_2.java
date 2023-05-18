package FileIO;

import java.util.Scanner;

public class SourceIO_2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner("this is the source");

        String  s = scanner.next(); //until white-space
        String  s2 = scanner.nextLine(); // from the 1st white space

        System.out.println("outputs : ");
        System.out.println(s); // will print : 'this'
        System.out.println(s2); // will print : ' is the source'
    }
}
