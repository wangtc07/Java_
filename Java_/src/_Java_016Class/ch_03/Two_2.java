package _Java_016Class.ch_03;

public class Two_2 {
    public static void main(String[] args) {
        int temp = 256559;
        int sec , min , hr , day ;

        sec = 1;
        min = sec * 60;
        hr = min * 60;
        day = hr * 24;


        int dayFinal = temp / day;
        System.out.println("day=" + dayFinal);
        int hrFinal = (temp % day) / hr;
        System.out.println("hr=" + hrFinal);
        int minFinal = (temp % day % hr) /min;
        System.out.println("min=" + minFinal);
        int secFinal = temp % min;
        System.out.println("sec=" + secFinal);

    }
}
