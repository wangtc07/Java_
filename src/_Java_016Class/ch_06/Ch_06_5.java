package _Java_016Class.ch_06;

import java.util.Scanner;

/*
 * 由鍵盤不斷讀入字串, 直到該字串等於 "quit"， 而每個字串由一個以上的數字所組成,
 *  如 " 123 56 999 40" 計算出該字串內所有數字的總和, 平均, 最大值和最小值。
 */
public class Ch_06_5 {
	static int sum ;
	static int count;
	static int sumfun(int i) {
		return sum += i;
	}
	static int countfum() {
		return count++;
	}
	static int max = Integer.MIN_VALUE;
	static int maxfun(int i) {
		if (i > max) {
			max = i;
		}
		return max;
	}
	static int min = Integer.MAX_VALUE;
	static int minfun(int i) {
		if (i < min) {
			min = i;
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = 0;
		System.out.println("enter");
		while (scanner.hasNextInt()) {
			t = scanner.nextInt();
			if (t >= 10) {
				sumfun(t);
				countfum();
				maxfun(t);
				minfun(t);
			}
		}
		int avg = sum / count;
		
		System.out.println("sum = " + sum);
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("avg = " + avg);
	}
}
