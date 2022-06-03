package IO;


import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayLise2Txt_inver {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		try(
			FileReader fr = new FileReader("array.txt");
			BufferedReader br = new BufferedReader(fr);
		) {
			String str ;
			while ((str = br.readLine()) != null) {
				array.add(str);
			}
			
			for (String s : array) {
				System.out.println(s);
			}
			
			System.out.println("don");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
