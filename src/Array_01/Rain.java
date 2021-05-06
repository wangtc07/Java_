package Array_01;

import java.text.DecimalFormat;
import java.util.Iterator;

public class Rain {
	public static void main(String[] args) {
		final int YEARS = 5;
		final int MONTHS = 3;
		
		double [][] rain = {
				{1,2,3},
				{2,3,4},
				{3,4,5},
				{4,5,6},
				{5,6,7},
		};
		
		int year , month;
		double subtotal , total = 0;
		
		for(year = 0 ; year < YEARS ; year++) {
			for(month = 0 , subtotal = 0 ; month < MONTHS ; month++) {
				subtotal += rain[year][month];
				subtotal = Math.round(subtotal*100)/100.0;		//取到小數點後兩位
				total +=  rain[year][month];
			}
			System.out.println((2016+year)+"year = " + subtotal);
		}
		System.out.println("2016-2020= " + total);
		System.out.println("--------------------------\n");

//五年的每月平均雨量
		System.out.println("  mon  fab  mar");
		double subMonthtotal ;
		for(month = 0 ; month < MONTHS ; month++) {
			for(year = 0 ,subMonthtotal = 0 ; year < YEARS ; year++) {
				subMonthtotal += rain[year][month];
				subMonthtotal = Math.round(subMonthtotal*100)/100.0;			//取到小數點後兩位
			}
//			System.out.printf("%5.1f" , subMonthtotal / YEARS);			    	//格式化小數點後兩位
			System.out.print("  " + new DecimalFormat("0.0").format(subMonthtotal / YEARS) );	//格式化小數點後兩位
		}

	}
}
