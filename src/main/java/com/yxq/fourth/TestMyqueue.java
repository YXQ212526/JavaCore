package com.yxq.fourth;

public class TestMyqueue {

  public static void main(String[] args) {
    Integer val = 3;
    Myqueue<Integer> qu = new Myqueue<Integer>();
    qu.push(3);
    qu.push(2);
    qu.push(1);
    System.out.println(qu.size());
    System.out.println(qu.isNull());
//    try {
    System.out.println(qu.pop());
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//
//
//    }
//    try {
    System.out.println(qu.pop());
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//
//
//    }
//    try {
    System.out.println(qu.pop());
    System.out.println(qu.pop());
//    } catch (Exception e) {
//      System.out.println(e.getMessage());
//
//
//    }
    System.out.println(qu.size());
  }
}
