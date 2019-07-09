package com.yxq.sixth;

import java.util.Arrays;

public class Demo1 {

  public static void main(String[] args) {
    Demo2[] arr = new Demo2[3];
    arr[0] = new Demo2(43.42);
    arr[1] = new Demo2(95.3);
    arr[2] = new Demo2(8594.0);
    Arrays.sort(arr);
    for (Demo2 ele : arr) {
      System.out.println(ele.getSal());
    }
  }
}
