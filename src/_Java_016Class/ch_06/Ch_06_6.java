package _Java_016Class.ch_06;
/*
 * 撰寫一個方法:
public String toUnicodeString(String s)
此方法接收一個字串參數，然後將此字串參數轉為unicode字串傳回，例如
 */
public class Ch_06_6 {
	static public String toUnicodeString(String s) {
		StringBuffer unicode = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			// 取出每一個字元
			char c = s.charAt(i);
			// 轉換為unicode
			unicode.append("\\u" + Integer.toHexString(c));
		}
		return unicode.toString();
	}
	
	public static void main(String[] args) {
		String string = "張君雅";
		string = toUnicodeString(string);
		System.out.println(string);
	}
}
