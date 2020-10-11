package view;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LogInView extends Window{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final JLabel item1;
    private final JTextField item2;
    private final JLabel item3;
    private final JTextField item4;
    private final JButton item5;
    private final JButton item6;
    private final JPanel panel1;
    private final Container container;
    
    public LogInView(){
        super("Login",500,500);
        this.setLocationRelativeTo(null);
       
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.red);
        
        panel1 = new JPanel();
        panel1.setSize(250,100);
        panel1.setLocation((250/2),300);
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.GRAY);
        
        item1 = new JLabel("Username");
        item1.setToolTipText("Ok cool! this is just for a Username though hh");
        panel1.add(item1);
        
        item2 = new JTextField(10);
        panel1.add(item2);
        
        item3 = new JLabel("Password");
        panel1.add(item3);
        
        item4 = new JTextField(10);
        panel1.add(item4);
        
        
        item5 = new JButton("Login");
        panel1.add(item5);
        
        item6 = new JButton("Register");
        panel1.add(item6);
        
        container.add(panel1);
    }  
    
    public JButton getLoginButton(){
        return this.item5;
    }
    
    public JButton getRegisterButton(){
        return this.item6;
    }
    
    public String getUserTF(){
        return this.item2.getText();
    }
    
    public String getPassTF(){
        return this.item4.getText();
    }
}
