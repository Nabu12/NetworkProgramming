

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;

public class RegisterUser implements ActionListener{
    
    
        JTextField tfUser;
        JFrame f;
        JPasswordField tPassword;
    
        public RegisterUser() {
            f = new JFrame("Register User");
            JLabel user = new JLabel("Username");
            user.setBounds(20, 20, 150, 20);
            f.add(user);
    
            tfUser = new JTextField();
            tfUser.setBounds(180, 20, 150, 25);
            f.add(tfUser);
    
            JLabel lPassword = new JLabel("Password");
            lPassword.setBounds(20, 55, 150, 25);
            f.add(lPassword);
    
            tPassword = new JPasswordField();
            tPassword.setBounds(180, 55, 150, 25);
            f.add(tPassword);
    
            JButton b = new JButton("Register");
            b.setBounds(180, 100, 100, 25);
            b.addActionListener(this);
            f.add(b);
    
            f.setSize(600, 600);
            f.setLayout(null);
            f.setVisible(true);
        }
    
        public static void main(String[] args) {
            new RegisterUser();
    
        }
    

        public void actionPerformed(ActionEvent e) {
            String user = tfUser.getText();
            String password = tPassword.getText();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava_2023","root","");
                Statement st=con.createStatement();
                int rs=st.executeUpdate("insert into user(username,password) values('"+user+"','"+password+"')" );
               
    
                if(rs>0)
                {
                    JDialog d = new JDialog(f, "User Successfully registered", true);
                    d.setLocationRelativeTo(d);
                    d.setSize(100, 100);
                    d.setVisible(true);
    
          
            } 
                con.close();
                tfUser.setText("");
                tPassword.setText("");
            }catch (Exception ex) {
                System.out.println(ex.getMessage());
    
            }
        }
    
    }
    
