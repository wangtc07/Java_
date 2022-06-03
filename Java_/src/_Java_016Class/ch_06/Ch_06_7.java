package _Java_016Class.ch_06;

/*
設計一個類別 MyRectangle，它有 兩個double型態的屬性:width與depth、三個方法與兩個建構子: 
void setWidth(double w):將收到的參數w放入屬性width內; 
void setDepth(double d):將收到的參數d放入屬性depth內; 
double getArea():能計算並傳回該長方形物件的面積
public MyRectangle():預設建構子
public MyRectangle(double width, double depth): 將傳入的參數存到同名的實例變數內

A. 編寫此類別。
B. 編寫另外一個類別MyRectangleMain，它只有main()方法，請在此方法
內利用預設建構子產生一個MyRectangle型別的物件R1，設定它的長與寬
為10與20，然後呼叫它的getArea()來印出它的面積。
C. 在main()方法內利用有參數的建構子產生第二個MyRectangle型別的物
件R2，傳入的長與寬10與20，然後呼叫它的getArea()來印出它的面積。
 */
public class Ch_06_7 {
	public static void main(String[] args) {
		MyRectangle m = new MyRectangle();
		m.setDepth(10);
		m.setWidth(20);
		System.out.println(m.getArea());

		MyRectangle m2 = new MyRectangle(10, 20);
		System.out.println(m2.getArea());
		System.out.println();

		System.out.println(m.equals(m2));
		System.out.println(m.hashCode());
		System.out.println(m2.hashCode());
	}
	/**
	 * Override MyRectangle的 public boolean equals(Object obj)方法與
	 * public int hashCode()。 如果兩個長方形的對應屬性相等就傳回true, 否則傳回false。
	 */	
}

class MyRectangle {
	public Object height;
	double width;
	double depth;

	public MyRectangle(double width, double depth) {
		super();
		this.width = width;
		this.depth = depth;
	}

	public MyRectangle() {
		super();
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	double getArea() {
		return width * depth;
	}
	
	public boolean equals(Object obj) {
		MyRectangle re = (MyRectangle) obj;
		if (obj instanceof MyRectangle) {
			if (this.height == re.height && width == re.width ) {
				return true;
			}else { // 不同類別的物件走這裡
				return false; 
			}		
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
