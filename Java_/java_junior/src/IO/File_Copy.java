package IO;

import java.io.*;
import java.io.IOException;

public class File_Copy {
	public static void main(String[] args){
		try (
			FileInputStream fis = new FileInputStream("copy.txt");
			FileOutputStream fos = new FileOutputStream("copy_01.txt");
		) {

			byte[] b = new byte[1024];
			int len;
			while ((len = fis.read(b)) != -1) {	//最多讀b.length長度的位元組
				fos.write(b);					//寫一次
			}		
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
