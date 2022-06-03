package Interface_01.Int_02;

public class InterfaceDemo {
	public static void main(String[] args) {
		Inter i = new InterImpl();
//		interface變量默認被final修飾
//		i.num = 30;
		System.out.println(i.num);
//		num2被final修飾
//		i.num2 = 30;
		System.out.println(i.num2);
		
		//默認被static修飾
		System.out.println(Inter.num);
	}
}
