package InnerClass.inner_2;

public class Outer {
	private int num = 1;
	
	public void outerMethod() {
		int num2 = 2;
		
		class MethodInner{						//不能是private?
			public void methodInnerMothod() {
				System.out.println( "outer int  > " + num);
				System.out.println( "method int > " + num);
			}
		}
		MethodInner mInner = new MethodInner();
		mInner.methodInnerMothod();				//訪問局部內部類 main方法實際訪問這段
	}
}
