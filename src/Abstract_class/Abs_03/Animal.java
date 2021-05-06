package Abstract_class.Abs_03;

public abstract class Animal {
	
	//成員變數
	private int age = 20;
	private final String sityString = "taipei";
	
	//可以有建構子
	public Animal(){
	}
	
	public Animal(int age) {
		this.age = age;
	}
	
	//可以有非抽象方法
	public void show() {
		age = 30;
		System.out.println(age);
		System.out.println(sityString);
	}
	
	public abstract void eat();
}
