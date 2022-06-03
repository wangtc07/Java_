package _Java_016Class.ch_06;

import java.util.Arrays;

//撰寫一個方法: int[] luckyNumbers()，它傳回一個整數陣列，內含六個允許重複，介 於1到42的整數。
public class Ch_06_4 {
	static int[] luckyNumbers(){
		int[] random = new int[6];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int)(Math.random()*42+1);
		}
		return random;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(luckyNumbers()));
	}
}
