package BufferedAndAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReader_IO {
    public static void main(String[] args) throws Exception // exception
    {
        FileReader reader = new FileReader("C:\\Users\\USER\\JavaFileIO_Codes\\src\\BufferedAndAssignment\\BufferedRead.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

//        FileWriter writer = new FileWriter("C:\Users\USER\JavaFileIO_Codes\src\BufferedAndAssignment\BufferWrite.txt");
        // to append
        FileWriter writer = new FileWriter("C:\\Users\\USER\\JavaFileIO_Codes\\src\\BufferedAndAssignment\\BufferWrite.txt",true);

        BufferedWriter bufferedWriter = new BufferedWriter(writer);

//        bufferedWriter.write("Abdur Rahman");

        String s = bufferedReader.readLine();  //reads whole line
        bufferedWriter.newLine();  // prints a new line

        while (s != null) {
           bufferedWriter.write(s);
           bufferedWriter.newLine();
           s = bufferedReader.readLine();
        }

//        bufferedWriter.flush();  //bufferWriter saves the file to ram (for a temporary time)
        bufferedWriter.close();  //saves the file to hard-disk (for a permanent time)
    }
}
