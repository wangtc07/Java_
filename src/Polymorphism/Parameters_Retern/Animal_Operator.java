package Polymorphism.Parameters_Retern;

public class Animal_Operator {
	public void useAnimal(Animal animal) {
		animal.eat();
		animal.setAges(50);
	}
	
	public Animal getCatAnimal() {
		Animal catAnimal = new Cat();
		return catAnimal;
	}
}