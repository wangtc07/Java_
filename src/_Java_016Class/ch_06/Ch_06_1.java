package _Java_016Class.ch_06;
//撰寫一個方法: void starSquare(int width, int height)，
//它可印出一個由 * 所組成 的實心長方形，width與height分別表示長方形的寬與高。
public class Ch_06_1 {
	static void starSquare(int width ,int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Ch_06_1.starSquare(6,3);
	}
}
