package Collection_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Col_01_ex3 {
	public static void main(String[] args) {
		ArrayList<Student1> sList = new ArrayList<Student1>();
		
		addToList(sList);
		addToList(sList);
		addToList(sList);
		
		for (Student1 student1 : sList) {
			student1.showStudent1();
		}
	}
	//創建添加學生到List的方法，void 參數List
	public static void addToList(ArrayList<Student1> sList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name");
		String nameString = sc.nextLine();
		System.out.println("age");
		String ageString = sc.nextLine();
		
		//賦值給學生對象
		Student1 st = new Student1();
		st.setNameString(nameString);
		st.setAge(ageString);
		
		//添加到List
		sList.add(st);
	}	
}

class Student1 {
	private String nameString ;
	private String age;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Student1(String nameString, String age) {
		super();
		this.nameString = nameString;
		this.age = age;
	}
	
	public Student1() {
	}
	
	public void showStudent1() {
		System.out.println(nameString + ", age:" + age);
	}
}