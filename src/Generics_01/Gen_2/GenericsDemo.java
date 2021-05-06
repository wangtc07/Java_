package Generics_01.Gen_2;

public class GenericsDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Wang");
		System.out.println(student.getName());
		
		System.out.println("------------");
		
		Generic<String> gen = new Generic<String>();
		gen.setT("Wang T");
		System.out.println(gen.getT());
		
		Generic<Integer> gen2 = new Generic<Integer>();
		gen2.setT(100);
		System.out.println(gen2.getT());
		
		Generic<Boolean> gen3 = new Generic<Boolean>();
		gen3.setT(true);
		System.out.println(gen3.getT()); 				//泛型，在需要時才指定參數型態
	}
}
