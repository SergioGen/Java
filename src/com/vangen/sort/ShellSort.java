package com.vangen.sort;

/**
 * @Description:
 * @Author: Vangen
 * @Date: 2020/5/20 22:51
 * @Version: 1.0
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {2, 35, 8, 9, 3, 809, 78, 32, 745};
        shellSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    static void shellSort(int[] arr) {
        for (int gap= (int) Math.floor(arr.length / 2); gap > 0; gap = (int) Math.floor(gap / 2)) {
            for (int j = gap; j < arr.length; j++) {
                int k = j;
                int current = arr[j];
                while (k - gap >= 0 && current < arr[k - gap]) {
                    arr[k] = arr[k - gap];
                    k = k- gap;
                }
                arr[k]=current;
            }
        }
    }

}
