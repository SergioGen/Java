package com.vangen.sort;

/**
 * @Description:
 * @Author: Vangen
 * @Date: 2020/5/19 16:28
 * @Version: 1.0
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {2, 35, 8, 9, 3, 809, 78, 32, 745};
        selectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void selectSort(int[] arr){
        int minIndex,temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[minIndex]){
                    //寻找最小数，并保存其索引
                    minIndex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

        }
    }

}
