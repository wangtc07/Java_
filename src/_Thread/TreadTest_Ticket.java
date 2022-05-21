package _Thread;

public class TreadTest_Ticket {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		
		/*用3個線程來賣10張票*/
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}
}

class MyThread2 implements Runnable {
	private int ticket = 10;

	@Override
	public void run() {
		for(int i = 0 ; i < 200 ; i++) {
			if(this.ticket > 0) {
				System.out.println(Thread.currentThread().getName() +"賣票---->" + this.ticket--);
			}
		}
	}
}