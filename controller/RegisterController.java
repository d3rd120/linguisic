package controller;

import view.*;
import model.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class RegisterController {
    private final RegisterView v;
    private final JButton backButton;
    private final JButton registerButton;
    
    public RegisterController(){
        this.v = new RegisterView();
        
        backButton = v.getBackButton();
        registerButton = v.getRegisterButton();
        
        TheHandler handler = new TheHandler();
        backButton.addActionListener(handler);
        registerButton.addActionListener(handler);
    }
    
    public void showWindow(){
        v.display();
    }
    
    private class TheHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            // String string = "";
            if(event.getSource() == registerButton){
                User u = createUser(); 
                Database db = new Database();
                if(new Checker(u).check()){
                    db.saveUser(u);
                    JOptionPane.showMessageDialog(null,"Success");
                    new LogInController().showWindow();
                    v.undisplay(); 
                }else{
                    JOptionPane.showMessageDialog(null, "Username exists!");
                }
            }else if(event.getSource() == backButton){
                new LogInController().showWindow();
                v.undisplay();
            }
        }
    }
    
    
    private User createUser(){
        User newUser;
        if(v.getMiddleName().equals("")){
            newUser = new User(v.getFirstName(),v.getLastName(),v.getUsername(),v.getPassword());
        }else{
            newUser = new User(v.getFirstName(),v.getMiddleName(),v.getLastName(),v.getUsername(),v.getPassword());
        }
        return newUser;
    }
}
