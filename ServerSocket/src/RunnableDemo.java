import java.io.*;
import java.net.*;
import java.util.*;
public class RunnableDemo implements Runnable 
     {
  public void run() {
    System.out.println("Hello from MyRunnable!");
  }
    
public static void main(String[] args) {
    RunnableDemo myRunnable = new RunnableDemo();
    Thread thread = new Thread(myRunnable);
    thread.start();
  }
}
