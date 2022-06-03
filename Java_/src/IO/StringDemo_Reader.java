package IO;

import java.io.*;
import java.util.Arrays;

public class StringDemo_Reader {
	public static void main(String[] args) throws Exception {
		try(
			FileInputStream fis = new FileInputStream("copy.txt");
			InputStreamReader isr = new InputStreamReader(fis);
		){
			// 讀一個字元
//			int ch;
//			while ((ch = isr.read()) != -1) {
//				System.out.print((char)ch);
//			}
			
			// 一次讀一個字元陣列
			char[] crr = new char[1024];
			int len;
			while ((len = isr.read(crr)) != -1) {
				System.out.println(new String(crr ,0 , len));
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
