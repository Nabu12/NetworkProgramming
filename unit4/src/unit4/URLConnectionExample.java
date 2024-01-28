
package unit4;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLConnectionExample {

    public static void main(String[] args) {

        try {
                // Create a URL object
                URL url = new URL("https://www.youtube.com");

                // Open a connection to the URL
                URLConnection urlConnection = url.openConnection();
                Map<String, List<String>>stream =urlConnection.getHeaderFields();
                

                // Get the header fields
                String contentType = urlConnection.getContentType();
                int contentLength = urlConnection.getContentLength();
                long date = urlConnection.getDate();
                Date d1=new Date(date);
                String server = urlConnection.getInputStream().toString();

                // Print the header fields
                System.out.println("Content-Type: " + contentType);
                System.out.println("Content-Length: " + contentLength);
                System.out.println("Date: " + date);
                System.out.println("Date: " + d1);
                System.out.println("Server: " + server);

            }
        catch (IOException e) {
                 e.printStackTrace();
        }
    }
}
 

