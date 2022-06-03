package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) {
		try (
			FileInputStream fis = new FileInputStream("copy.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
				
			FileOutputStream fos = new FileOutputStream("copy_01.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		){

			// 寫數據
			bos.write("hello\n".getBytes());
			bos.write("world\n".getBytes());
			
			// 讀數據，一次讀取多個位元組
			byte[] b = new byte[1024];
			int len;
			while ((len = bis.read(b)) != -1) {
				System.out.println(new String(b, 0, len));
			}
			
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
