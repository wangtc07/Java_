package _Java_016Class.ch11_thread.lab01;

public class DrawStarThread extends Thread {

  int x;
  int y;
  String s;

  public void run() {
    for (int i = 0; i < x; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(s);
      }
      System.out.println();
    }
  }

  public DrawStarThread(int x, int y, String s) {
    this.x = x;
    this.y = y;
    this.s = s;
  }

}
