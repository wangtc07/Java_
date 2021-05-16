package Collection_01;

import java.util.*;
import java.text.*;

public class Col_01_Date {
	public static void main(String[] args) {
		
		//設定時間
		Date nowDate = new Date();
		System.out.println(new Date());
		Calendar nowCalendar = Calendar.getInstance();
		nowCalendar.setTime(nowDate);
		System.out.println(nowCalendar);
		
		System.out.println(System.currentTimeMillis());
		
		
		System.out.println("格式化成指定格式---------------------");
		//format
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd h:mm a");
		String dateString = dateFormat.format(nowDate);
		System.out.println(dateString);
		
		System.out.println("日期操作---------------------");
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getClass().getName());
		int theYear = calendar.get(Calendar.YEAR);
		int theMonth = calendar.get(Calendar.MONTH) + 1;
		System.out.println(theMonth);
		
		//set
		calendar.set(Calendar.MONTH, 0);		  //設定月份
		calendar.set(Calendar.DAY_OF_MONTH, 10);  //每月的第Ｘ天
		
		System.out.println("---------------------");
		calendar.add(Calendar.YEAR, 1);    		  //加
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		
	}
}
