package _Java_016Class.ch_06;

import java.util.Arrays;

//撰寫一個方法: int[] mySort(int[] arrayInt)，它可將陣列內的元素由小到大排序。
public class Ch_06_3 {
	int[] mySort(int[] arrayInt) {
		Arrays.sort(arrayInt);
		return arrayInt;
	}
	
	public static void main(String[] args) {
		int[] ir = {2,4,1,3};
		Ch_06_3 c = new Ch_06_3();
		c.mySort(ir);
		System.out.println(Arrays.toString(ir));
	}
}
