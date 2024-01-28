

import javax.net.ssl.*;

public class SecureSocketExample {
    public static void main(String[] args) {
        try {
            SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) ssf.createSocket("www.google.com", 443);

            String[] suites = socket.getSupportedCipherSuites();
            socket.setEnabledCipherSuites(suites);
            socket.addHandshakeCompletedListener(new MyHandShake());
            socket.startHandshake();
            System.out.println("Connected to " + socket.getRemoteSocketAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyHandShake implements HandshakeCompletedListener {
    @Override
    public void handshakeCompleted(HandshakeCompletedEvent e) {
        System.out.println("Session Info " + e.getSession());
    }
}