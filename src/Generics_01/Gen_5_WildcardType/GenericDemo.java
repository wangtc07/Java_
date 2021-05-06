package Generics_01.Gen_5_WildcardType;

import java.util.*;

public class GenericDemo {
	//<?>
	List<?> list1 = new ArrayList<Object>();
	List<?> list2 = new ArrayList<Number>();
	List<?> list3 = new ArrayList<Integer>();
	
	//<? extends 類型>  上限
//	List<? extends Number> list4 = new ArrayList<Object>(); //錯誤 > 傳入類別不能高於Number
	List<? extends Number> list5 = new ArrayList<Number>();
	List<? extends Number> list6 = new ArrayList<Integer>();

	//<? super 類型> 下限
	List<? super Number> list7 = new ArrayList<Object>(); 
	List<? super Number> list8 = new ArrayList<Number>();
//	List<? super Number> list9 = new ArrayList<Integer>(); //錯誤 > 傳入類別不能低於Number
}
