package Collection_01.Col_StudentMgr;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		p();
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();
		
		while (scanner.hasNextInt()) {
			int sc = scanner.nextInt();
			switch (sc) {
			case 1:
				addStudent(students);
				System.out.println("添加成功");
				break;
			case 2:
				deleteStudent(students);
				System.out.println("delete");
				break;
			case 3:
				updateStudent(students);
				break;
			case 4:
				findStudent(students);
				break;
			case 5:
//				break;	
				System.exit(0);
			default:
				break;
			}
			p();
		}
	 }
	
	private static void p() {
		System.out.println("--------wellcome to student manger--------");
		System.out.println("1. add student");
		System.out.println("2. delete student");
		System.out.println("3. update student");
		System.out.println("4. find student");
		System.out.println("5, quit");
	}
	
	public static void addStudent(ArrayList<Student> students) {
		Scanner scanner = new Scanner(System.in);
		Student s = new Student();
		
		//如果輸入 有 等於已存在  重新輸入
		System.out.println("enter id");
		while (true) {
			String id = scanner.nextLine();
			if (checkId(students, id)) {
				s.setId(id);
				break;
			} else {
				System.out.println("alardy have, enter id");
			}
		}
		
		System.out.println("enter name");
		s.setName(scanner.nextLine());
		System.out.println("enter age");
		s.setAge(scanner.nextLine());
		System.out.println("enter add");
		s.setAddress(scanner.nextLine());
		
		students.add(s);
	}
	
	public static void findStudent(ArrayList<Student> students) {
		System.out.println("id     |" + "name   |" + "age    |" + "address|");
		for (Student student : students) {
			System.out.printf("%-8s" , student.getId());
			System.out.printf("%-8s" , student.getName());
			System.out.printf("%-8s" , student.getAge());
			System.out.printf("%-8s \n" , student.getAddress());
		}
	}

	public static void deleteStudent(ArrayList<Student> students) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ender delete id");
		
		while (true) {
			String in = scanner.nextLine();
			//id null >> false
			if (nullId(students, in)) {
				for (int j = 0; j < students.size() ; j++) {
					if (students.get(j).getId().equals(in)) {
						students.remove(j);
//						System.out.println(System.identityHashCode(students.get(j).getId()));
//						System.out.println(System.identityHashCode(in));
						System.out.println(students.get(j).getId() == in);     //false
						System.out.println(students.get(j).getId().equals(in));//true
					}
				}
				break;
			}else {
				System.out.println("id not find");
				continue;			
			}
		}
	}

	public static void updateStudent(ArrayList<Student> students) {
		System.out.println("enter update sutdent id");
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String in = scanner.nextLine();
			//id null >> false
			if (nullId(students, in)) {
				for (int j = 0; j < students.size() ; j++) {
					if (students.get(j).getId().equals(in)) {
					Student s = new Student();
					
					System.out.println("enter id");
					s.setId(scanner.nextLine());
					System.out.println("enter name");
					s.setName(scanner.nextLine());
					System.out.println("enter age");
					s.setAge(scanner.nextLine());
					System.out.println("enter add");
					s.setAddress(scanner.nextLine());
					
					students.set(j, s);
					System.out.println("update!");
					}	
				}
				break;
			} else {
				System.out.println("id not find");
				continue;
			} 
		}
		
	}
	
	//id not null >> false
	public static boolean nullId (ArrayList<Student> students ,String s) {
		boolean booId = false;
		//如果有對應到 >> true
		for (Student student : students) {
			if (s.equals(student.getId())) {
				booId = true;
				break;
			} 
		}
		return booId;
	}
	
	//id重複>false  沒重複>true
	public static boolean checkId (ArrayList<Student> students ,String string) {
		boolean temp = true;
		for (Student student : students) {
			if (string.equals(student.getId())) {
				temp = false;
				break;
			} 
		}
		return temp;
	}
	
	
	
	
	
	
	
	
	
	

}
