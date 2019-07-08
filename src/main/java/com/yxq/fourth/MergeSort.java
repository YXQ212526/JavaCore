package com.yxq.fourth;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = {32, 4, 2, 8, 9};
    Sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  public static void Sort(int[] arr, int low, int high) {
    if (arr == null || low >= high) {
      return;
    }
    int mid = low + (high - low) / 2;
    Sort(arr, low, mid);
    Sort(arr, mid + 1, high);
    merge(arr, low, high);
    return;

  }

  public static void merge(int[] arr, int low, int high) {
    int begin1 = low;
    int end1 = low + (high - low) / 2;
    int begin2 = end1 + 1;
    int end2 = high;
    int i = 0;
    int[] temp = new int[high - low + 1];
    while (begin1 <= end1 && begin2 <= end2) {
      if (arr[begin1] < arr[begin2]) {
        temp[i] = arr[begin1];
        begin1++;
        i++;
      } else {
        temp[i] = arr[begin2];
        begin2++;
        i++;
      }
    }
    while (begin1 <= end1) {
      temp[i] = arr[begin1];
      begin1++;
      i++;

    }
    while (begin2 <=end2) {

      temp[i] = arr[begin2];
      begin2++;
      i++;
    }
    for (i = 0; i < high - low + 1; i++) {
      arr[i+ low] = temp[i];
    }
  }
}
