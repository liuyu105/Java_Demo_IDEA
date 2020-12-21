package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

    //给定两个数组，编写一个函数来计算它们的交集。
    public class Leetcode350 {
        public static void main(String[] args) {
            int[] nums1 = {1, 2, 2, 1};
            int[] nums2 = {2};
            int[] result = Leetcode350.intersect2(nums1, nums2);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }

        public static int[] intersect(int[] nums1, int[] nums2) {
            //方法一：哈希表
            //先比较nums1与nums2的数组大小，将较小的作为参照对象，减少空间复杂度
            if (nums1.length > nums2.length) {
                return intersect(nums2, nums1);
            }
            //建立哈希映射，将元素与次数进行对应
            Map<Integer, Integer> map = new HashMap<>();
            //遍历较短的数组，统计每个元素出现的次数
            for (int num : nums1) {
                //刚开始键值对为null,count记录每个元素出现的次数
                //getOrDefault:如果get(num)为空，则返回defaultValue，否则返回get(num)
                int count = map.getOrDefault(num, 0) + 1;
                map.put(num, count);
            }
            int[] result = new int[nums1.length]; //定义结果数组
            int index = 0; //结果数组索引
            //遍历较长的数组，进行比较
            for (int num : nums2) {
                //取较长数组的元素个数
                int count = map.getOrDefault(num, 0);
                //判断count是否大于0
                if (count > 0) {
                    result[index++] = num;
                    count--;
                    if (count > 0) {
                        map.put(num, count);
                    } else {
                        map.remove(num);
                    }
                }
            }
            return Arrays.copyOfRange(result, 0, index);
        }

        public static int[] intersect2(int[] nums1, int[] nums2) {
            //方法二：排序
            //先比较nums1与nums2的数组大小，将较小的作为参照对象，减少空间复杂度
            if (nums1.length > nums2.length) {
                return intersect2(nums2, nums1);
            }
            //排序
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            //定义结果数组及索引
            int[] result = new int[nums1.length];
            int index = 0;
            //核心功能：双指针定位比较
            for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
                if (nums1[i] < nums2[j]) {
                    i++;
                } else if (nums1[i] == nums2[j]) {
                    result[index++] = nums1[i];
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            return Arrays.copyOfRange(result, 0, index);

        }
    }