package com.yxq.eighth;


import java.util.HashMap;
import java.util.Map;

import javafx.util.Pair;

public class Demo2 {

  public static void main(String[] args) {
 Integer[] arr={3,24,3,5,0};

 System.out.println( minmax(arr));

  }
  public static <T extends Comparable> Map<T,T> /*Pair<T>*/minmax( T[] arr){
   if(arr==null||arr.length==0)return null;
   T min=arr[0];
   T max=arr[0];
   for(int i=1;i<arr.length;i++)
   {
     if(arr[i].compareTo(min)<0) min=arr[i];
     if(arr[i].compareTo(max)>0) max=arr[i];
   }
   Map<T,T> map=new HashMap<T, T>() ;
   map.put(min,max);
   return map;


  }
}
