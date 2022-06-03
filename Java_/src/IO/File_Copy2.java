package IO;

import java.io.*;
import java.io.IOException;

public class File_Copy2 {
	public static void main(String[] args){
		try (
			FileInputStream fis = new FileInputStream("copy.txt");
			FileOutputStream fos = new FileOutputStream("copy_01.txt");
		) {

			int by;
			while ((by = fis.read()) != -1) {	//讀一次
				fos.write(by);					//寫一次
			}			
			
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
