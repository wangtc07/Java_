package _Java_016Class.ch_05;
/*
 * String[] ca = {"snoopy","micky","lucky", "kitty","derby"};
請計算此陣列中，母音字母(a,e,i,o,u)總共有多少個。

for ca.
	f

 */
public class Ch05_4 {
	public static void main(String[] args) {
		String[] ca = {"snoopy","micky","lucky", "kitty","derby"};
		
		int count = 0;
		for (String string : ca) {
			for (int i = 0; i < string.length() ; i++) {
				if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || 
						string.charAt(i) == 'i' || string.charAt(i) == 'o' ||
						string.charAt(i) == 'u') {
					count++;
				}
			}
		}
		System.out.println(count + "個");
	}
}
