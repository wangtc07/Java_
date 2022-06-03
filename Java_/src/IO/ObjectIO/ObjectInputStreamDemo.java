package IO.ObjectIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.java"))) {
            Object obj = ois.readObject();

            Student s = (Student) obj;
            System.out.println(s.getId());
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getAddress());

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
