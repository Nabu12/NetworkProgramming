import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Client {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in );
        try{
            
            Socket client = new Socket("localhost",9000);
            while(true){
                System.out.println("Enter text:");
                String output =sc.nextLine();
             DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            dos.writeUTF(output);
            
            DataInputStream dis=new DataInputStream(client.getInputStream());
             String input =dis.readUTF();
            System.out.println("Data From server" +input);
            
           
            
        }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
}