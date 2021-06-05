package IO;

import java.io.*;
import java.util.Arrays;

public class StringDemo_Copy_Java3 {
	public static void main(String[] args) throws Exception {
		try(
			// 輸入流
			FileReader fr = new FileReader("Test.java");	
			BufferedReader br = new BufferedReader(fr);
			// 輸出流
			FileWriter fw = new FileWriter("Test_copy4.java");
			BufferedWriter bw = new BufferedWriter(fw);
		){
			// 一次讀一行數據
			String len;
			while ((len = br.readLine()) != null) {		//讀
				bw.write(len);
				bw.newLine();
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
