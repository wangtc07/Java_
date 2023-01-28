package com.abc.demo.config;

import java.lang.reflect.Method;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

public class CustomAsyncExceptionHandler implements
    AsyncUncaughtExceptionHandler {

  @Override
  public void handleUncaughtException(Throwable throwable, Method method,
      Object... objects) {
    System.out.println("Exception message - " + throwable.getMessage());
    System.out.println("Method name - " + method.getName());
    for (Object param : objects) {
      System.out.println("Parameter value - " + param);
    }
  }
}
