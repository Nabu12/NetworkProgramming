
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
    public static void main(String[]args){
       
        try{
            Scanner sc=new Scanner(System.in);
            while(true){
           
            ServerSocket server = new ServerSocket(467);
             System.out.println("Server Started");
             
            Socket client;
            System.out.println("waiting for client");
            client = server.accept();
            
           System.out.println("Connect Successfully");
            DataInputStream dis = new DataInputStream(client.getInputStream());
             String input = dis.readUTF();
              System.out.println("Message from Client:"+input);
            
              String output = sc.nextLine();
              
              DataOutputStream dos = new DataOutputStream(client.getOutputStream());
             dos.writeUTF(output);
 
        }
        }catch(Exception e){
            System.out.println("Error in server:" + e.getMessage());
        }
    }
    
    
}

