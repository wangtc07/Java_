package Collection_01.Col_StudentMgr;

import java.util.Scanner;

public class StudentManger {
	public static void main(String[] args) {
		p();
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextInt() && scanner.nextInt() != 5) {
			int sc = scanner.nextInt();
			switch (sc) {
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 4:
				System.out.println(4);
				break;
			case 5:
				continue;
//				break;	
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
	
}
