
 import java.io.*;
import java.net.*;

public class URLToFile {
    public static void main(String[] args) {
        String urlString = "https://youtube.com"; // replace with the URL you want to save
        String outputFileName = "output.html"; // replace with the file name you want to save the content as

        try {
            // create a URL object from the given URL string
            URL url = new URL(urlString);

            // open a connection to the URL and get an input stream for reading its content
            InputStream in = url.openStream();

            // create a file output stream to write the content to the output file
            FileOutputStream out = new FileOutputStream(outputFileName);

            // read data from the input stream and write it to the output file
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            // close the streams
            in.close();
            out.close();

            System.out.println("Successfully saved the content of " + urlString + " to " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
