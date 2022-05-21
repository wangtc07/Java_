package interview_questions;

public class Q001 {

  public static void main(String[] args) {
    int i = 1;
    i = i++; // 1
    System.out.println(i);
    int j = i++; // 2
    System.out.println(j + " " + i);
    int k = i + ++i * i++; // 2 + 3 * 3 = 11
    System.out.println(k);

  }
}
