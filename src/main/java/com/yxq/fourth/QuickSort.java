package com.yxq.fourth;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    int[] arr = {4, 5, 6, 0, 3, 2};
    Sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  public static void Sort(int[] arr, int low, int high) {
    if(arr==null||low>=high)return;
    int standard = Quick(arr, low, high);
    Sort(arr, low, standard - 1);
    Sort(arr, standard + 1, high);
  }

  public static int Quick(int[] arr, int low, int high) {
    int small = low - 1;
    for ( ; low< high; low++) {
      if (arr[low] < arr[high]) {
        if (++small != low) {
          arr[low] = arr[low] ^ arr[small];
          arr[small] = arr[small] ^ arr[low];
          arr[low] = arr[low] ^ arr[small];
        }
      }

    }
    if (++small != high) {
      arr[high] = arr[high] ^ arr[small];
      arr[small] = arr[small] ^ arr[high];
      arr[high] = arr[high] ^ arr[small];
    }
    return small;
  }
}
