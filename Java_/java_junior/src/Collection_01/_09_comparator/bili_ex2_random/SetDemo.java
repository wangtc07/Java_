package Collection_01._09_comparator.bili_ex2_random;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>(); //不會排序
		Set<Integer> set = new TreeSet<>(); //會排序
		
		
		// 創建random
		Random random = new Random();
		
		while (set.size() < 10) {
			int num = random.nextInt(20)+1;
			set.add(num);
		}
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}
}
