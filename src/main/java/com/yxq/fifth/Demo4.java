package com.yxq.fifth;

public class Demo4 {
    public static void main(String[] args) {
        Demo5[] demos = new Demo5[2];
        demos[0] = new Demo6("a", 34.44777894);
        demos[1] = new Demo7("b");
        for (Demo5 val : demos) {
            System.out.println(val.getDes());
        }
    }


}
