package interview_questions;

public class Q002_Singleton4_Demo {

  // 單線程
  public static void main(String[] args) {
    Q002_Singleton4 singleton4 = Q002_Singleton4.getInstance();
    System.out.println(singleton4);

    Q002_Singleton4 singleton4_2 = Q002_Singleton4.getInstance();
    System.out.println(singleton4_2);

    System.out.println(singleton4 == singleton4_2);
  }

}
