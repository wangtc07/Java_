package _Java_016Class.ch_07;

import java.util.Calendar;

/*
 * 請利用靜態區塊來設定StaticCodeBlock類別的靜態變數season的初值。 
 * 請參考下列條件來設定靜態變數season的初值: 
 * 如果載入此類別檔的月份為 3, 4, 5 月 season 的初值為 "春天" 
 * 如果載入此類別檔的月份為 6, 7, 8 月 season 的初值為 "夏天" 
 * 如果載入此類別檔的月份為 9,10,11 月 season 的初值為 "秋天" 
 * 如果載入此類別檔的月份為 12, 1, 2 月 season 的初值為 "冬天"
 */
public class Ch_07_2 {
	public static void main(String[] args) {
		System.out.println(StaticCodeBlock.season); 
	}
}

class StaticCodeBlock {
	static String season ; 
	static {
		Calendar d = Calendar.getInstance() ;
		int month = d.get( Calendar.MONTH ) ;
		if (month>=3 && month<=5) {
			season = "春天";
		} else if (month>=6 && month<=8) {
			season = "夏天";
		} else if (month>=9 && month<=11) {
			season = "夏天";
		} else {
			season = "冬天";
		}
	}
}