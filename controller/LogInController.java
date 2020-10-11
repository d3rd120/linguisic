package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;
import model.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class LogInController {
    private final LogInView v;
    private final JButton loginButton;
    private final JButton registerButton;
    
    public LogInController(){
        this.v = new LogInView();
        this.loginButton = v.getLoginButton();
        this.registerButton = v.getRegisterButton();
        
        
        TheHandler handler = new TheHandler();
        registerButton.addActionListener(handler);
        loginButton.addActionListener(handler);   
    }
    
    
    
    private class TheHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            String string = "";
            if(event.getSource() == registerButton){
                v.setVisible(false);
                new RegisterController().showWindow();
            }else if(event.getSource() == loginButton){
                // Checker checker = new Checker();
                if(true){
                    JOptionPane.showMessageDialog(null,"YES!!");
                }
                JOptionPane.showMessageDialog(null,"WRONG!!");
            }
        }
    }
    
    public void showWindow(){
        v.setVisible(true);
    }
}
