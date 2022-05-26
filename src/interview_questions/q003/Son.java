package interview_questions.q003;

import org.w3c.dom.ls.LSOutput;

public class Son extends Father {

  private int i = test();
  private static int j = method();

  static {
    System.out.print(6 + " - ");
  }

  public Son() {
    System.out.print(7 + " - ");
  }

  {
    System.out.print(8 + " - ");
  }

  @Override
  public int test() {
    System.out.print(9 + " - ");
    return 1;
  }

  private static int method() {
    System.out.print(10 + " - ");
    return 1;
  }

  public static void main(String[] args) {
    Son son = new Son();
    System.out.println();
    Father father = new Father();
  }

  /*
  5 - 1 - 10 - 6 - 9 - 3 - 2 - 9 - 8 - 7 -
  4 - 3 - 2 -
   */
}
