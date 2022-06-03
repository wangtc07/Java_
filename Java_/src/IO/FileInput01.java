package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput01 {
	public static void main(String[] args){
		//創建輸出流對象
		
		try (
			FileOutputStream fos = new FileOutputStream("fos.txt" , true);
			
		) {
			// 追加寫入數據 
			for (int i = 0; i < 10; i++) {
				fos.write("add write\r\n".getBytes());
			}
			
			System.out.println("done");
			// 最後要釋放資源
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
		}
		
		
	}
}
