package InnerClass.Lambda_;

public class LambdaDemo {
	public static void main(String[] args) {
		
		Lambda la = new Lambda();
		
		la.lamgda();			//>>直接.方法10
		
		ImpOper im = new ImpOper();
		
		
		//匿名內部類  只使用一次 省去不同需求都要新增類別
		im.impOper(new Imperent() {
			@Override
			public void m1(int i, int j) {
				System.out.println("orang way");
			}
		});
		
		im.impOper((int i, int j) -> {System.out.println("->");}) ;
		//			   帶入參數					結 果
	}
}
