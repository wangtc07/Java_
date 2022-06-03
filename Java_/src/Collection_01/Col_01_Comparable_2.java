package Collection_01;

import java.util.*;

public class Col_01_Comparable_2 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
		Collections.sort(words, String::compareTo);
		System.out.println(words);
		
		List<String> words2 = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
		words2.sort(String::compareTo);
		System.out.println(words2);

		List<String> words3 = Arrays.asList("B", "X", "A", "M",null ,"F", "W", "O",null);
		Collections.sort(words3, Comparator.nullsFirst(Comparator.naturalOrder()));
	    System.out.println(words3);
	    
	    //err
//	    Collection<Object> words4 = new ArrayList<>();
//	    words4 = Arrays.asList("B", "X", "A", "M",null ,"F", "W", "O",null);
//	    words4.sort(words3, Comparator.nullsFirst(Comparator.naturalOrder()));
//	    System.out.println(words4);

	}
}
