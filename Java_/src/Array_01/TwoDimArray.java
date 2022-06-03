package Array_01;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {

        //二維陣列  • 元素為一維陣列的陣列稱為二維陣列
        int twoDim[][] = new int[4][];
        //二維陣列twoDim有四個元素，這些元素都是一維陣列，目前不知道每個一維陣列有幾個元素。
        int twoDim2[][] = new int[4][5];
        //二維陣列twoDim2有四個元素，這些元素都是一維陣列，這些一維陣列都各有5個元素。
        int saa[][] = {
                {1 , 2},
                {1 , 2 , 3,}
        };
        //直接指定二維陣列元素的初值

        //二維陣列的列加總與行加總
        int[][] ax00 = {
                {1,  2,  3},
                {1,111,  5, 5},
                {0, 20,  0, 9,   6},
                {1, 29, 39, 8, 100 , 46}
        } ;

        int sum = 0;
       
        // 縱向加總(行)  只能處理同長度內容的二維陣列
         /*
        for (int i = 0 ; i < ax00[0].length; i++) {
            sum = 0 ;
            for (int v = 0 ; v < ax00.length; v++) {
                sum += ax00[v][i];
            }
            System.out.println("第" + i + "行的和="+ sum ) ;
        }
        */
        
        //計算二維陣列裡，元素陣列的最長長度
        int DimMaxLength = 0;
        for (int i = 0; i < ax00.length; i++) {       //執行二維陣列裡，每個元素
            if (ax00[i].length > DimMaxLength){       //如果元素陣列的長度比較大，儲存到arrarymax的變數中
                DimMaxLength = ax00[i].length;
            }
        }
        System.out.println("DimMaxLength = "+ DimMaxLength);    //內層陣列最長的數
        int columnSum[] = new int[DimMaxLength];      //一維陣列：用來儲存每行得加總

        for (int i = 0; i < ax00.length; i++) {             //執行二維陣列裡，每個元素
            for (int j = 0; j < ax00[i].length; j++) {      //執行元素陣列裡，每個值
                columnSum[j] = columnSum[j] + ax00[i][j];   //二維陣列的 第 i 列 的 第 j 行，儲存到加總陣列的第 j 行
            }
        }
        //(0,0) (0,1)
        //(1,0) (1,1) (1,2)

        //行加總
        System.out.println(Arrays.toString(columnSum));
        for (int i = 0; i < columnSum.length; i++) {
            System.out.println("第" + i + "行的和="+ columnSum[i]);
        }
    }
}
