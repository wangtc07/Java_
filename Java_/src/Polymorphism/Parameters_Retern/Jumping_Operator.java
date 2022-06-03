package Polymorphism.Parameters_Retern;

public class Jumping_Operator {
	public void useJump(Jumping j) {
		j.jumping();
	}
	
	public Jumping getJump() {	//返回interface的實現類
		Jumping j = new Cat();
		return j;
	}
}
