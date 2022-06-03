package Interface_01.Int_01;

public class JumpingDemo {
	public static void main(String[] args) {
		//interface不能直接實例化
		//Jumping j = new Jumping();
		
		//同樣透過多態方式實現(子類)
		Jumping j = new Cat();
		j.jump();
	}
}
