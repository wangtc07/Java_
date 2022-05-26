package interview_questions.q002;

/**
 * 懶漢式: 延遲創建對象
 * 線程不安全(用於單線程)
 */
public class Q002_Singleton4 {
  // `靜態變數`來保存
  private static Q002_Singleton4 instance;

  // 建構子私有化
  private Q002_Singleton4() {
  }

  // 提供一個靜態方法，獲取此對象
  public static Q002_Singleton4 getInstance(){
    if (instance == null){

      // 模擬線程阻塞
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      instance = new Q002_Singleton4();
    }
    return instance;
  }
}
