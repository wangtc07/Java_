package Collection_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Col_01_iterator {
	public static void main(String[] args) {
		Collection<String> col = new ArrayList<>();

		col.add("Hello");
		col.add("world");
		col.add("java");

		// Iterator<E> iterator() 返回集合中的迭代器，通過集合中的iterator()方法得到
		Iterator<String> it = col.iterator();
		/*
		 * public Iterator<E> iterator() { //ArrayList內的iterator()方法返回Iterator<E>類型
		 * return new Itr(); } private class Itr implements Iterator<E>
		 * {//ArrayList內的Itr類重寫Iterator<E>接口的方法 }
		 */

		while (it.hasNext()) { // boolean確認是否有下一個元素
			String string = (String) it.next();
			System.out.println(string);
		}
	}
}
