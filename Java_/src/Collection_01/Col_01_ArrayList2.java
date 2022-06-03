package Collection_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Col_01_ArrayList2 {
	public static void main(String[] args) {
		Collection<Cloth> cart1 = new ArrayList<>(); 
		
		// boolean add(E e)
		//>boolean add<Cloth e>
		cart1.add(new Cloth());
		cart1.add(new Hat());
		cart1.add(new Shirt());
		
		Collection<Shirt> cart2 = new ArrayList<>();  
//		cart2.add(new Cloth());
//		cart2.add(new Hat());  //The method add(Shirt) in the type Collection<Shirt> is not applicable for the arguments (Hat)
		cart2.add(new Shirt());
		
		// boolean addAll(Collection<? extends E> c)
		//>boolean addAll(Collection<Cloth> cart1)
		cart1.addAll(cart2);   						//cart1消費者,cart2生產者
		
		System.out.println("cart1= " + cart1.size());
		System.out.println("cart2= " + cart2.size());
		
		cart1.removeAll(cart2);
		System.out.println("cart1= " + cart1.size());

		System.out.println(cart1);
		Iterator<Cloth> it = cart1.iterator();
//		System.out.println(it);
		it.forEachRemaining(System.out::println);
	}
}


class Cloth{}

class Hat extends Cloth{}

class Shirt extends Cloth{}