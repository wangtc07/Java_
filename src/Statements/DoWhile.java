package Statements;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int secretCode = 888;
		int codeEntered;
		
		//先執行一次{}內程式，再判斷()條件是否為true
		do {
			System.out.println("To enter the club, please enter the secret code number:");
			codeEntered = sc.nextInt();
		} while (codeEntered != secretCode);
		System.out.println("Congratulation!");
		
		/* 等同上方 do{}while()
		System.out.println("To enter the club, please enter the secret code number:");
		while (codeEntered != secretCode) {
			System.out.println("To enter the club, please enter the secret code number:");
			codeEntered = sc.nextInt();
		}
		System.out.println("Congratulation!");
		*/
	}

}
