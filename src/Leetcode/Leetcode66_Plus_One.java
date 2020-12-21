package Leetcode;

import java.util.Arrays;

public class Leetcode66_Plus_One {
    public static void main(String[] args) {
        int[] nums1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] result = Leetcode66_Plus_One.plusOne3(nums1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    //方法一：将数组变为数字求和后，再转为数组
    public static int[] plusOne(int[] digits) {
        //溢出，精度太低
        int len = digits.length;
        int j = 1; //乘数
        long sum = 0;
        //结果最多为len+1个数字
        int[] result = new int[len + 1];
        int index = 0;
        for (int i = len - 1; i >= 0; i--) {
            sum = sum + digits[i] * j;
            j = j * 10;
        }
        //加一后的数字
        sum = sum + 1;
        //装箱
        Long sum1 = Long.valueOf(sum);
        //转换为字符串
        String s = sum1.toString();
        for (int i = 0; i < s.length(); i++) {
            result[index++] = s.charAt(i) - '0';
        }
        return Arrays.copyOfRange(result, 0, index);
    }

    //方法二：通过引入进位，暴力比较各位大小
    public static int[] plusOne2(int[] digits) {
        int len = digits.length;
        //result数组最大为len+1位
        int[] result = new int[len + 1];
        //通过末位数字进行判断，是否需要考虑进位
        if (digits[len - 1] > 8) {
            //需要进位
            int carry = 0;//进位标志
            for (int i = len - 1; i >= 0; i--) {
                //将末位数字先加一
                digits[len - 1] += 1;
                result[i + 1] = (digits[i] + carry) % 10;
                carry = (digits[i] + carry) / 10;
            }
            //首位为最后的进位符
            result[0] = carry;
            if (result[0] > 0) {
                return Arrays.copyOfRange(result, 0, len + 1);
            } else {
                return Arrays.copyOfRange(result, 1, len + 1);
            }
        } else {
            //不需要进位
            for (int i = len - 1; i >= 0; i--)
                result[i] = digits[i];
            //将末位加1即可
            result[len - 1] += 1;
            return Arrays.copyOfRange(result, 0, len);
        }
    }

    //方法三：大神解题
    public static int[] plusOne3(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            //只要有一个digits[i]不为0，就结束程序
            if (digits[i] != 0) return digits;
        }
        //前面的for循环digits[i]都为0，便是999...这种情况
        //新建len+1的数组，让第一位置为1，其它位默认均为0
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
