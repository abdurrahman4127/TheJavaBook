package TCPExampleCode;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Client Started");

        /*
        Socket sckt = new Socket("127.0.0.1",2111);
        System.out.println("Client Connected");
        ObjectOutputStream oos = new ObjectOutputStream(sckt.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(sckt.getInputStream());
        */

        while (true){
            Socket sckt = new Socket("127.0.0.1",2111);
            System.out.println("Client Connected");

            ObjectOutputStream oos = new ObjectOutputStream(sckt.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(sckt.getInputStream());

            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();

            oos.writeObject(msg);
            Object rcvStr = ois.readObject();
            System.out.println("From Server : " + (String)rcvStr);
        }
    }
}