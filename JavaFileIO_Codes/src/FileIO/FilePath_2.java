package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePath_2 {
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\USER\\JavaFileIO_Codes\\src\\FileIO\\file_2.txt");

        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;

            while (scanner.hasNext()) //if there exist any, it'll keep going.
            {
                String str = scanner.next();
                try {
                    int a = Integer.parseInt(str);  // converting string to integer within a try block.
                    sum += a;    // adding the integers present in the file.
                }
                catch (NumberFormatException exception) {
                    // not required to write anything here
                }
            }
            System.out.println(sum);  //out of while-loop; otherwise it'll keep adding & printing each time it gets an integer
        }

        catch (FileNotFoundException e) {
            System.out.println("file not found !!");
            e.printStackTrace();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
