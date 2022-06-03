package _Java_016Class.ch_05;

import java.util.Scanner;

public class Ch05_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入年月份，空白隔開");
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		
		int sum = 0 ;
		sum = day ;
		
		
		for (int i = 0 ; i < month-1 ; i++) {
			sum += monthArray[i];
		}
		
		if (year % 4 == 0 && month > 2) {
			sum += 1;
		}
		System.out.println(sum);
	}
}
