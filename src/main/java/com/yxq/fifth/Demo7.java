package com.yxq.fifth;

public class Demo7 extends Demo5 {
    private  String ma;
    public Demo7(String ma){
        super(ma);
        this.ma=ma;
    }
    public String getDes(){
        return "a student ma in "+ma;
    }
}
