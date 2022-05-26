package interview_questions.q002;

/**
 * 懶漢式: 延遲創建對象 線程安全(用於多線程)
 */
public class Q002_Singleton5 {

  // `靜態變數`來保存
  private static Q002_Singleton5 instance;

  // 建構子私有化
  private Q002_Singleton5() {
  }

  // 提供一個靜態方法，獲取此對象
  public static Q002_Singleton5 getInstance() {
    // 需要創建對象，才去搶鎖
    if (instance == null) {
      // 線程鎖
      synchronized (Q002_Singleton5.class) {
        // 線程安全後，再判斷是否需要創建對象
        if (instance == null) {
          // 模擬線程阻塞
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          instance = new Q002_Singleton5();
        }
      }
    }
    return instance;
  }
}
