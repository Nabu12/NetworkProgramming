import java.net.InetSocketAddress;
import javax.net.ssl.*;
import java. net.Socket;


public class CipherSuites {
    public static void main(String args[]){
        try{
            Socket S = new Socket();
            SSLSocketFactory ssf = ( SSLSocketFactory)SSLSocketFactory.getDefault();
            SSLSocket ssl = (  SSLSocket)ssf.createSocket();
          ssl.connect(new InetSocketAddress("www.youtube.com",443));
          System.out.println(ssl.getEnabledCipherSuites());
          System.out.println(ssl.getSupportedCipherSuites());
          System.out.println(ssl.getRemoteSocketAddress());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
