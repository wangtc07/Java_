package Scanner;

import java.util.Scanner;

public class ScannerBasic {
    public static void main(String[] srges){
        Scanner scan = new Scanner(System.in); //產生一個Scanner物件
        int x = 0;
        double d = 0;
        String s = "";
        System.out.println("請輸入一個整數，一個浮點數，一個字串:"); // 如果輸入緩衝區內有一個可解釋為整數的記號
        // 如果輸入緩衝區內有一個可解釋為整數的記號
        if (scan.hasNextInt()) {
            x = scan.nextInt(); // 讀取這個整數
        }
        // 如果輸入緩衝區內有一個可解釋為浮點數的記號
        if (scan.hasNextDouble()) {
            d = scan.nextDouble();
        }
        if (scan.hasNext()) {
            s = scan.next();
        }

        System.out.println("x=" + x); System.out.println("d=" + d); System.out.println("s=" + s);
    }
}
