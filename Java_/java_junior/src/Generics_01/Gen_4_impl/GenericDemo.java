package Generics_01.Gen_4_impl;

public class GenericDemo {
	public static void main(String[] args) {
		//泛型介面實現類 實例化
		GenericImpl<String> genImpl = new GenericImpl<String>();
		genImpl.show("Impl");
		
		GenericImpl<Integer> genImplInt = new GenericImpl<Integer>();
		genImplInt.show(100);
	
		
	}
}
