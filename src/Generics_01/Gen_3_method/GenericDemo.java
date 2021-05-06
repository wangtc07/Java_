package Generics_01.Gen_3_method;

public class GenericDemo {
	public static void main(String[] args) {
		//generic class 實例 
//		Generic<String> s = new Generic<String>();
//		s.show("Wang");
//		
//		Generic<Integer> i = new Generic<Integer>();
//		i.show(100);
		
		//generic method
		Generic genMehtod = new Generic();
		genMehtod.show("Wang T");
		genMehtod.show(100.5);
		genMehtod.show(true);
	}
}
