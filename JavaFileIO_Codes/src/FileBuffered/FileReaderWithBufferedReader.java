package FileBuffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderWithBufferedReader {
    public static void main(String[] args)
    {
        try(BufferedReader bfrd = new BufferedReader(new FileReader("C:\\Users\\USER\\JavaFileIO_Codes\\src\\FileBuffered\\hello3.txt")))
        {
            String line;

            while ((line = bfrd.readLine()) != null) {
                System.out.println(line);
            }
            bfrd.close();
        }

        catch (Exception e) {
            System.out.println("Error in File Reader " + e);
        }
    }
}