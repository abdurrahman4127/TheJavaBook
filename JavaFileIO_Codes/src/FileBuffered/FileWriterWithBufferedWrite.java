package FileBuffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterWithBufferedWrite {
    public static void main(String[] args)
    {
        try(BufferedWriter bfrw = new BufferedWriter(new FileWriter("C:\\Users\\USER\\JavaFileIO_Codes\\src\\FileBuffered\\hello3.txt", true)))
        {
            String line = "Hello Universe!";
            String line2 = "Bye Universe!";

            bfrw.write(line);
            bfrw.write(line2);
            bfrw.newLine();

            System.out.println("File Written Successfully");
            bfrw.close();
        }
        catch(Exception e)
        {
            System.out.println("Error in File Writing " + e);
        }
    }
}
