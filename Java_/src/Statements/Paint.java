package Statements;

import java.util.Scanner;

//每桶油漆可漆200平方，輸入需要油漆的面積，並輸出需要幾桶
public class Paint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int COVERAGE = 200;
		int feels = 0;
		int cans ;
		while(scanner.hasNextInt()) {
			feels = scanner.nextInt();
			
			cans = feels / COVERAGE;
			//如果有餘數 > +1
			cans += (feels % COVERAGE == 0) ? 0 : 1 ;
			
			String cansOrCan = (cans <= 1 ? " can" : " cans") + " .";
			System.out.println("You need " + cans + cansOrCan );
			System.out.println("enter q to quit");
		}
		System.out.println("END");
		
	}
}
