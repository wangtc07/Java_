package Polymorphism.Polymorphism_03_ex;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲貓");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println(a);
        System.out.println("=============");

        a = new Cat("加菲貓" , 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println(a);
    }
}
