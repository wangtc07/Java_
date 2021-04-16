package Statements;

import java.util.Scanner;

//輸入 1~100 之間的整數，印出最大最小加總平均
public class MinMaxNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int MIN = 1;
		final int MAX = 100;
		int min = MAX;
		int max = MIN;
		int num = 0;
		int count = 0;
		double plus = 0;
		double average = 0;
		
		while (scanner.hasNextInt()) {
			num = scanner.nextInt();
			
			if (num < MIN || num > MAX) {
				System.out.println("不在範圍內");
				continue;
			}
			
			plus += num;
			count++;
		
			if (num > max) { max = num; }
			if (num < min) { min = num; }
			System.out.println("enter q to quit");
		}
		average = plus / count;
		System.out.println("加總 > " + plus);
		System.out.println("平均 > " + average);
		System.out.println("min > " + min);
		System.out.println("max > " + max);
	}
}
