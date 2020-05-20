package com.vangen.sort;

/**
 * @Description:
 * @Author: Vangen
 * @Date: 2020/5/19 16:37
 * @Version: 1.0
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2, 35, 8, 9, 3, 809, 78, 32, 745};
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    static void insertSort(int[] arr) {
        int preIndex, current;
        for (int i = 1; i < arr.length; i++) {
            preIndex = i - 1;
            current = arr[i];
            // 当前位置元素小于前一元素，对元素进行交换
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
    }
}
