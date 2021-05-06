package _Java_016Class.ch_06;
//撰寫一個方法: long factorial(int n)，它可傳回n的階乘。
public class Ch_06_2 {
	static long factorial(int n) {
		long sum = 1;
		
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}

		return sum;
	}
	
	public static void main(String[] args) {
		int x = 5;
		long l = factorial(x);
		System.out.println(l);
	}
}
