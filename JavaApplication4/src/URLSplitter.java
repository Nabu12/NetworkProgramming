import java.net.MalformedURLException;
import java.net.URL;

public class URLSplitter {

    public static void main(String[] args) {
        String urlString = "https://www.example.com:8080/path/to/resource?param1=value1&param2=value2#section1";
        
        try {
            URL url = new URL(urlString);
            
            String scheme = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            String path = url.getPath();
            String query = url.getQuery();
            String fragment = url.getRef();
            
            System.out.println("Scheme: " + scheme);
            System.out.println("Host: " + host);
            System.out.println("Port: " + port);
            System.out.println("Path: " + path);
            System.out.println("Query: " + query);
            System.out.println("Fragment: " + fragment);
            
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString);
            e.printStackTrace();
        }
    }
}
