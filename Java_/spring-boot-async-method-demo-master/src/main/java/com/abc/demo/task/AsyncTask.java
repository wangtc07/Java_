package com.abc.demo.task;

import java.util.concurrent.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

@Service
public class AsyncTask {

  /**
   * 異步無返回值
   */
  @Async
  public void asyncMethodWithVoidReturnType() {
    System.out.println("Execute method asynchronously. "
        + Thread.currentThread().getName());
  }

  /**
   * 同步有返回值
   * @return string
   */
  @Async
  public Future<String> asyncMethodWithReturnType() {
    System.out.println("Execute method asynchronously - "
        + Thread.currentThread().getName());
    try {
      Thread.sleep(5000);
      return new AsyncResult<String>("hello world !!!!");
    } catch (InterruptedException e) {
      //
    }

    return null;
  }

}
