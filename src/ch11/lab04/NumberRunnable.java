package ch11.lab04;

public class NumberRunnable implements Runnable {
	int[] ia;
	
	public void run() {
	
	}
	public void printArray(){
		System.out.print("°}¦C¤¸¯À¦³:");
		for(int x:ia){
			System.out.print( x + " ");
		}
		System.out.println();
	}
}
