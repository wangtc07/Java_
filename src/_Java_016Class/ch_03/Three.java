package _Java_016Class.ch_03;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入");
        int i = 0 , j = 0;
        if (sc.hasNextInt()){
            i = sc.nextInt();
        }
        if (sc.hasNextInt()){
            j = sc.nextInt();
        }

        System.out.println("+ " + (i + j));
        System.out.println("- " + (i - j));
        System.out.println("* " + (i * j));
        System.out.println("% "+ (i % j));

    }
}
