package Collection_01._09_comparator.bili_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Student> tSet = new TreeSet<>(new Comparator<>() {
			public int compare(Student o1, Student o2) {
				// this.age - o.age;
				// o1         o2
				int num1 = o1.getAge() - o2.getAge();
				int num2 = num1 == 0 ? o1.getName().compareTo(o2.getName()) : num1;
				return num2;
			};
		});
		
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
