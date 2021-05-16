package _Java_016Class.ch_09;

import java.util.Arrays;

/*
 * String[] names = {"張君雅", "潘美雪","劉雪莉","黃彬彬","潘美雪", "黃美華", "劉 雪麗","黃彬彬","潘美雪","潘美雪"}
Java提供的Arrays類別可對某些陣列內的元素排序，你要找出是哪個方法可以排序，然後將排序的結果印出。
 */
public class Lab_04 {
	public static void main(String[] args) {
		String[] names = {"張君雅", "潘美雪","劉雪莉","黃彬彬","潘美雪", "黃美華", "劉雪麗","黃彬彬","潘美雪","潘美雪"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
	}
}
