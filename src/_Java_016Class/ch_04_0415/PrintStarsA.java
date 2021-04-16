package _Java_016Class.ch_04_0415;

public class PrintStarsA {
	public static void main(String[] args) {
		int size = 4;
        if (size % 2 == 0) {
            size++; // 计算菱形大小
        }
        System.out.println(size);
		// 菱形上半部分
        int upRow = size / 2 + 1;  			//上半部的行數
		for (int i = 1; i <= upRow; i++) { 
//			System.out.println(upRow - i);	//每行需要的空格
			for (int j = 0; j < upRow - i ; j++) { // 控制要显示的空格
				System.out.print(" ");
			}
//			System.out.println(i * 2 - 1); 	//每行需要的**
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		
		for (int i = upRow -1; i > 0 ; i--) { 
//			System.out.println(upRow - i);	//每行需要的空格
			for (int j = 0; j < upRow - i ; j++) { // 控制要显示的空格
				System.out.print(" ");
			}
//			System.out.println(i * 2 - 1); 	//每行需要的**
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
