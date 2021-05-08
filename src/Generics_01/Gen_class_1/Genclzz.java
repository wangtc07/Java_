package Generics_01.Gen_class_1;

public class Genclzz {
	public static void main(String[] args) {
		Obj1<Integer> obj1 = new Obj1<>();
		Obj1<Object> obj1_1 = new Obj1<>();

//		Obj2<Object> obj2 = new Obj1<>();
//		Bound mismatch: The type Object is not a valid 
//		substitute for the bounded parameter 
//		<T extends Number> of the type Obj2<T>

		
		Genclzz genclzz = new Genclzz();
//		genclzz.objData(obj1);
//		he method objData(Obj1<Object>) 
//		in the type Genclzz is not applicable for 
//		the arguments (Obj1<Integer>)
		
		genclzz.objData(obj1_1);
	}
	
	public void objData(Obj1<Object> g) {
		System.out.println("Object");
	}

}
 
class Obj1<Number> {
	//The type parameter Number is hiding the type Number
}

class Obj2<T extends Number>{
	
}

