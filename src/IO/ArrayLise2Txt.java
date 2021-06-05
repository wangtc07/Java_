package IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayLise2Txt {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("wang");
		array.add("mayu");
		array.add("kakki");
		array.add("sera");
		
		try(
			FileWriter fw = new FileWriter("array.txt");
			BufferedWriter bw = new BufferedWriter(fw);
		) {
			for (String string : array) {
				bw.write(string);
				bw.newLine();
			}
			
			System.out.println("don");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
