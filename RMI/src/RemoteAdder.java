import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteAdder extends UnicastRemoteObject implements Adder {
    RemoteAdder() throws RemoteException {
        super();
    }

    public int add(int x, int y) {
        return x + y;
    }
}