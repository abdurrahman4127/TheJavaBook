package SumNumbersFromFileOI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCode {
    public static void main(String[] args)
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\JavaFileIO_Codes\\src\\SumNumbersFromFileOI\\readme.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\USER\\JavaFileIO_Codes\\src\\SumNumbersFromFileOI\\written_text.txt"));  //not appending

            int num = 0;
            String s =  br.readLine();

            while (s != null)
            {
                String []words = s.split(" ");

                for(int i=0; i<s.length(); i++)
                {
                    try{
                        int a = Integer.parseInt(words[i]);
                        num = num + a;
                    }
                    catch (Exception e){
                        //
                    }
                }

                bw.write(s);
                bw.newLine();
                s = br.readLine();
            }
//            System.out.println(num);
            bw.write("sum of total numbers : " + num); //writes within the file

            //must be closed
            br.close();
            bw.close();
        }

        catch (Exception e){
            e.getMessage();
        }
    }
}
