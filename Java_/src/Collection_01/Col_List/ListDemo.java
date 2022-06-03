package Collection_01.Col_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		
		//遍歷
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("----------");
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("hello");
		linkedList.add("world");
		linkedList.add("java");
	
		//遍歷
		for (String string : linkedList) {
			System.out.println(string);
		}
	}
}
