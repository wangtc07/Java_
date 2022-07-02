package _Java_016Class.ch_04_homework;

public class Ch04_5 {
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 - i ;j++) {
				String string = (j+1 < 10) ? " " : "";
				System.out.print(j + 1 + string);
			}
			System.out.println();
		}
	}
}
