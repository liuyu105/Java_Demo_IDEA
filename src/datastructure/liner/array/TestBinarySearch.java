package datastructure.liner.array;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        //记录开始位置
        int begin = 0;
        //记录结束位置
        int end = arr.length - 1;
        //记录中间位置
        int mid = (begin + end) / 2;
        //记录目标位置
        int index = -1;
        //循环查找
        while (true) {
            //如果没有target元素
            if (begin >= end) {
                index = -1;
                break;
            }
            //判断中间的这个元素是否要查找的元素
            if (arr[mid] == target) {
                index = mid;
                break;
                //中间不是要查找的
            } else {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
                //取出新的中间位置
                mid = (begin + end) / 2;
            }
        }
        System.out.println("index:" + index);
    }
}
