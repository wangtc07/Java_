package Interface_01.Int_03;

public class AnimalDemo {
	public static void main(String[] args) {
		Jumping jumpCat = new Cat();
		Jumping jumpDog = new Dog();

		jumpCat.jump();
		
		System.out.println();
		Animal animalCat = new Cat();
		Animal animalDog = new Dog();
		
		animalCat.setAge(10);
		animalCat.setName("Cat Demo");
		System.out.println(animalCat.getAge() + "  " + animalCat.getName());
		animalCat.eat();
		
//		抽象類裡沒有的方法，不能調用
//		animalCat.jump();
		
		System.out.println();
		animalCat = new Cat("Cat 有參方法", 20);
		System.out.println(animalCat.getAge() + "  " + animalCat.getName());
		animalCat.eat();

		System.out.println("---------------");
		
//		使用子類創建對象，介面和抽象類的方法都可以使用
		Cat c = new Cat();
		c.setAge(30);
		c.setName("Cat 實例化Cat");
		System.out.println(c.getAge() + "   " + c.getName());
		c.eat();
		c.jump();
		
	}
}
