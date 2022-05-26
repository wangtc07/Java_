package interview_questions.q002;

import java.io.IOException;
import java.util.Properties;

/**
 * 靜態代碼快餓漢式(適合複雜實例化)
 */
public class Q002_Singleton3 {

  public static final Q002_Singleton3 INSTANCE;
  private final String info;

  static {
    // 從 properties 文件加載訊息
    Properties pro = new Properties();
    try {
      pro.load(Q002_Singleton3.class.getClassLoader()
          .getResourceAsStream("single.properties"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    INSTANCE = new Q002_Singleton3(pro.getProperty("info"));
  }

  // 建構子私有化
  private Q002_Singleton3(String info) {
    this.info = info;
  }

  @Override
  public String toString() {
    return "Q002_Singleton3{" +
        "info='" + info + '\'' +
        '}';
  }
}
