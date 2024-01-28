  import java.net.*;

public class Client {
    public static void main(String []args){
        try{
            InetAddress address =    InetAddress.getByName("224.0.0.1");
            byte[]buffer = new byte[256];
            MulticastSocket socket = new MulticastSocket(1234);
            socket.joinGroup(address);
            while(true){
                DatagramPacket dp = new  DatagramPacket(buffer,buffer.length);
                socket.receive(dp);
                String data  = new String (buffer,0,buffer.length);
                System.out.print("Received Data "+data);
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
