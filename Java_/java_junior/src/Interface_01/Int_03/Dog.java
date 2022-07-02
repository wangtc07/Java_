package Interface_01.Int_03;

public class Dog extends Animal implements Jumping {
	
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("dog jump");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog eat");
	}
	
}
