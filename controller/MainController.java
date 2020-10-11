package controller;

public class MainController {
    private final LogInController c;
    
    public MainController(LogInController c){
        this.c = c;
    }
    
    public void run(){
        c.showWindow();
    }
    
    public static void main(String[] args){
        MainController main = new MainController(new LogInController());
        main.run();
    }
}
