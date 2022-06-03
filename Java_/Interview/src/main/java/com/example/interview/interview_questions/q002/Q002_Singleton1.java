package com.example.interview.interview_questions.q002;

/**
 * 餓漢式: 直接創建對象，不存在線程安全問題
 * 直接實例化餓漢式
 */
public class Q002_Singleton1 {

  public static final Q002_Singleton1 INSTANCE = new Q002_Singleton1();

  private Q002_Singleton1(){

  }
}
