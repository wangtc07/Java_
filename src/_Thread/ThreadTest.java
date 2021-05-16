package _Thread;
//java線程--Runnable和Thread的區別
//
//在java中有2種方式實現多線程, 一種是繼承Thread類, 一種是實現Runnable接口
//繼承Thread類後, 覆寫該本類中的run()方法, 就可以實現多線程操作



/*以下為多線程運作的例子, 是無法交互操作的錯誤示範*/
//public class ThreadTest {
//	public static void main(String[] args) {
//		MyThread mt1 = new MyThread("線程A");
//		MyThread mt2 = new MyThread("線程b");
//		mt1.run(); //mt1 執行完, 然後才會執行mt2
//		mt2.run();
//	}
//}

//class MyThread extends Thread {
//	private String name;
//
//	public MyThread(String name) {
//		super();
//		this.name = name;
//	}
//
//	@Override
//	public void run() {
//		for(int i = 0 ; i < 10 ; i++) {
//			System.out.println("線程開始: " + this.name + ", i= " + i);
//		}
//	}
//}

/*將run()方法改為調用start()方法, 這樣就可以實現交互運行的多線程*/
//public class ThreadTest {
//	public static void main(String[] args) {
//		MyThread mt1 = new MyThread("線程A");
//		MyThread mt2 = new MyThread("線程b : ");
//		mt1.start();
//		mt2.start();
//	}
//}


//在實際開發多線程的操作時, 很少使用Thread類, 通常是通過Runnabe接口
//public interface Runnable {
//	public void run();
//}



/*以下以Runnable接口為例子測試
須注意Runnable定義的子類中沒有start()方法, 需要通過Thread類來啟動Runnable實現的多線程
*/
//public class ThreadTest {
//	public static void main(String[] args) {
//		MyThread mt1 = new MyThread("線程A");
//		MyThread mt2 = new MyThread("線程b : ");
//		new Thread(mt1).start();
//		new Thread(mt2).start();
//	}
//}

//class MyThread implements Runnable {
//	private String name;
//
//	public MyThread(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public void run() {
//		for(int i = 0 ; i < 20 ; i++) {
//			System.out.println("線程開始: " + this.name + ", i= " + i);
//		}
//	}
//}



/*以卖票程序为例，通过Runnable接口來實現完成, 達到資源共享
三個線程, 共同來賣10張票
*/
public class ThreadTest {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		
		/*用3個線程來賣10張票*/
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}
}

class MyThread implements Runnable {
	private int ticket = 10;

	@Override
	public void run() {
		for(int i = 0 ; i < 20 ; i++) {
			if(this.ticket > 0) {
				System.out.println("賣票: ticket" + this.ticket--);
			}
		}
	}
}