package _Java_016Class.ch_04_homework;
/*
請由程式算出1-1000的偶數和。(請用for敘述來完成)
 */
public class Ch04_2 {
	public static void main(String[] args) {

        int workCh4_2 = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0){
                workCh4_2 += i;
            }
        }
        System.out.println("請由程式算出1-1000的偶數和 = " + workCh4_2);
	}
}
