package File_01;

import java.io.*;

public class File_HelloWard_2 {
	public static void main(String[] args) {
		File f1 = new File("Source.gif");
		File f2 = new File("test.gif");
		System.out.println(f1.getAbsolutePath());
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(f1);
			os = new FileOutputStream(f2);
			
			int n;
			while ((n = is.read()) != -1) {
				os.write(n);				
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());		
		}
	}
}
