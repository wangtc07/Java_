package InnerClass.inner_1;

public class OuterDemo {
	public static void main(String[] args) {
//		Outer.Inner inner = new Outer.Inner();	//err
		
//		Outer.Inner inner = new Outer().new Inner();	//Inner 是 private的話會錯誤
//		inner.innerMethod();					//inner method > 10

		Outer outer = new Outer();				//使用outer 調用inner的方法 來訪問inner的方法
		outer.outerMethod();					//outer method > inner method > 10
//		outer.innerMethod();					//err
	}
}
