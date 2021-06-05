package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput02 {
	public static void main(String[] args){
		//創建輸出流對象
		
		File file = new File("fos.txt");
		try (
			FileOutputStream fos = new FileOutputStream("fos.txt");
			// 
			FileOutputStream fos2 = new FileOutputStream(file);
			
		) {
			
			
			//最後要釋放資源
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
		}
		
		
	}
}
