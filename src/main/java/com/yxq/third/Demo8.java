package com.yxq.third;

import java.util.Arrays;

public class Demo8 {
    public static void main(String[] args) {
        int initRate = 10;
        int years = 10;
        int rateChange = 3;
        double balance = 100;
        double[] rates=new double[rateChange];
        for(int i=0;i<rateChange;i++){
            rates[i]=(initRate+i)/100.0;/*除以100的话得到整数*/
        }
        double[][] balances = new double[years][rateChange];
        for (int i = 0; i < rateChange; i++) {
            balances[0][i] = balance;
        }
        for (int i = 0; i < rateChange; i++) {
            for (int j = 1; j < years; j++) {
                balances[j][i]=(1+rates[i])*balances[j-1][i];
            }
        }
        System.out.println(Arrays.deepToString(balances));
    }
}
