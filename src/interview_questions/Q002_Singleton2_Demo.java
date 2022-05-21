package interview_questions;

public class Q002_Singleton2_Demo {

  public static void main(String[] args) {
    Q002_Singleton2 singleton2 = Q002_Singleton2.INSTANCE;
    System.out.println(singleton2);
  }

}
