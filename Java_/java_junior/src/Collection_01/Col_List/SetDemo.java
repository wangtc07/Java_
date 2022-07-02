package Collection_01.Col_List;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		//創建Set集合
		//HashSet 它不保證集合的迭代順序 此類允許null元素。
		Set<String> set = new HashSet<String>();
		
		//Set集合 不包含重複元素
		//添加元素
		set.add("Hello"); set.add("world"); set.add("java");
		set.add("Hello"); set.add("world"); set.add("java");

		//遍歷
		for (String string : set) {
			System.out.println(string);
		}
	}
}
