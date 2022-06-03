package Generics_01.Gen_3_method;
/*
public class Generic {
	void show (String string) {
		System.out.println(string);
	}
	void show (Integer integer) {
		System.out.println(integer);
	}
	void show (Boolean boolean1) {
		System.out.println(boolean1);
	}
}
*/

//用泛型類改進
/*
public class Generic<T> {
	void show (T t) {
		System.out.println(t);
	}
}
*/

//用泛型方法改進
public class Generic {
	<T>void show (T t) {
		System.out.println(t);
	}
	
	<T extends Number> void showNum(T t) {
		System.out.println(t);
	}
}



