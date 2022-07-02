package _Java_016Class.ch_09;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * 假設某一Collection物件v包含下列資料: new Integer(100)
new Double(3.14)
new Long(21L) 
short型別之物件(值為100)
new Double(5.1) 
"Kitty"
new Integer(200) 
new Object()
"Snoopy"
new BigInteger("1000")
請寫一程式完成下列功能 (1)將上述資料放到Collection物件內 
(2)印出物件v內所有元素 
(3)移除不是java.lang.Number家族的物件 
(4)再次印出物件v內所有元素。
 */
public class Lab_01 {
	public static void main(String[] args) {
		ArrayList<Object> col = new ArrayList<>();
		col.add(new Integer(100)); col.add(new Double(3.14)); col.add(21L); col.add((short)100);
		col.add("Kitty"); col.add(new Integer(200)); col.add(new Object());
		col.add("Snoopy"); col.add(new BigInteger("1000"));
		
		//(2)印出物件v內所有元素 
		System.out.println("0---------------");
//		Iterator<Object> it = col.iterator();
//		while (it.hasNext()) {
////			Object object = (Object) it.next();
//			System.out.println(it.next());
//		}
		
		System.out.println("1---------------");
//		for (Object object : col) {
//			System.out.println(object);
//		}
		
		System.out.println("2---------------");
		//  list.forEach(e -> System.out.println(e));
//		col.forEach(e -> System.out.println(e));
		
		System.out.println("3---------------");
//		col.forEach(System.out::println);
		System.out.println("---------------");
		//(3)移除不是java.lang.Number家族的物件 
		//way1
//		it = col.iterator();
//		while (it.hasNext()) {
//			Object object = (Object) it.next();
//			if (!(object instanceof Number)) {
//				it.remove();
//			}
//		}
		
		//way2
		System.out.println("notNum-------------");
		ArrayList<Object> colNotNum = new ArrayList<>();
		for (Object object : col) {
			if (!(object instanceof Number)) {
				colNotNum.add(object);
			}
		}
		colNotNum.forEach(System.out::println);
//		col.removeAll(colNotNum);
		
		System.out.println("fori---------------");  //此方式有問題 index往前遞補。也可以由col.size()-1倒數到0. (這個方法會快一點）
//		for (int i = 0; i < col.size(); i++) {		//漏Snoopy？
//			if (!(col.get(i) instanceof Number)) {
//				System.out.println(col.get(i));
//				col.remove(i);
//				i--;								//補上
//			}
//		}
		
//		System.out.println("for5---------------");
//		for (Object object : col) {
//			if (!(object instanceof Number)) {
//				System.out.println(object);
//				col.remove(object); // java.util.ConcurrentModificationException
//			}
//		}
		
//		col.forEach(e -> {
//			if ((e instanceof Number)) {
//				System.out.println(e);
////				col.remove(e); // java.util.ConcurrentModificationException
//			}
//		});
		
		//->
		col.removeIf(x -> !(x instanceof Number));
		
		System.out.println("移除notNumber---------------");
		col.forEach(System.out::println);

	}
}
