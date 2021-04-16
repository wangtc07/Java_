package _Java_016Class.ch_03;

public class Two {
    public static void main(String[] args) {
        //
        int sec = 256559;
        final int SEC_MIN = 60;
        final int HR_DAY = 24;

        int min = sec / SEC_MIN;
        int sectemp = sec % SEC_MIN;

        int hr = min / SEC_MIN;
//        int hrTemp = mintemp % SEC_MIN;
        min = min - (hr * SEC_MIN);

        int day = hr / HR_DAY;
        hr = hr - (day * HR_DAY);

        System.out.println(day + "day, " + hr + "hr, " + min + "min, " + sectemp + "sec,");


    }
}
