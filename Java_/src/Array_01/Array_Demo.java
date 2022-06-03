package Array_01;

import java.util.Arrays;

public class Array_Demo {
    public static void main(String args[]) {
        //陣列(Array)
        /*
        用來儲存一組 型態相同 或 相容 的資料
        定義陣列必須說明陣列名稱、元素的資料型態與元素的個數
        資料型態 陣列名稱[] = new 資料型態[n] ;
        或
        資料型態[] 陣列名稱 = new 資料型態[n] ; n:陣列元素的個數
         */

        int xa[] = new int[100];     //定義一個名為xa的陣列，可以存放100個整數
        char a5[] = new char[15];    //定義一個名為a5的陣列，可以存放15個字元
        double a7[] = new double[10];//定義a7陣列，可以存放10個double浮點數

        /*
        • 型態相容的資料
        – 元素為double型態的陣列，可以存放float、long、int、short、byte、 char型態的資料。
        – 元素為int型態的陣列，可以存放int、short、byte、char型態的資料，不 能存放double、float、long型態的資料。
         */

        //設定陣列元素的初值
        double a1[] = new double[3];
        a1[0] = 10.0 ;
        a1[1] = 90.1 ;
        a1[2] = 9 ;

        int a2[] = {100, 77, 90, 88, 99};
        //定義有五個元素的整數陣列，同時設定這些元素的值。

        String name[] = {"Mary", "John", "Lisa", "Ellen"};
        //定義有四個元素的字串陣列，同時設定四個元素的值。

        // lab01
        //整數陣列(元素為整數的陣列)ar，其內有五個元素:59, 27 , -18 , 98 , 10
        int ar[] = new int[]{59, 27 , -18 , 98 , 10};

        //浮點數陣列(元素為浮點數的陣列)br，其內有三個元素:3.14, 75.9, 18.9
        double br[] = new double[]{3.14, 75.9, 18.9};

        //字串陣列(元素為字串的陣列)cr，其內有三個元素:"kitty", "snoopy", "garfield"
        String cr[] = new String[]{"kitty", "snoopy", "garfield"};


        //存取陣列內的所有元素    要存取最好的方法是利用for敘述。
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        System.out.println("Java 5.0提供新版的for敘述:");
        /*
        for(型態 n: 陣列){
            迴圈本體
        }
        此for敘述會由陣列中，一次取出一個元素，放入變數n內，然後將迴圈本體內的敘述執行一次，
        然後重複此步驟，直到每個元素 都處理一次才結束。
         */
        for (int n : ar) {
            System.out.println(n);
        }

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

        // lab02
        // 定義:整數陣列 ar，其內含有下列元素:100, 35, 46, 75, 56, 69，
        // 請計算並印出這些元素的總和，平均，最大的元素與最小的 元素。
        System.out.println("");
        int lab02ar[] = {100, 35, 46, 75, 56, 69};
        int lab02Max = lab02ar[0];
        int lab02Min = lab02ar[0];
        int lab02Sum = 0;
        for (int i = 0; i < lab02ar.length; i++) {
            lab02Sum += lab02ar[i];
            if (lab02ar[i] > lab02Max){
                lab02Max = lab02ar[i];
            }
            if (lab02ar[i] < lab02Min){
                lab02Min = lab02ar[i];
            }
        }
        System.out.println("總和 "+ lab02Sum);
        System.out.println("平均 "+ (lab02Sum/lab02ar.length));
        System.out.println("最大 "+ lab02Max);
        System.out.println("最小 "+ lab02Min);

        //陣列元素的排序與列印
        /*
        • java.util.Arrays類別的sort()方法可對陣列元素排序
        • java.util.Arrays類別的toString()方法可以字串來表示陣列內的元素: [v1, v2, v3,...vn]
         */
        System.out.print("漸增排序:");
        Arrays.sort(ar);  //把陣列重新排序
        System.out.println(Arrays.toString(ar));

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
                {1, 2, 3},
                {1, 111, 5, 5},
                {0, 20, 0, 9, 6},
                {1, 29, 39, 8, 100}
        } ;

        //縱向加總(行)
        for (int i = 0 ; i < ax00[0].length; i++) {
            sum = 0 ;
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
            System.out.println("第" + i + "列的和="+ columnSum[i]);
        }


    }
}
