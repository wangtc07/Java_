package IO;

import java.io.*;
import java.util.Arrays;

public class StringDemo_Buffered {
	public static void main(String[] args) throws Exception {
		try(
			// 輸出流
			FileWriter fw = new FileWriter("BufferWriter.txt");
			BufferedWriter bw = new BufferedWriter(fw);
		){
			bw.write("wang");
			bw.write("\nまゆたん");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
