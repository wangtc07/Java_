package File_01;

import java.io.File;

public class File_HelloWard {
	public static void main(String[] args) {
		File f1 = new File("/Users/tcwang/Documents/GitHub/Java_/src/File_01" ,"a.txt");
		System.out.println(f1.exists());
		System.out.println(f1.getAbsolutePath());
		
		File f2 = new File("a.txt");
		System.out.println(f2.exists());
		System.out.println(f2.getAbsolutePath());
	}

}