package com.yxq.third;

import java.util.Arrays;

public class Demo9 {
    public static void main(String[] args) {
        int row = 5;
        int[][] unreg = new int[row][];
        for (int i = 0; i < row; i++) {
            unreg[i] = new int[i + 1];
        }
        for (int i = 0; i < row; i++) {
            for(int j=0;j<unreg[i].length;j++)
            unreg[i][j] = 1;
        }
        for (int i = 1; i < unreg.length; i++) {
            for (int j = 1; j < unreg[i].length; j++) {
                for (int k = 1; k <= j; k++) {

                    unreg[i][j] = unreg[i][j]*(i - k + 1) / (k);
                }

            }
        }
        System.out.println(Arrays.deepToString(unreg));
        for (int[] ele : unreg) {
            for (int val : ele) {
                System.out.println(val);
            }
        }
    }
}
