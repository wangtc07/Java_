package _Java_016Class.ch_05;

import java.util.Iterator;

public class Ch05_5 {
	public static void main(String[] args) {
		int[][] test={
				{ 1,  1,  1,   1,  1,  1,  1,  1},
				{ 1, 75, 77,  89, 64, 75, 70, 95}, 
				{ 1, 70, 79,  90, 75, 70, 79, 90}, 
				{ 1, 95, 70,  89, 60, 75, 85, 89},
				{ 1, 70, 89,  90, 75, 90, 89, 90},
				{ 1, 80, 100, 75, 50, 20, 99, 75}
		};
		
		for (int[] is : test) {
			int sumRow = 0;
			for (int is2 : is) {
				sumRow += is2;
			}
			System.out.println(sumRow);
		}
		System.out.println("--------------------");
		//最長長度
		int maxlength = 0;
		for (int i = 0; i < test.length ; i++) {
			if (test[i].length > maxlength) {
				maxlength = test[i].length;
			}
		}
		System.out.println(maxlength);
		
		System.out.println("--------------------");
		int[] testOne = new int[maxlength];
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				testOne[j] += test[i][j];
			}
		}
		
		for (int i : testOne) {
			System.out.println(i);
		}
		
	}
}
