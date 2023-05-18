package BufferedAndAssignment;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriter_IO {
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\USER\\JavaFileIO_Codes\\src\\BufferedAndAssignment\\file_write.txt");

        //creating and writing a file (named : nonExisting.txt) that doesn't exist
        File nonExisting = new File("C:\\Users\\USER\\JavaFileIO_Codes\\src\\BufferedAndAssignment\\nonExisting.txt");

        try {
            PrintWriter writer = new PrintWriter(file);  //PrintWriter class

            writer.println("Abdur Rahman");
            writer.println(7);

            writer = new PrintWriter(nonExisting);
            writer.println("Just created !!");

//            Scanner scanner = new Scanner(System.in);  //scanning inputs from console
//            String  str = scanner.next();   // scanning whole line by using .next();
//
//            writer.println(str);   // writing the string that has been taken from console

            Scanner scanner = new Scanner(System.in);
            writer.println(scanner.next());

            writer.close();  //have got to close it; otherwise it will not work
        }

        catch (Exception e)  // while writing, it won't show any 'FileNotFoundException'; rather if file is missing, it'll create itself
        {
            System.out.println("Exception exists !!");
        }
    }
}
