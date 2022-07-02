package _Java_016Class.ch_07;

public class Ch_07_3 {
	public static void main(String args[]) { 
//		HappyMary hm = new HappyMary() ;
		Human.smile() ; 
	}
}

class Human {
	int weight = 50;

	static void smile() {
		System.out.println("HA");
	}
}

class OrdinaryPeople extends Human {
}

class HappyMary extends OrdinaryPeople {
}