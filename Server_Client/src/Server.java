
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
   public static void main(String[] args) {
        try { 
             ServerSocket serverSocket = new ServerSocket(8081);
             Socket client;
              System.out.println("Server started, waiting for clients to connect...");
               client = serverSocket.accept();
                while (true) {
                    String output ="Hello from server";
                     DataOutputStream dos = new DataOutputStream(client.getOutputStream());
             dos.writeUTF(output);
              DataInputStream dis = new DataInputStream(client.getInputStream());
              String input = dis.readUTF();
                System.out.println(input);
          
                }
            
        } catch(Exception e){
            System.err.println("Server error: " + e.getMessage());
        } 
}
   }
