package Collection_01;

import java.util.ArrayList;
import java.util.Collection;

public class Col_01_Collection_1 {
	public static void main(String[] args) {
		
		//使用多態的方式實現， Collection>List>ArrayList
		Collection<String> collection = new ArrayList<>();	
		
		collection.add("collection");
		collection.add("collection");
		collection.add("collection");
		
		System.out.println(collection);

		
		double i = Math.PI;
		System.out.println(A.i);
	}
}

class A{
	static int i = 5;
}

