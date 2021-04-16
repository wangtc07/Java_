package _Java_016Class.ch_04_0415;

public class NineMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nine = 9;
		int multi = 0;
		
		for(int i = 1 ; i <= nine ; i++) {
			//System.out.print(i);
			//由9開始，判斷最小到第i個
			for(int j = nine ; j >= i ; j--) {
				//System.out.print(j);
				multi = i * j;
				String sTemp = (multi<10 ? " " + multi : multi) + ", ";
				System.out.print(sTemp);
			}
			System.out.println();
		}
	}

}
