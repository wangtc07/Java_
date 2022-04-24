package Enum_01;

public class SeasonDemo {
	public static void main(String[] args) {
		test(Season.WINTER);  //限定只有Enum內的參數可傳入
		test(Season.SUMMER);  //只能是Season的參數
	}
	
	static void test (Season s) {
		switch(s) {
		}
	}
}
