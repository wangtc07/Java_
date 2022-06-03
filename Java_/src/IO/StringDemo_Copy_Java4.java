package IO;

import java.io.*;
import java.util.Arrays;

public class StringDemo_Copy_Java4 {
	public static void main(String[] args) throws Exception {
		try(
			// 輸入流
			FileReader fr = new FileReader("Test.java");	
			BufferedReader br = new BufferedReader(fr);
			// 輸出流
			FileWriter fw = new FileWriter("Test_copy3.java");
			BufferedWriter bw = new BufferedWriter(fw);
		){
			// 一次讀一個字元陣列  
			char[] crr = new char[8192];
			int len;
			while ((len = br.read(crr)) != -1) {		//讀
				bw.write(crr,0,len);					//寫
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
