package IO.ObjectIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// .NotSerializableException: 當實例需要具有Serializable接口時拋出。 序列化運行時或實例的類可以拋出此異常。
// 實現java.io.Serializable接口的類啟用了類的可序列化(標示可序列化和反序列化)，沒有方法需要重寫。

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {

        Student s = new Student("001", "wang" , 5 , "taipei");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.java"))) {
            oos.writeObject(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
