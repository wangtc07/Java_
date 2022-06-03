package Abstract_class.Static_0503;

public class ShapeCalculator {
	public static void main(String[] args) {
		double result = ShapeCalculator.getRectanglePerimeter(3, 4);
		double circleResule = ShapeCalculator.getCirclePerimeter(10);
		System.out.println(result);
		System.out.println(circleResule);
		
		Rectangle rectangle = new Rectangle(3, 4);
		rectangle.showRectangle('#');
	}
	
	
	/*
	 * 2個靜態欄位 (請用靜態區塊將2靜態欄位初始化) rectangle(Rectangle型態) circle(Circle型態)
	 */
	public static Rectangle rectangle;
	public static Circle circle;
	// 請用靜態區塊將2靜態欄位初始化
	static {
		rectangle = new Rectangle();
		circle = new Circle();
	}
	
	Rectangle re = new Rectangle();

	/**
	 * 回傳矩形周長
	 * @param length
	 * @param width
	 * @return 矩形周長
	 */
	public static double getRectanglePerimeter(int length, int width) {
		rectangle.setLength(length);
		rectangle.setWidth(width);
		return rectangle.getPerimeter();
	}
	/**
	 * 回傳矩形面積
	 * @param length
	 * @param width
	 * @return 矩形面積
	 */
	public static double getRectangleArea(int length, int width) {
		rectangle.setLength(length);
		rectangle.setWidth(width);
		return rectangle.getArea();
	}
	
	/**
	 * 回傳圓形周長
	 * @param radius
	 * @return 圓形周長
	 */
	public static double getCirclePerimeter(int radius) {
		circle.setRadius(radius);
		return circle.getPerimeter();
	}
	
	/**
	 * 回傳圓形面積
	 * @param radius
	 * @return 圓形面積
	 */
	public static double getCircleArea(int radius) {
		circle.setRadius(radius);
		return circle.getArea();
	}
}
