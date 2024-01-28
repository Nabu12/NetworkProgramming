   
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login implements ActionListener{
     JTextField tfUser;
     JTextField tfpassword;
     JFrame f;
    public Login(){
        JFrame f = new JFrame("Login");
        JLabel user = new JLabel("Username");
        user.setBounds(20, 20, 150, 20);
        f.add(user);
       tfUser=new JTextField();
        tfUser.setBounds(180, 20, 150, 20);
        f.add(tfUser);
    
  JLabel password = new JLabel("Password");
        password.setBounds(20, 60, 150, 20);
        f.add(password);
        tfpassword=new JTextField();
        tfpassword.setBounds(180, 60, 150, 20);
        f.add(tfpassword);
        JButton b= new JButton("Login");
        b.setBounds(180, 100, 150, 20);
        b.addActionListener(this);
         f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[]args){
        new Login();
    }
    public void actionPerformed(ActionEvent e){
        String user = tfUser.getText();
        String password =tfpassword.getText();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava_2023", "root", "#N@bina123");
        Statement smt=con.createStatement();
        ResultSet rs = smt.executeQuery("Select * from User where username='"+user+"' and password='"+password+"'");
        if(user.equals(rs.getString(" username"))&&password.equals(rs.getString("password"))){
            JDialog d= new JDialog(f,"login success",true);
            d.setLocationRelativeTo(d);
            d.setSize(100, 100);
            d.setVisible(true);
    }
        }
        
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
}
}