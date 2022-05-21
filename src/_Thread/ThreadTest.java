package _Thread;




//
//以卖票程序为例，通过Runnable接口來實現完成, 達到資源共享
//三個線程, 共同來賣10張票

public class ThreadTest {

  public static void main(String[] args) {
    MyThread mt = new MyThread();

    // 用3個線程來賣10張票
    new Thread(mt).start();
    new Thread(mt).start();
    new Thread(mt).start();

    MyThread3 mt1 = new MyThread3("線程A");
    MyThread3 mt2 = new MyThread3("線程b");
    mt1.run(); //mt1 執行完, 然後才會執行mt2
    mt2.run();
  }
}

class MyThread implements Runnable {

  private int ticket = 10;

  @Override
  public void run() {
    for (int i = 0; i < 20; i++) {
      if (this.ticket > 0) {
        System.out.println(Thread.currentThread().getName() + "賣票: ticket" + this.ticket--);
      }
    }
  }
}

class MyThread3 extends Thread {

  private String name;

  public MyThread3(String name) {
    super();
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("線程開始: " + this.name + ", i= " + i);
    }
  }
}
