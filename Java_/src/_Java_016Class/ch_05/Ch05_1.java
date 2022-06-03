package _Java_016Class.ch_05;

public class Ch05_1 {
	public static void main(String[] args) {
		double[] arr = {84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100 };
		
		int count = 0;
		double sum = 0;
		for (double d : arr) {
			sum += d;
			count++;
		}
		double avg = sum / count;
		System.out.println("平均= " + avg);
		
		System.out.print("大於平均: ");
		for (double d : arr) {
			if (d > avg) {
				System.out.print(d + ", ");
			}
		}
	}
}
