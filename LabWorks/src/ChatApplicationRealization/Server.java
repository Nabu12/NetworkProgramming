   package ChatApplicationRealization;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            ServerSocket server = new ServerSocket(8000);
            Socket client;
            System.out.println("Waiting for client ...");
            client = server.accept();
            while (true) {
                // Sending Message
                System.out.println("Write your message:");
                String msgToSend = sc.nextLine();
                DataOutputStream dos = new DataOutputStream(client.getOutputStream());
                dos.writeUTF(msgToSend);

                // Print Client Message
                DataInputStream dis = new DataInputStream(client.getInputStream());
                String receivedMsg = dis.readUTF();
                System.out.println("Message from Client: " + receivedMsg);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Connection Closed");
        }
        sc.close();
    }
}