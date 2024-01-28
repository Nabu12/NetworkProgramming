import java.net.*;

public class DatagramPacketExample {
    private static final int MAX_PACKET_SIZE = 65507; // Maximum size of a UDP packet
    
    public static void main(String[] args) {
        try {
            // Create a UDP socket and address to send the packet to
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            int port = 12345;
            
            // Create a message to send
            String message = "Hello, world!";
            byte[] messageBytes = message.getBytes();
            
            // Create a UDP packet to send the message
            DatagramPacket sendPacket = new DatagramPacket(messageBytes, messageBytes.length, address, port);
            
            // Use getter methods to print information about the send packet
            System.out.println("Send packet address: " + sendPacket.getAddress());
            System.out.println("Send packet port: " + sendPacket.getPort());
            System.out.println("Send packet length: " + sendPacket.getLength());
            System.out.println("Send packet offset: " + sendPacket.getOffset());
            System.out.println("Send packet data (string): " + new String(sendPacket.getData()));
            
            // Use setter methods to change the send packet data and offset
            byte[] newMessageBytes = "New message!".getBytes();
            int newOffset = 2;
            sendPacket.setData(newMessageBytes, newOffset, newMessageBytes.length - newOffset);
            System.out.println("New send packet offset: " + sendPacket.getOffset());
            System.out.println("New send packet data (string): " + new String(sendPacket.getData()));
            
            // Send the packet
            socket.send(sendPacket);
            
            // Receive a UDP packet
            byte[] receiveBuffer = new byte[MAX_PACKET_SIZE];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(receivePacket);
            
            // Use getter methods to print information about the received packet
            System.out.println("Received packet address: " + receivePacket.getAddress());
            System.out.println("Received packet port: " + receivePacket.getPort());
            System.out.println("Received packet length: " + receivePacket.getLength());
            System.out.println("Received packet offset: " + receivePacket.getOffset());
            System.out.println("Received packet data (string): " + new String(receivePacket.getData()));
            
            // Use setter methods to change the received packet data and offset
            byte[] newReceiveData = "New receive data!".getBytes();
            int newReceiveOffset = 2;
            receivePacket.setData(newReceiveData, newReceiveOffset, newReceiveData.length - newReceiveOffset);
            System.out.println("New received packet offset: " + receivePacket.getOffset());
            System.out.println("New received packet data (string): " + new String(receivePacket.getData()));
            
            socket.close(); // Close the socket
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
