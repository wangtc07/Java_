package Array_01;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] ax00 = {
                {1, 2, 3},
                {1, 111, 5, 5},
                {0, 20, 0, 9, 6},
                {1, 29, 39, 8, 100}
        } ;

        //縱向加總(行)
        for (int i = 0 ; i < ax00[0].length; i++) {
            int sum = 0 ;
            for (int v = 0 ; v < ax00.length; v++) {
                sum += ax00[v][i];
            }
            System.out.println("第" + i + "行的和="+ sum ) ;
        }

        int ax00Dim2Length = ax00[0].length;
        for (int i = 0; i < ax00.length; i++) {
            for (int j = 0; j < ax00[i].length; j++) {
                if (ax00[i].length > ax00Dim2Length){
                    ax00Dim2Length = ax00[i].length;
                }
            }
        }
        System.out.println("ax00Dim2Length "+ax00Dim2Length); //內層陣列最長的數

        int columnSum[] = new int[ax00Dim2Length]; //總和陣列

        for (int i = 0; i < ax00.length; i++) {
            for (int j = 0; j < ax00[i].length; j++) {
                columnSum[j] = columnSum[j] + ax00[i][j];
            }
        }
        //(0,0) (0,1)
        //(1,0) (1,1) (1,2)

        System.out.println(Arrays.toString(columnSum));
        for (int i = 0; i < columnSum.length; i++) {
            System.out.println(columnSum[i]);
        }

    }
}
