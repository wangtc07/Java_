package Abstract_class.Static_0503;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle() {
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	double getPerimeter() {
		return length * 2 + width * 2;
	}

	@Override
	double getArea() {
		return length * width;
	}

	void showRectangle(char sign) {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(sign);
			}
			System.out.println();
		}
	}
}
