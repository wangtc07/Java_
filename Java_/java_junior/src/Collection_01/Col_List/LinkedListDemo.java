package Collection_01.Col_List;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("hello"); linkedList.add("world"); linkedList.add("java"); 
		
		//void addFirst(E e);
		//void addLast(E e);
		linkedList.addFirst("First");	//[First, hello, world, java]
		linkedList.addLast("Last"); 	//[hello, world, java, Last]

		//public E getFirst(); 返回列表中第一個元素
		//public E getLast();  返回列表中最後的元素
		System.out.println(linkedList.getFirst());	//hello
		System.out.println(linkedList.getLast());	//java
		
		//public E removeFirst(); 刪除並返回列表中第一個元素
		//public E removeLast();  刪除並返回列表中最後的元素
		System.out.println(linkedList.removeFirst());	//hello
		System.out.println(linkedList.removeLast());	//java
		System.out.println(linkedList);					
	}
}

