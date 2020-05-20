package com.vangen.sort;

/**
 * @Description:
 * @Author: Vangen
 * @Date: 2020/5/19 15:42
 * @Version: 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 35, 8, 9, 3, 809, 78, 32, 745};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // 元素比较并交换
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


}
