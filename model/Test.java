package model;


public class Test{
    private String name;

    public Test(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static void main(String[] args){
        Test test = new Test("kenji");
        System.out.println(test.getName());
    }
}