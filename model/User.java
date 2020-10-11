package model;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private String userName;
    private String password;
    private int id;
    
    public User(String firstName,String middleName,String lastName,String userName,String password){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }
    
    public User(String firstName,String lastName,String userName,String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }
    
    public User(String firstName,String userName,String password){
        this.firstName = firstName;
        this.userName = userName;
        this.password = password;
    }
    
    public User(String userName,String password){
        this.userName = userName;
        this.password = password;
    }

    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setAccount(String userName){
        this.userName = userName;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setId(int id){
        this.id = id;
    } 
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getMiddleName(){
        return this.middleName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getUserName(){
        return this.userName;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void printCheck(){
        System.out.println("First Name : " + this.firstName);
        System.out.println("Middle Name : " + this.middleName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("UserName : " + this.userName);
        System.out.println("Password : " + this.password);
        System.out.println("ID : " + this.id);
    }
}
