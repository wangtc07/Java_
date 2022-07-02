package _Java_016Class.ch_03;

public class SIX {
    //
    public static void main(String[] args) {
        int squLenght = 10;
        int squArea = squLenght * squLenght;

        double cirArea = (squLenght/2)*(squLenght/2) * Math.PI;
        double area = squArea - cirArea;
        System.out.println("方形面積-內接圓面積ֵ=" + area);
    }
}
