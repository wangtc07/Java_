# Queue 列隊

Java的Queue介面屬於Java集合框架(Java Collections Framework)的一員，繼承Collection介面。

Queue除了Collection的操作方法外還有自身的插入、抽取及檢視元素的操作方法。這些操作分為兩種類型，一種失敗時拋出例外，另一種失敗時返回特定值（例如null或false）。

拋出例外: `add(e)`, `remove()`, `element()`
回傳特定值: `offer(e)`, `poll()`, `peek()`

Queue通常是先進先出(FIFO, first-in-first-out) )的資料結構，但也有例外，例如優先權隊列(Priority Queue)
可能會根據元素的屬性或不同的比較方式來決定取出的順序。無論何種排序，呼叫 `remove()` 或 `poll()` 會從隊列的頭部(head)取出元素；
在FIFO隊列呼叫 `add()` 或 `offer()` 會從隊列的尾端(tail)插入新的元素。

`offer()` 和 `add()` 都是從隊列尾部插入新元素。如果插入失敗（例如隊列空間滿了）`offer()` 回傳false， `add()` 拋出例外。

`poll()` 和 `remove()` 都是從隊列頭部取出並移除元素。如果取出失敗（例如隊列是空的）`poll()` 回傳null， `remove()` 拋出例外。

`peek()` 和 `element()` 都是從隊列頭部取出但不移除元素。如果取出失敗（例如隊列是空的）`peek()` 回傳null， `element()` 拋出例外。

Queue一般不允許插入null，即使某些實作可以插入 null，但因 null 做為 `poll()` 及 `peek()` 找不到原素的反回值，null不該被插入隊列中。

Java LinkedList實作了Queue介面，所以可以做為Queue的實例如下。

```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {

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
```

List 與 Queue 都是有順序的集合，差別在於 List 能從任一位置插入或取出元素，而 Queue 只允許從頭部取出元素，從尾部插入元素。