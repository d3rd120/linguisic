package model;

import java.util.ArrayList;

public class Checker {
    private User u;
    private final ArrayList<String> userNameL;
    private final ArrayList<String> passwordL;
    
    public Checker(){
        this.userNameL = new Database().getUL();
        this.passwordL = new Database().getPL();
    }
    
    public Checker(User u){
        this.u = u;
        userNameL = new Database().getUL();
        passwordL = new Database().getPL();
    }
    
    public void setPassword(){
        
    }
    
    public boolean check(){
        for(int i = 0 ; i < userNameL.size(); i++){
            if(userNameL.get(i).equals(u.getUserName())){
                return false;
            }
        }
        return true;
    }
    
    public boolean check(String userName,String password){
        int id = new Database().getId(userName);
        if(passwordL.get(id).equals(password)) return true;
        return false;
    }
}
