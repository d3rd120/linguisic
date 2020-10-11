package view;


import javax.swing.JFrame;
import model.*;

public class Window extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public String name;
    private Size size;
    
    public Window(String name,int width,int height){
        this.name = name;
        this.setTitle(this.name);
        this.size = new Size(width,height);
        this.setSize(this.size.getWidth(),this.size.getHeight());
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    public String getName(){
        return this.name;
    } 
}
