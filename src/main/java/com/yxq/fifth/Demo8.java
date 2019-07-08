package com.yxq.fifth;

public class Demo8 {

  public static void main(String[] args) {
    Demo6 a = new Demo6("a", 3.234);
    Demo6 b = new Demo6("a", 3.234);
    Demo6 c = a;
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
    System.out.println(b.equals(c));
    System.out.println(b.toString());
    System.out.println(a.hashCode());
    String stra = new String("aaa");
    String strb = new String("aaa");
    System.out.println(stra.equals(strb));
  }
}
