
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class MouseEventTest implements MouseListener {
    JFrame f;
    JButton b;
    public MouseEventTest(){
   f = new JFrame("Catch me test");
    b= new JButton("Catch me");
    b.setBounds(20, 20,150,20);
    b.addMouseListener(this);
    f.add(b);
    f.setSize(600,600);
    f.setLayout(null);
    f.setVisible(true);
    }
    public static void main(String[]args){
        new MouseEventTest();
    }
     public void mouseClicked(MouseEvent e){
         
     }
       public void mouseEntered(MouseEvent e){
          Random  r=new Random();
          int x=r.nextInt(150, 450); 
          int y= r.nextInt(0, 580);
           b.setBounds(x, y, 150,20);
       }
     
      public void mousePressed(MouseEvent e){
          
      }
       public void mouseReleased(MouseEvent e){
}
        public void mouseExited(MouseEvent e){
            
        }
     
}

