
  import java.net.*;
import java.util.*;

public class URIHeaderFields {
    
  public static void main(String[] args) {
    try {
      URI uri = new URI("http://www.google.com/index.html?key=value#fragment");
      System.out.println("URI: " + uri);

      System.out.println("Scheme: " + uri.getScheme());
      System.out.println("Host: " + uri.getHost());
      System.out.println("Port: " + uri.getPort());
      System.out.println("Path: " + uri.getPath());
      System.out.println("Query: " + uri.getQuery());
      System.out.println("Fragment: " + uri.getFragment());

      System.out.println("\nHeader Fields:");
      URLConnection connection = uri.toURL().openConnection();
      Map<String, List<String>> headerFields = connection.getHeaderFields();
      for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
        String key = entry.getKey();
        List<String> values = entry.getValue();
        for (String value : values) {
          System.out.println(key + ": " + value);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

  

    

