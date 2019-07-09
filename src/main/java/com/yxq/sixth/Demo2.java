package com.yxq.sixth;

public class Demo2 implements Comparable<Demo2> {

  private double sal;

  Demo2(double sal) {this.sal = sal;}

  public int compareTo(Demo2 de2) {
    return Double.compare(sal, de2.getSal());
  }

  public double getSal() {
    return this.sal;
  }
}
