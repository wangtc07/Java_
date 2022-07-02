package Collection_01;

import java.util.LinkedList;
import java.util.Queue;
interface Request {
    void execute();
}
public class Col_01_Queue {
	public static void main(String[] args) {
        Queue<Integer> requests = new LinkedList<>();
//        offerRequestTo(requests);
//        process(requests);
        for (int i = 6; i < 11; i++) {
            requests.add(i);
        }
        
        for (int i = 1; i < 6; i++) {
            requests.offer(i);
        }
        
        System.out.println(requests);
    }

    static  void offerRequestTo(Queue<Integer> requests) {
        // 模擬將請求加入佇列
        for (int i = 1; i < 6; i++) {
            requests.offer(i);
        }
    }
    // 處理佇列中的請求
    static void process(Queue<Integer> requests) {
        while(requests.peek() != null) {
            Integer request = requests.poll();
            System.out.println(request);
        }
    }
}
