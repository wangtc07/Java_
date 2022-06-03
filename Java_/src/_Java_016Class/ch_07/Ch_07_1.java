package _Java_016Class.ch_07;

public class Ch_07_1 {
	static { System.out.println("/* 此處為靜態區塊(static code block) A */"); } 
	Ch_07_1 () { System.out.println("/* 此處為建構子 */"); }
	static { System.out.println("/* 此處為靜態區塊(static code block) B */"); } 
	
	public static void main(String args[]) {
		Ch_07_1 con = new Ch_07_1 ();
		System.out.print("HaHaHa") ; 
	}
	
	static { System.out.println("/* 此處為靜態區塊(static code block) C */"); }
}

//A B C 建構子 HaHaHa
