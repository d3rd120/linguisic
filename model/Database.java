package model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Database {
    private User u;
    private ArrayList<String> fL;
    private ArrayList<String> mL;
    private ArrayList<String> lL;
    private ArrayList<String> uL;
    private ArrayList<String> pL;
    
    public Database(){
        this.setToListData();
    }
    
    public Database(User u){
        this.u = u;
        setToListData();
        
    }
    
    public int getId(User u){
        int i;
        for(i = 0 ; i < fL.size() ; i++){
            if(fL.get(i).equals(u.getUserName())){
                break;
            }
        }
        return i;
    }
    
    public int getId(String userName){
        int i;
        for(i = 0 ; i < uL.size() ; i++){
            if(fL.get(i).equals(userName)){
                break;
            }
        }
        return i;
    }
    
    private int setId(){
        int c;
        for(c = 0 ; c < fL.size() ; c++){
            if(fL.get(c).equals(u.getUserName())){
                break;
            }
        }
        return c;
    }
    
    public void saveUser(User u){
        this.u = u;
        this.insertToList();
        saveUsers();
    }
    
    public ArrayList<String> getFL(){
        return this.fL;
    }
    
    public ArrayList<String> getML(){
        return this.mL;
    }
    
    public ArrayList<String> getLL(){
        return this.lL;
    }
    
    public ArrayList<String> getUL(){
        return this.uL;
    }
    
    public ArrayList<String> getPL(){
        return this.pL;
    }
   
    private void setToListData(){
        setToListFirstName();
        setToListMiddleName();
        setToListLastName();
        setToListUserName();
        setToListPassword(); 
        
    }
     
    private void setToListFirstName(){
        try{
            fL = new ArrayList<>();
            FileReader fr = new FileReader(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/firstName.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while( (line = br.readLine()) != null){
                fL.add(line);
            }
            br.close();
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
    private void setToListMiddleName(){
        try{
            mL = new ArrayList<>();
            FileReader fr = new FileReader(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/middleName.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while( (line = br.readLine()) != null){
                mL.add(line);
            }
            br.close();
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
    private void setToListLastName(){
        try{
            lL = new ArrayList<>();
            FileReader fr = new FileReader(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/lastName.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while( (line = br.readLine()) != null){
                lL.add(line);
            }
            br.close();
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
    private void setToListUserName(){
        try{
            uL = new ArrayList<>();
            FileReader fr = new FileReader(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/userName.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while( (line = br.readLine()) != null){
                uL.add(line);
            }
            br.close();
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
    private void setToListPassword(){
        try{
            pL = new ArrayList<>();
            FileReader fr = new FileReader(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/password.txt"));
            BufferedReader br = new BufferedReader(fr);
            String line;
            while( (line = br.readLine()) != null){
                pL.add(line);
            }
            br.close();
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
    
    
   
    
    private void saveUsers(){
        insertFirstName();
        insertMiddleName();
        insertLastName();
        insertUsername();
        insertPassword();
    }
    
    private void insertToList(){
        fL.add(u.getFirstName());
        mL.add(u.getMiddleName());
        lL.add(u.getLastName());
        uL.add(u.getUserName());
        pL.add(u.getPassword());
    }
    
    private void insertFirstName(){
        try{
            FileWriter fw = new FileWriter(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/firstName.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0 ; i < fL.size() ; i++){
                bw.write(fL.get(i));
                bw.newLine();
            }
            bw.close();
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
    private void insertMiddleName(){
        try{
            FileWriter fw = new FileWriter(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/middleName.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0 ; i < mL.size() ; i++){
                bw.write(mL.get(i));
                bw.newLine();
            }
            bw.close();
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
    private void insertLastName(){
        try{
           FileWriter fw = new FileWriter(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/lastName.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0 ; i < lL.size() ; i++){
                bw.write(lL.get(i));
                bw.newLine();
            }
            bw.close(); 
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
    private void insertUsername(){
        try{
            FileWriter fw = new FileWriter(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/userName.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0 ; i < uL.size() ; i++){
                bw.write(uL.get(i));
                bw.newLine();
            }
            bw.close();
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
    private void insertPassword(){
        try{
            FileWriter fw = new FileWriter(new File("/Users/kenjisugino/NetBeansProjects/LINGUISIC/src/data/password.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0 ; i < pL.size() ; i++){
                bw.write(pL.get(i));
                bw.newLine();
            }
            bw.close();
        }catch(FileNotFoundException fnfe){}catch(IOException ioe){}
        
    }
    
}
