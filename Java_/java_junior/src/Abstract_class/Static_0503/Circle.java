package Abstract_class.Static_0503;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	@Override
	double getPerimeter() {
		return PI * radius;
	}

	@Override
	double getArea() {
		return PI * radius * radius;
	}

}
