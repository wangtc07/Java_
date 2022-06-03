package IO.ArrayListToTxt;

import java.io.*;
import java.util.ArrayList;

public class ArrayListToTxt {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<>();
		Student s1 = new Student("aa001", "wang", 5, "taiwan");
		Student s2 = new Student("aa002", "mayu", 21, "japain");
		Student s3 = new Student("aa003", "kakki", 19, "japain");
		Student s4 = new Student("aa004", "sera", 20, "japain");
		array.add(s1);array.add(s2);array.add(s3);array.add(s4);

		try(
				FileWriter fw = new FileWriter("ArrayListToTxt.txt");
				BufferedWriter bw = new BufferedWriter(fw);
		){
			for (Student s : array) {
				StringBuffer  sb = new StringBuffer();  //拼接
				sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
				bw.write(sb.toString());
				bw.newLine();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
