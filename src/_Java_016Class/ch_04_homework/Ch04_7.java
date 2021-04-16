package _Java_016Class.ch_04_homework;

public class Ch04_7 {

	public static void main(String[] args) {
		String st = "Hello, World, 大家好";
		for(int i = 0 ; i < st.length() ; i++) {
			char c = st.charAt(i);
			int print = c;
			System.out.print(c + " ");
			System.out.println(print);
		}
	}
}
