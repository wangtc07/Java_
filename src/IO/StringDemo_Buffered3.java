package IO;

import java.io.*;
import java.util.Arrays;

public class StringDemo_Buffered3 {
	public static void main(String[] args) throws Exception {
		try(
			// 輸入流
			FileReader fr = new FileReader("BufferWriter.txt");	
			BufferedReader br = new BufferedReader(fr);
		){

			int len;
			
			// 一次一個字元
			while ((len = br.read()) != -1) {
				System.out.print((char)len);
			}
			
			// 一次一個字元陣列
			char[] crr = new char[1024];
			while ((len = br.read(crr)) != -1) {
				System.out.println(new String(crr ,0 ,len));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
