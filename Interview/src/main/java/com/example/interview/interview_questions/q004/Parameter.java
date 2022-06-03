package com.example.interview.interview_questions.q004;

import java.util.Arrays;

public class Parameter {

  public static void main(String[] args) {
    int i = 1;
    Integer j = 1;
    int[] arr = {1, 2, 3};
    String str = "hollow";
    Data data = new Data();

    change(i, j, arr, str, data);

    System.out.println(i);  // 1
    System.out.println(j);  // 1
    System.out.println(Arrays.toString(arr)); // [2, 2, 3]
    System.out.println(str); // hollow
    System.out.println(data.data); // 2
  }

  private static void change(int i, Integer j, int[] arr, String str, Data data) {
    i += 1;
    j += 1;
    arr[0] += 1;
    str += "World";
    data.data += 1;
  }

  private static class Data {
    int data = 1;
  }
}
