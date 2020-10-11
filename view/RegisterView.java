package view;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RegisterView extends Window{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final JLabel firstNameLabel;
    private final JLabel middleNameLabel;
    private final JLabel lastNameLabel;
    private final JLabel userNameLabel;
    private final JLabel passwordLabel;
    private final JTextField firstNameTF;
    private final JTextField middleNameTF;
    private final JTextField lastNameTF;
    private final JTextField userNameTF;
    private final JTextField passwordTF;
    private final JButton backButton;
    private final JButton registerButton;
    private final JPanel panel1;
    private final Container container;
    
    public RegisterView(){
        super("Register",500,500);
        this.setLocationRelativeTo(null);
        
        container = this.getContentPane();
        container.setBackground(Color.GRAY);
        container.setLayout(null);
        
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setSize(190,300);
        panel1.setLocation(150,100);
        panel1.setBackground(new Color(159,150,150));
        
        firstNameLabel = new JLabel("First Name");
        panel1.add(firstNameLabel);
        
        firstNameTF = new JTextField(10);
        panel1.add(firstNameTF);
        
        middleNameLabel = new JLabel("Middle Name");
        panel1.add(middleNameLabel);
        
        middleNameTF = new JTextField(10);
        panel1.add(middleNameTF);
        
        lastNameLabel = new JLabel("Last Name");
        panel1.add(lastNameLabel);
        
        lastNameTF = new JTextField(10);
        panel1.add(lastNameTF);
        
        userNameLabel = new JLabel("Username");
        panel1.add(userNameLabel);
        
        userNameTF = new JTextField(10);
        panel1.add(userNameTF);
        
        passwordLabel = new JLabel("Password");
        panel1.add(passwordLabel);
        
        passwordTF = new JTextField(10);
        panel1.add(passwordTF);
        
        backButton = new JButton("back");
        panel1.add(backButton);
        
        registerButton = new JButton("register");
        panel1.add(registerButton);
        
        container.add(panel1);
    }
    
    public String getFirstName(){
        return this.firstNameTF.getText();
    }
    
    public String getMiddleName(){
        return this.middleNameTF.getText();
    }
    
    public String getLastName(){
        return this.lastNameTF.getText();
    }
    
    public String getUsername(){
        return this.userNameTF.getText();
    }
    
    public String getPassword(){
        return this.passwordTF.getText();
    }
    
    public JButton getBackButton(){
        return this.backButton;
    }
    
    public JButton getRegisterButton(){
        return this.registerButton;
    }
    
    public void display(){
        this.setVisible(true);
    }
    
    public void undisplay(){
        this.setVisible(false);
    }
}
