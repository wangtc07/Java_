package Statements;

import java.util.Scanner;

//找出所有因數
public class Factors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num ;
		int i ;
		boolean isPrime ;							//作標記
		System.out.println("enter");
		
		while(scanner.hasNextInt()) {
			num = scanner.nextInt();
			if (num <= 0) {
				System.out.println("reenter");
			}else {
				for( i = 2 , isPrime = true ; i * i <= num ; i++) {			//算到平方根
					if (num % i == 0 && i * i == num) {						
						System.out.println(num + " can divide by " + i );
					}else if (num % i == 0) {
						isPrime = false;									//如果可被整除，就不是質數
						System.out.println(num + " can divide by " + i + " and " + (num/i) );
					}
				}
				if(isPrime == true) {
					System.out.println("is Prime num");
				}
			}
		}
	}
}
