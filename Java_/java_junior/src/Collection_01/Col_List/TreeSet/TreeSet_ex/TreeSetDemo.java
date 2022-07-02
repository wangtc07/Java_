package Collection_01.Col_List.TreeSet.TreeSet_ex;

import java.util.TreeSet;
/**
 * 依照年齡排序，再依照姓名排序
 * @author tcwang
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Student> tSet = new TreeSet<>();
		
		//創建student對象
		Student s1 = new Student("Wang", 5);
		Student s2 = new Student("Kaki", 17);
		Student s3 = new Student("Mayu", 22);
		
		Student s4 = new Student("seira", 22);
		
		
		tSet.add(s1); tSet.add(s2); tSet.add(s3); 
		tSet.add(s4);
		
		for (Student student : tSet) {
			System.out.println(student);
		}
	}
}
