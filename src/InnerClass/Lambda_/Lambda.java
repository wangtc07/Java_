package InnerClass.Lambda_;

public class Lambda {
	abstract static class ClassicInner {
	}
	
	static class InnerStatic{
		private void innerM() {
			System.out.println("inner");
		}
	}
	
	public void lamgda() {
		//對象
		new Imperent() {
			@Override
			public void m1(int i, int j) {
				System.out.println(i+j);
			}	
		};
		//對象調方法
		new Imperent() {
			@Override
			public void m1(int i, int j) {
				System.out.println("直接.方法"+(i+j));	
			}
		}.m1(5, 5);
		
		//Lambda只能創建只有一個抽象方法的 抽象類or介面
		Imperent imperent = (int i, int j) -> {System.out.println( "Lambda"+(i+j) );};
		imperent.m1(5,5);		//Lambda
		
		class Inner{
			private void innerM() {
				System.out.println("inner");
			}
		}
		
		
		
		
	}
}
