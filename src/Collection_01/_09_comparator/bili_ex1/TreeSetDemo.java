package Collection_01._09_comparator.bili_ex1;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Student> tSet = new TreeSet<>(new Comparator<>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num1 = o1.getChinese() - o2.getChinese() ;
				int num2 = num1 == 0 ? o1.getMath() - o2.getMath() : num1;
				int num3 = num2 == 0 ? o1.getName().compareTo(o2.getName()) : num2;
				return num3;
			}
		});
		
		//創建student對象
		Student s1 = new Student("Wang", 5, 100);
		Student s2 = new Student("Kaki", 17, 70);
		Student s3 = new Student("Mayu", 22, 90);
		Student s4 = new Student("seira", 17, 80);

		
		tSet.add(s1); tSet.add(s2); tSet.add(s3);
		tSet.add(s4);
		
//		System.out.println(tSet);
		for (Student student : tSet) {
			System.out.println(student);
		}

	}
}
