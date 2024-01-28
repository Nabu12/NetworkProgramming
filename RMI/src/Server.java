 import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Server {
    public static void main(String[] args) {
        try {
            Adder stub = new RemoteAdder();
            Registry registry = LocateRegistry.createRegistry(8000);
            registry.rebind("nist", stub);
            System.out.println("Server started successfully.");
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }
}