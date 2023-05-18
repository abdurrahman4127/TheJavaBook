package BufferedAndAssignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class Assignment_IO {
    public static void main(String[] args) throws Exception
    {
        FileReader reader = new FileReader("C:\\Users\\USER\\JavaFileIO_Codes\\src\\BufferedAndAssignment\\Assignment_IO.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        double sum = 0;

        String str = bufferedReader.readLine(); //reading all

//        going until null
        while (str != null) {
            String []words = str.split(" ");  // assigning the attributes as string array to 'words[]'

            for(int i=0; i<str.length(); i++) { // str goes until null, therefore it'll cover all attributes
                try {           //needs to put it inside a try block as we are converting String to Double
                    double d = Double.parseDouble(words[i]);  //String to double
                    sum += d;
                }

                catch (Exception exception) {
                    //
                }
            }
            str = bufferedReader.readLine();  //keep going until null
        }
        System.out.println(sum);  //gotta be outta while-loop
    }
}
