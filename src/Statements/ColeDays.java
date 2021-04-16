package Statements;

import java.util.Scanner;

public class ColeDays {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter list of daily low temperature");
		System.out.println("Use Celsius, enter q to quit");
		
		double temperature ;
		int allDay = 0;
		int coldDay = 0;
		final int ZERO = 0;
		
		//不確定會輸入多少個
		while (sc.hasNextDouble()) {
			temperature = sc.nextDouble();
			allDay++ ;
			if(temperature < ZERO) {
				coldDay++ ;
			}
		}
		if (allDay != 0) {
			double d = (double)coldDay / allDay * 100;
			System.out.println(allDay + "days total: " + d + "% coldDay");
		}else {
			System.out.println("No data entered");
		}
		System.out.println("allDay =" + allDay);
		System.out.println("coldDay=" + coldDay);
	}

}
