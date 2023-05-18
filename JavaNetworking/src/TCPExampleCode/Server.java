/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCPExampleCode;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket srvsck = new ServerSocket(2111);
        System.out.println("Server Started......");
        
        while(true){
            Socket sckt = srvsck.accept();
            System.out.println("Client Connected....");

            ObjectInputStream ois = new ObjectInputStream(sckt.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(sckt.getOutputStream());

            Object msg = ois.readObject();
            System.out.println((String)msg + "From Client");

            String srvMsg = (String)msg;
            srvMsg = srvMsg.toUpperCase();

            oos.writeObject(srvMsg);
        }
    }
}
