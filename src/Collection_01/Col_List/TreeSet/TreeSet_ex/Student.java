package Collection_01.Col_List.TreeSet.TreeSet_ex;

public class Student implements Comparable<Student> {
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
	public int compareTo(Student o) {
		int i1 = this.age - o.age;
		
		//如果age相同，再比較name
		int i2 = i1 == 0 ? this.nameString.compareTo(o.nameString) : i1 ;
		
		return i2;
	}

}