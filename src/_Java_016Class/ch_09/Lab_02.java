package _Java_016Class.ch_09;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * String[] names = {"張君雅", "潘美雪","劉雪莉","黃彬彬","潘美雪", "黃美華", "劉雪麗","黃彬彬","潘美雪","潘美雪"} 
 * 此陣列有十個元素，其中某些元素重複，請利用java.util.Set的特性，將重複的元素
去除，只留一份。請將去除重複後的資料顯示在螢幕上。
 */
public class Lab_02 {
	public static void main(String[] args) {
		String[] names = {"張君雅", "潘美雪","劉雪莉","黃彬彬","潘美雪", "黃美華", "劉雪麗","黃彬彬","潘美雪","潘美雪"};
		Set<String> set = new HashSet<>(Arrays.asList(names));
		Set<String> set2 = new HashSet<String>();
		Collections.addAll(set2, names);
		for (String string : names) {
//			System.out.println(string);
			set.add(string);
		}
		System.out.println("Set------------");
		set.forEach(System.out::println);
		
	}
}
