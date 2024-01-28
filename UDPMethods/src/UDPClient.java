

import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        String message = "Hello, server I am Client!";
        InetAddress serverAddress = InetAddress.getByName("localhost");
        int serverPort = 5000;
        int bufferSize = 1024;

        DatagramSocket clientSocket = new DatagramSocket();
        clientSocket.setSoTimeout(5000);
        clientSocket.setSendBufferSize(bufferSize);
        clientSocket.setReceiveBufferSize(bufferSize);

        byte[] sendData = message.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
        clientSocket.send(sendPacket);

        byte[] receiveData = new byte[bufferSize];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Server response: " + response);

        clientSocket.close();
    }
}