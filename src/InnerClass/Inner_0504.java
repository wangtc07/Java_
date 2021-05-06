package InnerClass;

public class Inner_0504 {
	public static void main(String[] args) {
//		test(new Iperent() {
//			@Override
//			public void m1(int i) {			
//				System.out.println(++i);
//			}
//		});
		//等同上列
		test((int i) -> {			
			System.out.println("Lambda");
		});
		
	}
	
	static void test (Iperent parent) {
	}
}

interface Iperent{
	void m1(int i);
}
