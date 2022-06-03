package Collection_01.Col_List.HashSetDemo;

public class Student {
	private String nameString ;
	private int age;
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
	public Student(String nameString, int age) {
		super();
		this.nameString = nameString;
		this.age = age;
	}
	public void showStudent() {
		System.out.println(nameString + ", age:" + age);
	}
	@Override
	public String toString() {
		String string = nameString + " " + age ;
		return string;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((nameString == null) ? 0 : nameString.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (nameString == null) {
			if (other.nameString != null)
				return false;
		} else if (!nameString.equals(other.nameString))
			return false;
		return true;
	}
}
