
package mypackage;

import java.net.*;
import java.io.*;

public class PrintURLContent {
    public static void main(String[] args) { 
           
        try{
                    
                
        URL url = new URL("https://www.google.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
        System.out.println("Protocol: "+url.getProtocol());    
System.out.println("Host Name: "+url.getHost());    
System.out.println("Port Number: "+url.getPort());    
System.out.println("Default Port Number: "+url.getDefaultPort()); 
    
        }catch(Exception e){
            System.out.println(e);
        }
                
                }
            }
            
    

