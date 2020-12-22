package Leetcode.string;

public class Leetcode8_StringtoInteger {
    public static void main(String[] args) {
        String s = " -0 42";
        System.out.println(Leetcode8_StringtoInteger.myAtoi(s));
    }

    public static int myAtoi(String s) {
        //不能用正则，比如"   +0 123"应返回0
        //String str = s.replaceAll("\\s", "");
        int len = s.length();
        int i = 0;//索引
        //去除前导空格，同时防止空字符串""溢出
        while (i < len && s.charAt(i) == ' ') {
            i++;
        }
        //去除空字符串
        if (s.length() == 0) {
            return 0;
        }
        //判断第一个字符为正负号
        int sign = 1; //正负标志
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        //开始遍历计算结果
        int result = 0;
        for (; i < len; i++) {
            //判断不合法的情况
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }
            //判断乘以 10 以后是否越界
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && (s.charAt(i) - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && (s.charAt(i) - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            //正常情况下
            result = result * 10 + sign * (s.charAt(i) - '0');
        }
        return result;
    }
}
