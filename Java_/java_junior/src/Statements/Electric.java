package Statements;

import java.util.Scanner;

//輸入用電瓦數，並計算該月電費
public class Electric {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double kwh = 0 ;
		
		double bill = 0;
		
		double break1 = 250;
		double break2 = 600;
		
		double rate1 = 10;
		double rate2 = 20;
		double rate3 = 50;
		
		while (scanner.hasNextDouble()) {
			kwh = scanner.nextDouble();
			bill = billMeth(kwh);
//			if(kwh <= break1) {
//				bill = kwh * rate1;
//			}else if (kwh <= break2) {
//				bill = (kwh - break1)*rate2 + break1 * rate1;
//			}else {
//				bill = (kwh - break2)*rate3 + break2 * rate2 + break1 * rate1;
//			}
			System.out.println("kwh >> " + kwh);
			System.out.println("bill >> " + bill);
			System.out.println("enter q to quit");	//非double數值
		}
		System.out.println("END");
		

	}
	
	public static double billMeth (double i) {
		double kwh = i;
		double bill = 0;
		double break1 = 250;
		double break2 = 500;
		double rate1 = 10;
		double rate2 = 20;
		double rate3 = 50;
		
		if(kwh <= break1) {
			bill = kwh * rate1;
		}else if (kwh <= break2) {
			bill = (kwh - break1)*rate2 + break1 * rate1;
		}else {
			bill = (kwh - break2)*rate3 + break2 * rate2 + break1 * rate1;
		}
		
		return bill;
	}

}
