package Polymorphism.Polymorphism_03_ex;

public class Cat extends Animal{

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Cat eat");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    
}
