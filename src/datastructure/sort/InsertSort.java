package datastructure.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2, 8, 5, 9, 1, 0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 直接插入排序
     * 把n个待排序的元素看成一个有序表和一个无序表，开始时有序表中只有一个元素，无序表中有n-1个元素；
     * 排序过程即每次从无序表中取出第一个元素，将它插入到有序表中，使之成为新的有序表，重复n-1次完成整个排序过程。
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        //遍历所有数字
        for (int i = 1; i < arr.length; i++) {
            //如果当前数字比前一个数字小
            if (arr[i] < arr[i - 1]) {
                //把当前遍历数字存起来
                int temp = arr[i];
                int j;
                //遍历当前数字前面所有的数字
                for ( j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    //把前一个数字赋给后一个数字
                    arr[j+1]=arr[j];
                }
                //把临时变量赋给不满足条件的后一个值
                arr[j+1]=temp;
            }

        }

    }
}
