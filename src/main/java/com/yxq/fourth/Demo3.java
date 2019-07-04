package com.yxq.fourth;

public class Demo3 {
    public static void main(String[] args) {
        Abb[] arr = new Abb[3];
        arr[0] = new Abb("a", 0);
        arr[1] = new Abb("b", 1);
        arr[2] = new Abb("a", 2);
        for (Abb ele : arr) {
            System.out.println(ele.getString() + " " + ele.getInt());
        }

    }

}

class Abb {
    private String s;
    private int n;

    public Abb(String s, int n) {
        this.s = s;
        this.n = n;
    }

    public String getString() {
        return s;
    }

    public int getInt() {
        return n;
    }

    public static void main() {
        Abb a = new Abb("abb", 3);
        System.out.println(a.getString() + " " + a.getInt());
    }
}