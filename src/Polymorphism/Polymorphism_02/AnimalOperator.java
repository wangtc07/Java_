package Polymorphism.Polymorphism_02;

public class AnimalOperator {
    //新增不同子類時，必須要新增代碼
    // public void eat(Cat c) {    //Cat c = new Cat(); 等於將new Cat()帶過來
    //     c.eat();
    // }
    // public void eat(Dog d) {
    //     d.eat();
    // }

    //新增不同子類時，不用再修改
    public void eat(Animal a) {    //將子類帶進父類
        a.eat();
    }
}