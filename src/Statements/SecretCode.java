package Statements;

import java.util.Scanner;

public class SecretCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int secretCode = 888;
		int codeEntered;
		
		do {
			System.out.println("To enter the club, please enter the secret code number:");
			codeEntered = sc.nextInt();
		} while (codeEntered != secretCode); 	//如果跟密碼不同，回去做do
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
