
import java.net.*;

public class AddServer{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(1234);

        byte[] buffer1 = new byte[1024];
        byte[] buffer2 = new byte[1024];

        DatagramPacket packet1 = new DatagramPacket(buffer1, buffer1.length);
        DatagramPacket packet2 = new DatagramPacket(buffer2, buffer2.length);

        socket.receive(packet1);
        socket.receive(packet2);

          int num1 = Integer.parseInt(new String(packet1.getData()).trim());
        int num2 = Integer.parseInt(new String(packet2.getData()).trim());

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        socket.close();
    }
}