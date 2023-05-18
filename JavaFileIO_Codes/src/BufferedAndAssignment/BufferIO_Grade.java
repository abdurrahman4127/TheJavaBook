package BufferedAndAssignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferIO_Grade {
    public static void main(String[] args) throws Exception
    {
        FileReader reader = new FileReader("C:\\Users\\USER\\JavaFileIO_Codes\\src\\BufferedAndAssignment\\BufferIO_Grade.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String s = bufferedReader.readLine();

        while (s != null) {
            String []words = s.split(" "); //gets split when gets space " " ; this can be changed
//            System.out.println(words[0] + " " + words[1] + " " + words[2]); //to print all

            if(words[0].equals("abdurRahman"))  // checks if the 1st word is abdurRahman;
            {
                System.out.println(words[1]);  //if yes, prints 2nd word.
            }
            s = bufferedReader.readLine();  //updates the value of string so that it can iterate until null
        }

    }
}
