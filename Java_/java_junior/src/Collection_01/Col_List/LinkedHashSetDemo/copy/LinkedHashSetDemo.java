package Collection_01.Col_List.LinkedHashSetDemo.copy;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//創建col
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		//添加元素
		linkedHashSet.add("Hello"); linkedHashSet.add("world"); linkedHashSet.add("java");
	
		linkedHashSet.add("Hello");		//添加失敗 
		
		//遍歷col
		for (String string : linkedHashSet) {
			System.out.println(string);
		}
		/* 元素有序
		 * Hello
		   world
		   java
		 */
	}
}
