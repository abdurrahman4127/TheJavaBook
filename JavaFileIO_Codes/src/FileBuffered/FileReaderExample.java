package FileBuffered;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args)
    {
        //using bufferedReader to read from file
        try {
            FileReader fr = new FileReader("C:\\Users\\USER\\JavaFileIO_Codes\\src\\FileBuffered\\hello2.txt");
            int i;

            while((i = fr.read())!= -1) {
                System.out.print((char)i);
            }
            //BufferedReader bfrd = new BufferedReader()
        }

        catch (FileNotFoundException e) {
            System.out.println("Error in File Reader " + e);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}