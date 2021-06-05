package IO.ArrayListToTxt;

import java.io.*;
import java.util.ArrayList;

public class ArrayListToTxt_inver {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<>();
		
		try(
				FileReader fr = new FileReader("ArrayListToTxt.txt");
				BufferedReader br = new BufferedReader(fr);
		){
			String line;
			while ((line = br.readLine()) != null) {
				String[] split = line.split(",");
				Student s = new Student();
				s.setId(split[0]);
				s.setName(split[1]);
				s.setAge(Integer.parseInt(split[2]));
				s.setAddress(split[3]);
				
				array.add(s);
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (Student student : array) {
			System.out.println(student);
		}
		
	}
}
