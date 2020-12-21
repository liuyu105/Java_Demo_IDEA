package Leetcode.string;

public class Leetcode7_ReverseInteger {
    public static void main(String[] args) {
        int x = Leetcode7_ReverseInteger.reverse(-120);
        System.out.println(x);
        System.out.println(Integer.MIN_VALUE);
    }

    //正解
    public static int reverse(int x) {
        //返回的结果
        int result = 0;
        while (x != 0) {
            int m = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && m > Integer.MAX_VALUE % 10))
                return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && m < Integer.MIN_VALUE % 10))
                return 0;
            //核心算法~~
            result = result * 10 + m;
        }
        return result;
    }

    //没有考虑溢出的情况
    public static int reverse2(int x) {
        //标记x的正负型,默认正数
        boolean flag = true;
        if (x < 0) {
            flag = false;
            x = -x;
        }
        //返回的结果
        int result = 0;
        int i;
        //m数组存放绝对值逆序后的数字
        int[] m = new int[32];
        for (i = 0; x > 0; i++) {
            m[i] = x % 10;
            x = x / 10;
        }

        //将逆序绝对值数组转换为数字
        for (int j = 0; j < i; j++) {
            result += m[j] * Math.pow(10, i - j - 1);
        }

        //将数字改为最终的结果
        //x为负数
        if (flag == false) {
            result = -result;
        }
        return result;
    }
}
