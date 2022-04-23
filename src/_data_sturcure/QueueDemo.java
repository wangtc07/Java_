package _data_sturcure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue Demo
 */
public class QueueDemo {

  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();

    queue.add("a");
    queue.offer("b");
    queue.add("c");

    System.out.println(queue); // [a, b, c]

    System.out.println(queue.poll()); // 取出並刪除a
    System.out.println(queue.peek()); // 取出b
    System.out.println(queue.remove()); // 取出並刪除b
    System.out.println(queue.element()); // 取出c

    System.out.println(queue.size()); // 1

    System.out.println(queue.poll()); // c
    System.out.println(queue.peek()); // null
    System.out.println(queue.remove()); // throw exception
  }

}
