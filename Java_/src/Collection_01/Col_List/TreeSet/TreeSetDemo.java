package Collection_01.Col_List.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//創建col
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		tSet.add(10); tSet.add(40); tSet.add(30); tSet.add(50); tSet.add(20);
		tSet.add(10); //不包含重複元素
		
		System.out.println(tSet);	//[10, 20, 30, 40, 50]
		
		//遍歷
		for (Integer integer : tSet) {
			System.out.println(integer);
		}
	}
}
