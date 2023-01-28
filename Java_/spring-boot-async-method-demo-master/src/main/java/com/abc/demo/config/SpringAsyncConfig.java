package com.abc.demo.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.scheduling.annotation.AsyncConfigurer;

public class SpringAsyncConfig implements AsyncConfigurer {

  /**
   * @return 返回我們自定義的異步異常處理程序
   */
  @Override
  public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
    return new CustomAsyncExceptionHandler();
  }
}
