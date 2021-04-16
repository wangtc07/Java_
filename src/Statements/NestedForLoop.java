package Statements;

public class NestedForLoop {

	public static void main(String[] args) {
		final int ROWS = 6;
		final int CHARS = 6;
		
		for (int i = 0; i < ROWS; i++) {
			System.out.print(i + " > ");
			//'A'=65
			for (char ch = 'A' ; ch < ('A'+ CHARS) ; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		/*
		0 > ABCDEF
		1 > ABCDEF
		2 > ABCDEF
		3 > ABCDEF
		4 > ABCDEF
		5 > ABCDEF
		*/
		System.out.println("---------------------");

		for (int i = 0; i < ROWS; i++) { //控制列
			System.out.print(i + " > ");
			//'A'=65
			//每一行少執行一次
			for (char ch = 'A' ; ch < ('A'+ CHARS - i) ; ch++) { //控制行
				System.out.print(ch);
			}
			System.out.println();
		}
		/*
		0 > ABCDEF
		1 > ABCDE
		2 > ABCD
		3 > ABC
		4 > AB
		5 > A
		*/
		System.out.println("---------------------");
		for (int i = 0; i < ROWS; i++) { //控制列
			System.out.print(i + " > ");
			//'A'=65
			//每一行多執行一次
			for (char ch = 'A' ; ch <= ('A'+ i) ; ch++) { //控制行
				System.out.print(ch);
			}
			System.out.println();
		}
		/*
		0 > A
		1 > AB
		2 > ABC
		3 > ABCD
		4 > ABCDE
		5 > ABCDEF
		*/
		
	}

}
