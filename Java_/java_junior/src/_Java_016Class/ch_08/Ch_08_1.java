package _Java_016Class.ch_08;

public class Ch_08_1 {
	static void subroutine(String[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			try {
				sum += Integer.parseInt(ar[i]);
			} catch (Exception e) {
				System.out.println("pass " + ar[i]);
			}
		} 
		
		System.out.println("sum=" + sum);
	}

	public static void main(String args[]) {
		String[] objects = {"20", "f", "20", "9f", "20"};
		
		subroutine(objects);
		
	}
}
