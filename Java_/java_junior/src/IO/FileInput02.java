package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput02 {
	public static void main(String[] args){
		// 輸入
		
		try (
//			FileOutputStream fos = new FileOutputStream("fos.txt");
			FileInputStream fis = new FileInputStream("fos.txt");
			
		) {
//			int by = fis.read();
//			System.out.println(by);		// 讀取一次
			
			int by;
			while ((by = fis.read()) != -1) {
				System.out.print((char)by);
			}
			System.out.println();			// 一次讀取一個位元組，讀完全部
			
			
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
		}
		
		
	}
}
