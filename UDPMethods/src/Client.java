import java.net.*;
import java.io.*;
import java.util.*;
public class Client {
  public static void main(String args[]){
      try{
      DatagramSocket ds = new  DatagramSocket();
      InetAddress address = InetAddress.getByName("localhost");
      int port = 1234;
      byte[]buffer = {12,13};
      byte[]buffer1 = new byte[2];
       DatagramPacket dp = new DatagramPacket(buffer,2,address,port);
        DatagramPacket receive = new  DatagramPacket(buffer1,2);
        ds.connect(address,port);
        System.out.println("Bound"+ ds.isBound());
        System.out.println("connected"+ ds.isConnected());
        System.out.println("InetAddress"+ ds.getInetAddress());
        System.out.println("Port"+ ds.getPort());
        System.out.println("RemoteSocket"+ ds.getRemoteSocketAddress());
        System.out.println("LocalSocket"+ ds.getLocalSocketAddress());
        ds.send(dp);
        System.out.println("DataPacket Sent");
        ds.receive(receive);
        System.out.println("DataReceived"+  Arrays.toString(receive.getData()));
        System.out.println("LocalPort"+ ds.getLocalPort());
        ds.setSoTimeout(100);
        
      }
      catch(Exception e){
          System.out.println(e);
      }
  }  
}
