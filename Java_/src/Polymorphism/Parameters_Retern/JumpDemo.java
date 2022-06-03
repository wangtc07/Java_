package Polymorphism.Parameters_Retern;

public class JumpDemo {
	public static void main(String[] args) {
		//創建操作對對象
		Jumping_Operator jo = new Jumping_Operator();
		Jumping cat = new Cat();
		jo.useJump(cat);					//傳入interface對象cat()
		
		Jumping j = jo.getJump();			//jo.getJump() = new Cat()
		j.jumping();
	}
}
