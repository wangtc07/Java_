package Polymorphism.Polymorphism_03_ex;

public class Dog extends Animal{
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Dog eat");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    
}
