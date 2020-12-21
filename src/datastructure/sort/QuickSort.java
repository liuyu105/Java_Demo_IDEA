package datastructure.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 6, 7, 2, 7, 2, 8, 0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *快速排序是对冒泡排序的一种改进，把整个序列分为左部、基准值(枢轴)和右部。
     *
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            //把数组中的第0个数字作为标准数
            int standard = arr[start];
            //记录需要排序的下标
            int low = start;
            int high = end;
            //循环找比标准数大的数和小的数
            while (low < high) {
                //右边的数字比标准数大，则下标向左移
                while (low < high && standard <= arr[high]) {
                    high--;
                }
                //使用右边的数替换左边的数
                arr[low] = arr[high];
                //如果左边的数字比标准数小，则下标右移
                while (low < high && arr[low] <= standard) {
                    low++;
                }
                //使用左边的数替换右边的数
                arr[high] = arr[low];
            }
            //把标准数赋给低所在的位置元素,此时low跟high已重合
            arr[low] = standard;

            //处理所有比标准数小的数字
            quickSort(arr, start, low);
            //处理所有比标准数大的数字
            quickSort(arr, low + 1, end);
        }


    }
}
