package com.yxq.third;

import java.util.Scanner;

public class InputTest {
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    System.out.println("name?");
    String name=in.nextLine();
    System.out.println("age?");
    int age=in.nextInt();
    System.out.println("Hello,"+name+",next year,you will "+age+1);/*不加括号认为是字符串,Hello,yuanxueqi,next year,you will 181*/
    System.out.println("Hello,"+name+",next year,you will "+(age+1));    /*Hello,yuanxueqi,next year,you will 19*/
    }
}
