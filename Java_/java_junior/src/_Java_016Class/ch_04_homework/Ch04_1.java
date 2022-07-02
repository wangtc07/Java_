package _Java_016Class.ch_04_homework;
/*
撰寫一個程式，它能由1-100個數字中隨機產生10個數字，並算出它們的總和與平均。(請用for敘述來完成)
 */
public class Ch04_1 {
	public static void main(String[] args) {
		int workCh4_1 = 0;
        for (int i = 0; i < 10; i++) {
            int r = (int)(Math.random()*100+1);
            System.out.println(r);
            workCh4_1 += r;
        }
        System.out.println("1-100個數字中隨機產生10個數字，並算出它們的總和 = " + workCh4_1);
        System.out.println("1-100個數字中隨機產生10個數字，並算出它們的平均 = " + (workCh4_1/10.0));

	}
}
