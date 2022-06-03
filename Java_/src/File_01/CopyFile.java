package File_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class CopyFile {

	public static void main(String[] args) throws IOException {
//		if (args.length != 2) {
//			System.err.println("Usage:\n  java CopyFile.java <source> <target>");
//			System.exit(1);
//		}
//		copy(args[0], args[1]);
		long s = 0, e = 0;
		s = System.currentTimeMillis();
		copy("SamplePictures.zip", "SamplePicturesB.zip");
		e = System.currentTimeMillis();
		System.out.println("時間差(每次讀/寫一個位元組)=" + (e - s));
	}

	static void copy(String source, String target) throws IOException {
		// 友情提示：测试时请使用无关紧要的文件

		try (InputStream input = new FileInputStream(source);
			     OutputStream output = new FileOutputStream(target))
			{
				
			    input.transferTo(output); 
			    System.out.println("复制成功");
			}
	}
}
