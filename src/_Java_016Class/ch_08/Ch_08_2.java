package _Java_016Class.ch_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class Ch_08_2 {
	public static void main(String[] args) {
		methodA();
		System.out.println("Program ends");
	}

	static void methodA() {
		try {
			int i = 3 / 0;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			URL urlA = new URL("http://www.seed.net.tw");
		} catch (MalformedURLException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			FileInputStream fis = new FileInputStream("c:\\Test.txt");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
