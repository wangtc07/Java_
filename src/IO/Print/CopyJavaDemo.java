package IO.Print;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {

    	try (
    			BufferedReader br = new BufferedReader(new FileReader("Test.java"));
    			PrintWriter pw = new PrintWriter(new FileWriter("Test_PrintWriter.java"))
    	){
    		String line;
    		while ((line = br.readLine()) != null) {
    		    pw.println(line);                   // PrintWriter的println方法會自動換行
				System.out.println(line);
            }
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
