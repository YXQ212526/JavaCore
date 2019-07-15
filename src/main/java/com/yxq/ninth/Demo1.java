package com.yxq.ninth;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo1 {

  public static void main(String[] args) {
    List<String> a = new LinkedList<String>();
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("d");
    List<String> b = new LinkedList<String>();
    b.add("e");
    b.add("f");
    b.add("g");
    b.add("h");
    ListIterator<String> itb = b.listIterator();
    //把b加到a后面
    while (itb.hasNext()) {

      a.add(itb.next());
    }
    //隔一个删除
    itb=b.listIterator();
    while (itb.hasNext()) {
      itb.next();
      if (itb.hasNext()) {
        itb.next();
        itb.remove();
      }
    }
    System.out.println(b);
    System.out.println(a);
  }


}



