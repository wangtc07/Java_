package _Java_016Class.ch11_thread.lab03.solution;

import java.util.Arrays;

public class NumberThread extends Thread {
	int[] ia = {-999};
	public NumberThread(int[] ia) {
		this.ia = ia;
	}	
	public void run() {
	   for(int x = 0; x < ia.length; x++){
		   ia[x] = (int)(Math.random() * 10) + 2 ;
	   }
	}
	public void printArray(){
		System.out.println("陣列元素有:" + Arrays.toString(ia));
//		for(int x:ia){
//			System.out.print( x + " ");
//		}
//		System.out.println();
	}
}
