package datastructure.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 7, 8, 1, 2, 0, 4, 7, 4, 3, 8};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //希尔排序
    public static void shellSort(int[] arr) {
        //遍历所有的步长/增量
        for (int d = arr.length / 2; d > 0; d /= 2) {
            //遍历所有的元素
            for (int i=d ;i<arr.length;i++){
                //遍历每一组中所有的元素(最开始是第一个元素)
                for (int j=i-d;j>=0;j-=d){
                   //如果当前元素大于加上步长后的元素
                    if (arr[j]>arr[j+d]){
                        int temp=arr[j];
                        arr[j]=arr[j+d];
                        arr[j+d]=temp;
                    }
                }

            }
        }
    }
}
