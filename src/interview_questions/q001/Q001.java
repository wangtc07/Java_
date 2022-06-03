package interview_questions.q001;

public class Q001 {

  public static void main(String[] args) {
    int i = 1;
    i = i++; // 1
    System.out.println(i); // 1
    int j = i++; // i == 2
    System.out.println(j); // 1
    int k = i + ++i * i++; // 2 + 3 * 3
    System.out.println(k); // 11
  }
}
