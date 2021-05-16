package _Thread;

public class Ticket_1 extends Thread {
    private int ticket = 10;

    public void run(){
//    	for(int i = 0 ; i < 20 ; i++) {
//			if(this.ticket > 0) {
//				System.out.println(Thread.currentThread().getName()+"賣票---->" + this.ticket--);
//			}
//		}
        for(int i =0;i<10;i++){
            synchronized (this){
                if(this.ticket>0){
                    try {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName()+"賣票---->"+(this.ticket--));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] arg){
    	Ticket_1 t1 = new Ticket_1();
        new Thread(t1,"線程1").start();
        new Thread(t1,"線程2").start();
    }
}
