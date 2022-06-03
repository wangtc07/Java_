package Collection_01;

import java.util.ArrayList;

public class Col_01_ArrayList {
	public static void main(String[] args) {
		// 創建 ArrayList 集合
		ArrayList<String> aList = new ArrayList<>();

		// public boolean add(E e); 指定元素加到集合末
//		System.out.println(aList.add("Hello"));		//>> true
		aList.add("Hello");
		aList.add("World");
		aList.add("java");

		// public void add(int index, E element); 指定元素加到index位置
		aList.add(1, "##");
//		aList.add(4, "##"); //IndexOutOfBoundsException: Index: 4, Size: 3

		// 輸出 ArrayList
		System.out.println("aList:" + aList);

		System.out.println("-------------");

		ArrayList<String> bList = new ArrayList<>();

		bList.add("Hello");
		bList.add("World");
		bList.add("java");

		// public boolean remove(Object o); 刪除指定元素
//		System.out.println(bList.remove("java")); //>>true   bList:[Hello, World]
		System.out.println(bList.remove("##")); // >>false

		// public E remove(int index) 刪除index的元素，返回被刪除的元素
//		System.out.println(bList.remove(1));	  //>>World  bList:[Hello, java]
//		System.out.println(bList.remove(3));	  //IndexOutOfBoundsException: Index 3 out of bounds for length 3

		// public E set(int index, E e); 修改index的元素，返回被修改的元素
		System.out.println(bList.set(1, "##")); // >>World bList:[Hello, ##, java]

		// public E get(int index); 返回index的元素
		System.out.println(bList.get(1)); // >>World bList:[Hello, ##, java]

		// public int size(); 返回List的長度
		System.out.println(bList.size());

		System.out.println("bList:" + bList);
	}
}
