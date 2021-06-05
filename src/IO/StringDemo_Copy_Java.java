package IO;

import java.io.*;
import java.util.Arrays;

public class StringDemo_Copy_Java {
	public static void main(String[] args) throws Exception {
		try(
			// 輸入流
			FileReader fr = new FileReader("Test.java");		
			// 輸出流
			FileWriter fw = new FileWriter("Test_copy2.java");
		){
			// 一次讀一個字元陣列  
			char[] crr = new char[8192];
			int len;
			while ((len = fr.read(crr)) != -1) {				//讀
				System.out.println(new String(crr ,0 , len));
				fw.write(crr,0,len);									//寫
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
