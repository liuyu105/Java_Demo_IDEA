package datastructure.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 7, 8, 1, 2, 0, 4, 7, 4, 3, 8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    public static void selectSort(int[] arr) {
        //记录最小的下标
        int min;
        //遍历所有的数
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //如果最小的数和当前遍历数的下标不一致时
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }
        }
    }
}
