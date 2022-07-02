package Abstract_class.Abs_04;

public class AnimalDamo {
	public static void main(String[] args) {
		Animal c = new Cat();
		c.setName("Big Cat");
		c.setAge(46);
		System.out.println(c.getName() +" , " + c.getAge());
		c.eat();
		
		System.out.println("------");
		
		c = new Cat("New Cat", 5);
		System.out.println(c.getName() +" , " + c.getAge());
		c.eat();
	}
}
