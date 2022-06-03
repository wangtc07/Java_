package _Java_016Class.ch_03;

import java.util.Scanner;

public class FOUR {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);

        System.out.println("輸入");

        String s1 = "" , s2 = "" , s3 = "";

        if (sc.hasNext()) {
            s1 = sc.next();
        }
        if (sc.hasNext()) {
            s2 = sc.next();
        }
        if (sc.hasNext()) {
            s3 = sc.next();
        }

        System.out.println("s1length");
        System.out.println(s1.length());
        System.out.println("s2length");
        System.out.println(s2.length());
        System.out.println("s3長度");
        System.out.println(s3.length());
    }
}
