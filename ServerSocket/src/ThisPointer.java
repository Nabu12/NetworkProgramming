
 import java.net.*;
 import java.io.*;
public class ThisPointer {
    
    
    private String name;
    private int age;
    
    public ThisPointer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    
    public static void main(String[] args) {
        ThisPointer person = new ThisPointer("Nabina", 30);
        person.printInfo();
    }
}



