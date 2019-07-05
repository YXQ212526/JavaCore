package com.yxq.fifth;

public class Demo6 extends Demo5 {
    private double sal;
    public Demo6(String name,double sal){
       super(name);
        this.sal=sal;
    }
    public double getSal(){
        return this.sal;
    }
    public String getDes(){
        return String.format("an empolee with a salary of $%.2f",sal);
    }
    public boolean equals(Object other)
    {
        if(!super.equals(other))return false;
        Demo6 change=(Demo6)other;
         return change.sal==sal;
    }
    public  String toString(){
        return getClass().getName()+""+super.toString()+sal;
    }
    public int hashCode(){
        return super.hashCode()+3*new Double(sal).hashCode();
    }
}
