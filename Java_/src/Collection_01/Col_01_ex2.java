package Collection_01;

import java.util.ArrayList;

public class Col_01_ex2 {
	public static void main(String[] args) {
		ArrayList<Student> sList = new ArrayList<>();
		
		//創建學生對象
		Student s1 = new Student("Wang", 5);
		Student s2 = new Student("When", 10);
		Student s3 = new Student("Liee", 15);
		
		//添加對象到List
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		
		//輸出List
		for (Student student : sList) {
			student.showStudent();
		}
	}
}

class Student {
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
}