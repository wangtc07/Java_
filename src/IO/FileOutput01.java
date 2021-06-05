package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput01 {
	public static void main(String[] args){
		//創建輸出流對象
		
		try (
			FileOutputStream fos = new FileOutputStream("fos.txt");
		) {
//			fos.write(97);  // a
			
			byte[] bys = "abcde".getBytes();
			fos.write(bys);
			
			//最後要釋放資源
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
		}
		
		
	}
}
