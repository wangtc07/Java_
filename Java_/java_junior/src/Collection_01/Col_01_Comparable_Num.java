package Collection_01;

public class Col_01_Comparable_Num  implements Comparable<Col_01_Comparable_Num>{
	int i;

	public Col_01_Comparable_Num(int i) {
		super();
		this.i = i;
	}

	@Override
	public int compareTo(Col_01_Comparable_Num o) {
		return  o.i - i ;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}
	
}
