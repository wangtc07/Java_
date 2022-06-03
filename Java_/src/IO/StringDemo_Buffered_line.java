package IO;

import java.io.*;
import java.util.Arrays;

public class StringDemo_Buffered_line {
	public static void main(String[] args) throws Exception {
		try(
			// 輸入流
			FileReader fr = new FileReader("copy_01.txt");	
			BufferedReader br = new BufferedReader(fr);
		){
			String line;
			while ((line = br.readLine()) != null) {
				System.out.print(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();				
		}
	}
}
 