package _Java_016Class.ch_04_0415;
/**
 * 
 * @author tcwang
   *
  ***
 *****
*******
 *****
  ***
   *

 */
public class PrintStars {

	public static void main(String[] args) {
		
		int row = 10;
		row = row % 2 == 0 ? row+1 : row;
		System.out.println(row);
		int helfRow = row/2;
		
		//總共有7列，上半部為7/2+1=>4列
		//
		for(int i = 1 ; i <= helfRow+1 ; i++) {
			int magic =  (row - (i * 2 - 1)) / 2; //每行空間減**的一半(total - ***) /2
			for(int j = 0 ; j < magic ; j++ ) {
//				System.out.print("-");
			} 
			
			for(int j = helfRow+1; j > i ; j--) { //遞減:3>2>1>0
				System.out.print(" ");
			}
//			System.out.print(i + " ");	//列數
//			System.out.print(i*2-1);	//星星數
			for(int j = 1 ; j <= i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i = helfRow ; i >= 1 ; i--) {
			int magic =  (row - (i * 2 - 1)) / 2; //(total - ***) /2
			for(int j = 0 ; j < magic ; j++ ) {
				System.out.print(" ");
			} 
//			System.out.print(i + " ");	//列數
//			System.out.print(i*2-1);	//星星數
			for(int j = 1 ; j <= i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
