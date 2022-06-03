package Generics_01.Gen_6;

import java.util.Arrays;

public class GenericDemo {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sum(5, 5, 5, 5, 5, 5)));
	}

	public static int[] sum(int... a) { // 可傳入多個參數，傳入的參數會變成陣列
		System.out.println(a);  		//[I@1cd072a9
		return a;
	}
}
