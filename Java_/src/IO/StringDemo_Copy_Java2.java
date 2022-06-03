package IO;

import java.io.*;
import java.util.Arrays;

public class StringDemo_Copy_Java2 {
	public static void main(String[] args) throws Exception {
		try(
			// 輸入流
			FileInputStream fis = new FileInputStream("Test.java");
			InputStreamReader isr = new InputStreamReader(fis);
			// 輸出流
			FileOutputStream fos = new FileOutputStream("Test_copy.java");
			OutputStreamWriter osr = new OutputStreamWriter(fos);
	
		){
			// 一次讀一個字元陣列  
			char[] crr = new char[8192];
			int len;
			while ((len = isr.read(crr)) != -1) {				//讀
				System.out.println(new String(crr ,0 , len));
				osr.write(crr,0,len);									//寫
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
