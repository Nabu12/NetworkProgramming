import java.net.*;
import java.util.*;

public class HTTP_Example {
    public static void main(String args[]){
   try{
    CookieManager manager=new CookieManager();
    CookieStore cookiestore=manager.getCookieStore();
    HttpCookie cookieA =new HttpCookie("cp","pragyan");
    HttpCookie cookieB=new HttpCookie("c2","Nabina");
    URI uri1= new URI("www.abc.com");
    URI uri2=new URI("www.xyz.com");
    cookiestore.add(uri1,cookieA);
    cookiestore.add(uri2,cookieB);
    List list =cookiestore.getCookies();
    System.out.println("Stores cookies:"+list);
    cookiestore.remove(uri1,cookieA);
    cookiestore.removeAll();
    

} 
catch(Exception e){

}
}
}