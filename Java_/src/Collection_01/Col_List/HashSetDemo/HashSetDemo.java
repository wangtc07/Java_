package Collection_01.Col_List.HashSetDemo;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//創建HashSet col
		HashSet<Student> hashSet = new HashSet<Student>();
		
		//創建student對象
		Student s1 = new Student("Wang", 5);
		Student s2 = new Student("Kaki", 17);
		Student s3 = new Student("Mayu", 22);
		System.out.println(s2.hashCode());	//預設2088051243	
		
		Student s4 = new Student("Kaki", 17);
		System.out.println(s4.hashCode());	//預設1277181601
		
		//添加到col
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		
		hashSet.add(s4);	//添加成功 因預設hashCoed不同

		
		for (Student student : hashSet) {
			System.out.println(student);
		}
	}
}
