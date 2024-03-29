import java.net.*;
import java.util.Scanner;

public class AddClient {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        DatagramSocket socket = new DatagramSocket();

        byte[] buffer1 = new byte[1024];
        byte[] buffer2 = new byte[1024];

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        buffer1 = Integer.toString(num1).getBytes();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        buffer2 = Integer.toString(num2).getBytes();

        InetAddress address = InetAddress.getLocalHost();
        DatagramPacket packet1 = new DatagramPacket(buffer1, buffer1.length, address, 1234);
        DatagramPacket packet2 = new DatagramPacket(buffer2, buffer2.length, address, 1234);
          socket.send(packet1);
        socket.send(packet2);

        socket.close();
    }
}