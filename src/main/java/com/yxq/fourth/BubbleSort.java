package com.yxq.fourth;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[]src){
        for(int i=0;i<src.length;i++){
            for(int j=1;j<src.length-i;j++){
                int k=j-1;
                if(src[j]<src[k])
                {
                    int temp=src[k];
                    src[k]=src[j];
                    src[j]=temp;

                }

            }
        }

        return src;
    }
    public static void main(String[]args){
        int[] src={3,10,8,6,0};
        sort(src);
        System.out.println(Arrays.toString(src));

    }
}
