
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            ServerSocket server = new ServerSocket(5000);
        
            Socket client;
            System.out.println("waiting for client");
            client=server.accept();
            while(true){
                
                System.out.println("write your message");
                String msgTosend = sc.nextLine();
                
               DataOutputStream dos = new DataOutputStream(client.getOutputStream());
               dos.writeUTF(msgTosend);
               
                DataInputStream dis = new DataInputStream(client.getInputStream());
                String receivedMsg = dis.readUTF();
                System.out.println("Message from Client: " + receivedMsg);
                
            }
            
            
        }catch(Exception e){
             System.out.println(e);
            System.out.println("Connection Closed");
            
        }
        sc.close();
}
}