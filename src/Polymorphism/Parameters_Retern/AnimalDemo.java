package Polymorphism.Parameters_Retern;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal_Operator ao = new Animal_Operator();
		Animal cat = new Cat();
		ao.useAnimal(cat);			//傳入cat對象(Animal的子類)
									//useAnimal裡有eat()方法 >> 使用cat的eat()方法
		System.out.println();
		
		System.out.println(cat.ages);//ages>>0 ?
		
		Animal ao2 = ao.getCatAnimal();//傳入new Cat()
		ao2.eat(); 					   //使用cat的eat方法
		
	}
}