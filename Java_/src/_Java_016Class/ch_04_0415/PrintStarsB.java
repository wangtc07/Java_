package _Java_016Class.ch_04_0415;

import java.util.Scanner;

public class PrintStarsB {

	public static void main(String[] args) {
		Scanner starScanner = new Scanner(System.in);
		int starRow = 0;
		System.out.println("enter star row:");
		
		while (!starScanner.hasNextInt()) {
			System.out.println("re enter");
			String inString = starScanner.next();
		}
		
		starRow = starScanner.nextInt();
		starRow = (starRow % 2 == 0 )? ++starRow : starRow;
		System.out.println("列印高度為" + starRow + "的菱形");

		//上半部
		int upRow = starRow / 2 + 1 ;
		for(int i = 1 ; i <= upRow ; i++) {
//			System.out.print(i);					//第幾行
			int starNum = i *2 -1; 					//需要的**數
			int starNull = (starRow - starNum) / 2 ;//需要的空白
//			System.out.print("  " + starNull);
//			System.out.print(" **" + (i*2-1)); 		
			
			for (int j = 0; j < starNull; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= starNum ; j++) {
//				System.out.print("*");
				if (j == 1){
//					for (int j2 = 0; j2 < j * 2 - 1 ; j2++) {
						System.out.print("*");
//					}
				}else if (j < starNum) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		int downRow = starRow / 2 ;
		for(int i = downRow ; i >= 1 ; i--) {		//反過來排列
//			System.out.print(i);					//第幾行
			int starNum = i *2 -1; 					//需要的**數
			int starNull = (starRow - starNum) / 2 ;//需要的空白
//			System.out.print("  " + starNull);
//			System.out.print(" **" + (i*2-1)); 		
			
			for (int j = 0; j < starNull; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= starNum ; j++) {
//				System.out.print("*");
				if (j == 1){
//					for (int j2 = 0; j2 < j * 2 - 1 ; j2++) {
						System.out.print("*");
//					}
				}else if (j < starNum) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
