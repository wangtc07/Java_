package _Java_016Class.ch_04_0415;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomFre = 6;
		int randomRange = 50;
		
		for ( int i = 0 ; i < randomFre ; i++) {
			System.out.println((int)((Math.random()*randomRange)+1));
		}
	}

}
