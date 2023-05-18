package NewlineProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class NewlineLine {
    public static void main(String[] args)
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\USER\\JavaFileIO_Codes\\src\\NewlineProblem\\input_file.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\USER\\JavaFileIO_Codes\\src\\NewlineProblem\\generated_file.txt"));

            String[] lines = new String[10000];

            //counting total numbers of lines
            int count = 0;
            while ((lines[count] = bufferedReader.readLine()) != null) {
                count++;
            }

            //going up to the last line
            for(int i=0; i<(count-1); i++)
            {
                if(lines[i].isEmpty()) {
                    bufferedWriter.write(lines[i] + "\n");
                }

                else {
                    bufferedWriter.write(lines[i] + "\n\n");
                }
            }

            bufferedWriter.write(lines[count-1]);  //writing the last line
            
            bufferedWriter.close();
        }

        catch(Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}