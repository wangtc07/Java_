package IO.ArrayListToTxt;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class ArrayListToTxt_Sort {
	public static void main(String[] args) {
		// 創建TreeSet集合，通過比較器，使用匿名內部類  
		// TreeSet​(Comparator<? super E> comparator)
		TreeSet<Student_Score> array = new TreeSet<>(new Comparator<>() {
			@Override
			public int compare(Student_Score s1, Student_Score s2) {
				int num = s2.getSum() - s1.getSum();
				int num2 = num == 0 ? s2.getChinese() - s1.getChinese() : num;
				int num3 = num2 == 0 ? s2.getEnglish() - s1.getEnglish() : num2;
				int num4 = num3 == 0 ? s2.getMath() - s1.getMath() : num3;
				int num5 = num4 == 0 ? s2.getName().compareTo(s1.getName()) : num4;
				return num5;
			}
		});
		
		Student_Score s1 = new Student_Score("wang ", 25, 10, 15);
		Student_Score s2 = new Student_Score("mayu ", 21, 10, 15);
		Student_Score s3 = new Student_Score("kakki", 19, 10, 15);
		Student_Score s4 = new Student_Score("sera ", 20, 10, 15);
		array.add(s1);array.add(s2);array.add(s3);array.add(s4);
		
		

		try(
				FileWriter fw = new FileWriter("ArrayListToTxt_Sort.txt");
				BufferedWriter bw = new BufferedWriter(fw);
		){
			for (Student_Score s : array) {
				StringBuilder builder = new StringBuilder();
				builder.append(s.getName());
				builder.append(",");
				builder.append(s.getMath());
				builder.append(",");
				builder.append(s.getEnglish());
				builder.append(",");
				builder.append(s.getChinese());		
				builder.append(",");
				builder.append(s.getSum());
				String string = builder.toString();
				bw.write(string);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
