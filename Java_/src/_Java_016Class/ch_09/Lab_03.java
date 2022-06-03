package _Java_016Class.ch_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * 在程式中定義一個ArrayList<Double> ad，然後將 98, 12.345, 97.85, 12 放入 
 * 其中。現在要對其內的元素進行排序。Java提供的Collections類別可對某些List物件內的元素排序
 * ，你要找出是哪個方法可以排序，然後將排序的結果印出。
 */
public class Lab_03 {
	public static void main(String[] args) {
		
		Double[] doublesArr = { 98., 12.345, 97.85, 12. };
		ArrayList<Double> ad = new ArrayList<Double>(Arrays.asList(doublesArr));
		
		//public static <T extends Comparable<? super T>> void sort​(List<T> list)
		//參數List 要排列的列表，沒回傳值
		Collections.sort(ad);
		
		ad.forEach(System.out::println);
	}
}
