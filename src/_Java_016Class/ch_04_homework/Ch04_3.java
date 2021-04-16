package _Java_016Class.ch_04_homework;
/*
由程式算出1-10的連乘積。(請用for敘述來完成)
 */
public class Ch04_3 {
	public static void main(String[] args) {
        int workCh4_3 = 1;
        for (int i = 1; i <= 10; i++) {
            workCh4_3 *= i;
        }
        System.out.println("1-10的連乘積 = " + workCh4_3);

	}
}
