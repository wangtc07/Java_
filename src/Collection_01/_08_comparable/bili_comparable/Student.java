package Collection_01._08_comparable.bili_comparable;

public class Student implements Comparable<Student> {
	
	
	@Override
	public int compareTo(Student o) {
		int num1 = this.age - o.age;
		int num2 = num1 == 0 ? this.name.compareTo(o.name) : num1;
		return num2;
	}

	private String name;
	private int age;
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		String string = name + " " + age ;
		return string;
	}
}
