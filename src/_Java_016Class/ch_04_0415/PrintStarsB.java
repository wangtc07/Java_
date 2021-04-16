package _Java_016Class.ch_04_0415;

import java.util.Scanner;

public class PrintStarsB {

	public static void main(String[] args) {
		Scanner starScanner = new Scanner(System.in);
		int starRow = 0;
		System.out.println("enter star row:");
		
		while(starScanner.hasNextInt()) {
			
			System.out.println("重新輸入");
			continue;
//			break;
		}
			
		starRow = starScanner.nextInt();
		starRow = (starRow % 2 == 0 )? ++starRow : starRow;
		System.out.println("列印高度為" + starRow + "的菱形");
		
		//上半部
		int upRow = starRow / 2 + 1 ;
		for(int i = 1 ; i <= upRow ; i++) {
			System.out.println(i);
		}
		
	}
}
