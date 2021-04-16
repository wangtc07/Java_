package _Java_016Class.ch_04_homework;

public class Ch04_6 {
	public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
            for (int k = 1; k <= 10; k++) {
            	int muti = k * j;
            	String s ;
             	if(muti < 10) {
            		s = "  ";
            	}else if(muti > 99){
					s = "";
				}else {
					s = " ";
				}
            	System.out.print(s + (k*j) + " ");
                //if (k <= j){
                //    System.out.print(k + "*" + j + "=" + (k*j) + " , ");
                //}
            }System.out.println();
        }
	}
}
