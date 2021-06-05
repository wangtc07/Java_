package IO;

import java.io.*;
import java.io.IOException;

public class File_Copy_Image {
	public static void main(String[] args){
		try (
			FileInputStream fis = new FileInputStream("Source.gif");
			FileOutputStream fos = new FileOutputStream("Target.gif");
		) {

			byte[] b = new byte[1024];
			int len;
			while ((len = fis.read(b)) != -1) {	//最多讀b.length長度的位元組
				fos.write(b, 0, len);					//寫一次
			}		
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
