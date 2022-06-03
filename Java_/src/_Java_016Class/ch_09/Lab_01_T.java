package _Java_016Class.ch_09;

import java.math.BigInteger;
import java.util.ArrayList;

public class Lab_01_T {
	public static void main(String[] args) {
		ArrayList<Object> col = new ArrayList<>();
		col.add(new Integer(100)); col.add(new Double(3.14)); col.add(21L); col.add((short)100);
		col.add("Kitty"); col.add(new Integer(200)); col.add(new Object());
		col.add("Snoopy"); col.add(new BigInteger("1000"));
		
		
		System.out.println("for5---------------");
		for (Object object : col) {
			if (!(object instanceof Number)) {
				System.out.println(object);
				col.remove(object); // java.util.ConcurrentModificationException
			}
		}
		
		System.out.println("移除notNumber---------------");
		col.forEach(System.out::println);
	}
}
