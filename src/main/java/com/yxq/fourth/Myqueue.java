package com.yxq.fourth;

public class Myqueue<T> {

  private int maxsize = 0;
  int currentsize = 0;
  private Node<T> head = null;
  private Node<T> rear = null;

  Myqueue() {}

  Myqueue(int maxsize) {this.maxsize = maxsize;}

  public void push(T val) {
    if (this.size() == maxsize && maxsize != 0) {
      return;
    }

    Node<T> node = new Node<T>(val);
    if (head ==null&&rear==null) {
      head = rear = node;
    } else {
      rear.next = node;
      rear = node;
    }
    currentsize++;
  }

  public T pop() throws Exception {
    if (isNull()) {
      throw new Exception("it is null");
    }
    T val = head.getData();

    head = head.next;
    currentsize--;
    return val;

  }

  public int size() {
    return currentsize;
  }

  public boolean isNull() {
    if (currentsize == 0) {
      return true;
    }
    return false;
  }



}

class Node<T> {

  private T val;
  public Node<T> next = null;

  Node(T val) {this.val = val;}

  public T getData() {
    return val;

  }

  public void setData(T val) {
    this.val = val;
  }
}