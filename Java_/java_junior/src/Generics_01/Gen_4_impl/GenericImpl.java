package Generics_01.Gen_4_impl;

public class GenericImpl<T> implements Generic<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}
	
}
