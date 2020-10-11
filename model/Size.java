package model;

public class Size {
    private int width;
    private int height;
    
    public Size(int width,int height){
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public void displaySizeToConsole(){
        System.out.println("Width : " + this.width + "Height : " + this.height);
    }
}

