package _Java_016Class.ch_05;

import java.util.Arrays;

/**
 * 循環6次
 * 		如果第n個==前面n-1個 跳過該隨機數 *
 */

public class Ch05_2 {
	public static void main(String[] args) {
		final int X = 42;
		int[] arr = new int[X];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 6 + 1);
			for (int j = 0; j < i; j++) {			//i=0 一定是false，第二輪i=2才開始比較
				if (arr[j] == arr[i]) {
					i--;
					break;
				}	
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
