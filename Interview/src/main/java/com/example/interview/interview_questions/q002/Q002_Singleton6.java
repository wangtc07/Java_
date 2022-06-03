package com.example.interview.interview_questions.q002;

/**
 * 靜態內部類形式(用於多線程)
 */
public class Q002_Singleton6 {

  private Q002_Singleton6(){

  }

  /**
   * 在內部類被加載和初始化時，才創建實例對象
   * 靜態內部類不會隨著外部類的加載和初始化而初始化，他是要單獨去加載和初始化的
   * 在內部類被加載和初始化時創建外部類實例，所以是線程安全
   */
  private static class Inner {
    private static final Q002_Singleton6 INSTANCE = new Q002_Singleton6();
  }

  public static Q002_Singleton6 getInstance(){
    // 在用 Inner 時，創建
    return Inner.INSTANCE;
  }
}
