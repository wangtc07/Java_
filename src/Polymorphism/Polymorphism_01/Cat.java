package Polymorphism.Polymorphism_01;
//Cat 繼承 Animal
public class Cat extends Animal{

    public int age = 20;
    public int weight = 10;

    @Override 
    //eat()方法重寫
    public void eat() {
        // TODO Auto-generated method stub
        // super.eat(); 
        System.out.println("Cat eat");
    }

    public void playGame() {
        System.out.println("Cat playGame");
    }
}
