package ch11.lab03;

public class NumberThread extends Thread {
	//�Х[�W�A���ԭz
	int[] ia;
	public void run() {
	 
	}
	public void printArray(){
		System.out.print("�}�C������:");
		for(int x:ia){
			System.out.print( x + " ");
		}
		System.out.println();
	}
}
