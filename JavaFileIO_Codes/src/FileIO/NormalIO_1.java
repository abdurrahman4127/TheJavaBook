package FileIO;

import java.util.Scanner;

public class NormalIO_1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        double d = scanner.nextDouble();

        scanner.nextLine();

        String  s = scanner.nextLine();

        System.out.println("outputs : ");
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
}
