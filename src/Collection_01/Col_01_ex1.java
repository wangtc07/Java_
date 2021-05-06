package Collection_01;

import java.util.ArrayList;

public class Col_01_ex1 {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");

		for (String string : aList) {
			System.out.println(string);
		}
	}
}
