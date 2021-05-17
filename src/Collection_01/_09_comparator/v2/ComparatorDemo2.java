package Collection_01._09_comparator.v2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// 
public class ComparatorDemo2 {
	public static void main(String[] args) {
		StringComp sc = new StringComp(2);
		List<String> list = new ArrayList<String>();
		list.add("Amada");
		list.add("Monica");
		list.add("Selena");
		list.add("Bonny");
		list.add("Zanda");
		// 
		Collections.sort(list, sc);
		for(String s : list) {
			System.out.println(s);
		}
	}
}