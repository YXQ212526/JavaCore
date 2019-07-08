package com.yxq.fifth;

import java.util.Scanner;

public class Demo12 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("input size:");
    String input = in.next();
    Size size = Enum.valueOf(Size.class, input.toUpperCase());
    System.out.println("size=" + size);
    System.out.println("str=" + size.getString());
    if(size==Size.LARGE){
      System.out.println("hhh");
    }
  }

  enum Size {
    SMALL("s"),
    MEDIUM("m"),
    LARGE("l");

    private Size(String str) {
      this.str = str;
    }

    public String getString() {
      return this.str;
    }

    private String str;
  }
}
