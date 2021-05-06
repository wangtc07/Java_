package InnerClass.inner_1;

public class Outer {
	private int a = 10;
	/*								//通常不寫public
	public class Inner{
		public void innerMethod() {
			System.out.print("inner method > ");
			System.out.println(a);	//inner class可以直接訪問 outer class成員
		}
	}
	*/
	private class Inner{
		public void innerMethod() {
			System.out.print("inner method > ");
			System.out.println(a);	//inner class可以直接訪問 outer class成員
		}
	}
	
	public void outerMethod() {
//		innerMethod();				//不能直接訪問inner class成員
		Inner inner = new Inner();	//必須創建對象inner class
		System.out.print("outer method > ");
		inner.innerMethod();
	}
}
