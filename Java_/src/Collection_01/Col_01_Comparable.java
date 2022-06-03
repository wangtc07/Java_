package Collection_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Col_01_Comparable {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java" , "JSP" , "Servlet");
		
		Collections.sort(list);
		System.out.println(list);
		
		List<Num> list2 = new ArrayList<>();
		list2.add(new Num(10));
		list2.add(new Num(25));
		list2.add(new Num(20));
		list2.add(new Num(15));

		Collections.sort(list2); 
		System.out.println(list2);
		
	}
}

class Num implements Comparable<Num>{
	int i;

	public Num(int i) {
		super();
		this.i = i;
	}

	@Override
	public int compareTo(Num o) {
		return  o.i - i ;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
}