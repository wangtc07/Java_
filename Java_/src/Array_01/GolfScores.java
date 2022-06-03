package Array_01;
import java.util.Arrays;
import java.util.Scanner;

public class GolfScores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int SIZE = 10;
		int[] scores = new int[SIZE];
		int sum =0;
		
		final int PAR =72;		//標準竿
		
		System.out.println("輸入竿數10次");
		for(int i = 0 ; i < SIZE ; i++ ) {			//輸入10次成績
			if (scanner.hasNextInt()) {
				scores[i] = scanner.nextInt();
			}
		}
		System.out.println(Arrays.toString(scores));//印出10次成績
		
		for (int i : scores) {						//加總成績
			sum += i;
		}
		
		//計算總竿數、平均，並印出低或高於標準竿72多少
		float average = (float)sum / SIZE;
		int grades = Math.round(average - PAR);
		System.out.println("總竿數:       " + sum);
		System.out.println("平均竿數:      " + average);
		System.out.println("低或高於標準竿: " + grades);
		
		
		
		
		
		
	}
}
