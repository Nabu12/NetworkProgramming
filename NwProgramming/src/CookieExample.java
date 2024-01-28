
import java.net.*;
import java.io.*;
import java.util.List;
public class CookieExample {
    public static void main(String[]args){
        try{
          
            CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore
            = cookieManager.getCookieStore();
        HttpCookie cookieA = new HttpCookie("Name", "Nabina Agasti");
        HttpCookie cookieB = new HttpCookie("Address", "Dhading");
         URI uri1 = new URI("http://example.com");
            URI uri2 = new URI("def.com");
         cookieStore.add(uri1, cookieA);
        cookieStore.add(uri2, cookieB);
         System.out.println(
            "Cookies successfully added\n");
         List cookieList = cookieStore.getCookies();
        System.out.println("Cookies in CookieStore : "
                           + cookieList + "\n");
 
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
}
