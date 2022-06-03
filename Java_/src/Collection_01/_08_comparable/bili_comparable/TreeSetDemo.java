package Collection_01._08_comparable.bili_comparable;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//創建集合
		TreeSet<Student> tSet = new TreeSet<Student>();
		
		//創建student對象
		Student s1 = new Student("Wang", 5);
		Student s2 = new Student("Kaki", 17);
		Student s3 = new Student("Mayu", 22);
		Student s4 = new Student("seira", 17);

		
		tSet.add(s1); tSet.add(s2); tSet.add(s3);
		tSet.add(s4);
		
		System.out.println(tSet);
	}
}
