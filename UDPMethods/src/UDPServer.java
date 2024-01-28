

import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        int serverPort = 5000;
        int bufferSize = 1024;

        DatagramSocket serverSocket = new DatagramSocket(serverPort);
        serverSocket.setSoTimeout(0);
        serverSocket.setSendBufferSize(bufferSize);
        serverSocket.setReceiveBufferSize(bufferSize);

        byte[] receiveData = new byte[bufferSize];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        serverSocket.receive(receivePacket);

        String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Received message from client: " + message);

        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();
        String response = "Hello, client! Server welcome you!";
        byte[] sendData = response.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
        serverSocket.send(sendPacket);

        serverSocket.close();
    }

}