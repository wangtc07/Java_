package Generics_01.Gen_1;

import java.util.*;

public class GenericsDemo {
	public static void main(String[] args) {
		//創建集合對象
//		Collection c = new ArrayList();
		Collection<String> c = new ArrayList<>(); //`2 >>
		

		c.add("hello");
		c.add("java");
//		c.add(100); //`1 >>  //`2 >> err 在編譯期就發現問題
		
		//遍例集合
//		Iterator it = c.iterator();
		Iterator<String> it = c.iterator(); //`2
		while ( it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
			//向下轉型成String類型
//			String s = (String)it.next(); 
			//`1 >> java.lang.ClassCastException:Integer cannot be cast to String 
			
			//`2 >> 不用強制類型轉換
			String s = it.next();
			System.out.println(s);
		}
	}
}
