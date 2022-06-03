package com.example.interview.interview_questions.q005;

public class Q005 {

  public static void main(String[] args) {
//    System.out.println(f(0));
    System.out.println(f(1));
    System.out.println(f(2));
    System.out.println(f(3));
    System.out.println(f(4));
  }

  /**
   * @param n n 步台階
   * @return 有幾種走法
   */
  private static int f(int n) {
    if (n < 1) {
      throw new IllegalArgumentException(n + "不能小於1");
    }
    if (n == 1 || n == 2) {
      return n;
    }

    return f(n - 2) + f(n - 1);
  }
}
