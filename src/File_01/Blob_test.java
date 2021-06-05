package File_01;

import java.io.*;
import java.sql.Blob;
import javax.sql.rowset.serial.SerialBlob;

public class Blob_test {
	public static void main(String[] args) {
		
	}
	
	private static Blob fileToBlob(String imageFile , String copyFile) {	// image >> Blob
		Blob blob = null;
		File file = new File(imageFile);
		File copy = new File(copyFile);
		if (!file.exists()) {
			throw new RuntimeException("檔案: " + imageFile + "不存在");
		}
		try (
			// 將參數(image)轉換成位元組的陣列 SerialBlob​(byte[] b) 建構子
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();	// 輸出流
			
			
		){
			int len = 0;
			byte[] b = new byte[81920];			// 512的倍數
			while ((len = fis.read(b)) != -1) { // 最多讀入b.length字節，沒有更多數據返回-1 。
//				baos.write(b, 0, len); 			// AOL
				baos.writeBytes(b);				// jdk11
			}
			
			
			byte[] ba = baos.toByteArray();		//創建一個新分配的字節陣列
			blob = new SerialBlob(ba);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return blob;
	}
}
