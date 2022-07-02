package _Java_016Class.ch_04_homework;
//3A.由程式算出1-10的連乘積。(請用while敘述來完成)
public class Ch04_3A {
	public static void main(String[] args) {
		int workCh04_3A = 1;
		int temp = 1;
		while(temp<=10) {
			workCh04_3A *= temp;
			temp++;
		}
		System.out.println(workCh04_3A);
	}
}
