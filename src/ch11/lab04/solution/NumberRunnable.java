package ch11.lab04.solution;

public class NumberRunnable implements Runnable {
	int[] ia;
	public NumberRunnable(int[] ia) {
		this.ia = ia;
	}	
	public void run() {
	   for(int x = 0; x < ia.length; x++){
		   ia[x] = (int)(Math.random() * 10) + 1 ; 
	   }
	}
	public void printArray(){
		System.out.print("°}¦C¤¸¯À¦³:");
		for(int x:ia){
			System.out.print( x + " ");
		}
		System.out.println();
	}
}
