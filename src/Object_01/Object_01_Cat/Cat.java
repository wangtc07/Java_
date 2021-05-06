package Object_01.Object_01_Cat;

public class Cat {
	private int age ;
	private String nameString ;
	
	
	public Cat() {
		super();
	}

	public Cat(int age) {
		super();
		this.age = age;
	}

	public Cat(int age, String nameString) {
		super();
		this.age = age;
		this.nameString = nameString;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public void eat() {
		System.out.println("MEOW~~~");
	}
	
	public void showInfo() {
		System.out.println("name= " + nameString);
		System.out.println("age = " + age);
	}
	
	
	
	
}
