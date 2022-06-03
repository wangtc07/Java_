package Interface_01.Int_03;

public class Cat extends Animal implements Jumping {

	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat eat");
	}
	
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Cat jump");

	}
	
}
