package Polymorphism.Polymorphism_02;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();

        Cat c = new Cat();
        ao.eat(c);
        Dog d = new Dog();
        ao.eat(d);

        // ao.weight(c);   //err不能使用子類特有方法
    }
}
