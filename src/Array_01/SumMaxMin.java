package Array_01;

import java.util.Arrays;

public class SumMaxMin {
	public static void main(String[] args) {
        System.out.println("計算整數陣列內元素的總和、最大值與最小值");
        int[] arr = {100, 77, 90, 88, 99, 39, 91 } ;
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int n = 0 ; n < arr.length; n++){
            sum += arr[n]; //總和
            if (arr[n] > max ){ //計算最大值，如果比當前的大，賦值給max
                max = arr[n];
            }
            if (arr[n] < min){  ////計算最小值，如果比當前的小，賦值給min
                min = arr[n];
            }
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        System.out.println("sum=" + sum);
        
        System.out.print("漸增排序:");
        Arrays.sort(arr);  //把陣列重新排序
        System.out.println(Arrays.toString(arr));
	}
}
