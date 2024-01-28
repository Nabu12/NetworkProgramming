

import java.io.PrintWriter;
import java.net.InetSocketAddress;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class CipherSuitesMethods {
    public static void main(String[] args) {
        try {
            SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket sso = (SSLSocket) ssf.createSocket("google.com", 80);

            System.out.println((sso.getEnabledCipherSuites()));
            String[] cipherSuites = sso.getSupportedCipherSuites();
            System.out.println(cipherSuites);
            System.out.println(sso.getRemoteSocketAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// public class CipherSuitesMethods {
// public static void main(String[] args) {
// try {
// SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
// SSLSocket sso = (SSLSocket) ssf.createSocket();
// sso.connect(new InetSocketAddress("localhost", 8000));
// System.out.println((sso.getEnabledCipherSuites()));
// System.out.println(sso.getSupportedCipherSuites());
// System.out.println(sso.getRemoteSocketAddress());
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }