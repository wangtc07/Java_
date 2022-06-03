package Polymorphism.Parameters_Retern;

public class Cat extends Animal implements Jumping {
	int ages = 0;
	@Override
	public void setAges(int ages) {
		// TODO Auto-generated method stub
		System.out.println(ages);
		this.ages = ages;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat eat");
	}

	@Override 								//interface的方法
	public void jumping() {
		// TODO Auto-generated method stub
		System.out.println("Cat Jumping");
	}
}