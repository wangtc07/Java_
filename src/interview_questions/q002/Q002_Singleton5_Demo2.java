package interview_questions.q002;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q002_Singleton5_Demo2 {

  // 多線程
  public static void main(String[] args) throws ExecutionException, InterruptedException {

    Callable<Q002_Singleton5> callable = new Callable<Q002_Singleton5>() {
      @Override
      public Q002_Singleton5 call() {
        return Q002_Singleton5.getInstance();
      }
    };

    // 啟動線程
    ExecutorService service = Executors.newFixedThreadPool(2);
    Future<Q002_Singleton5> submit = service.submit(callable);
    Future<Q002_Singleton5> submit1 = service.submit(callable);

    Q002_Singleton5 s1 = submit.get();
    Q002_Singleton5 s2 = submit1.get();
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1 == s2);

    service.shutdown();
  }

}
