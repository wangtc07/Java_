package IO.Print;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteDemo {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"), true)) {
            pw.println("hello2");
            pw.println("world2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
