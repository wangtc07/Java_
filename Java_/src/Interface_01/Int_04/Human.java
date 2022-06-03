package Interface_01.Int_04;

public abstract class Human {
	private String nameString ;
	private int age ;
	
	public Human() {
		super();
	}

	public Human(String nameString, int age) {
		this.nameString = nameString;
		this.age = age;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void eat();
}













