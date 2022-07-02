package IO;


import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ArrayLise2Txt_inver_rollCall {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		try(
			FileReader fr = new FileReader("copy_01.txt");
			BufferedReader br = new BufferedReader(fr);
		) {
			String str ;
			while ((str = br.readLine()) != null) {
				array.add(str);
			}
			System.out.println("don");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Random r = new Random();
		int index = r.nextInt(array.size());
		
		String name = array.get(index);
		System.out.println("random name: " + name);
	}
}
