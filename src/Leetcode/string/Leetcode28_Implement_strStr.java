package Leetcode.string;

public class Leetcode28_Implement_strStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(Leetcode28_Implement_strStr.strStr2(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        return haystack.indexOf(needle);

    }

    //子串逐一比较:滑动窗口
    public static int strStr1(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        for (int i = 0; i < len1 - len2 + 1; i++) {
            if (haystack.substring(i, len2 + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    //双指针
    public static int strStr2(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if (len2 == 0) {
            return 0;
        }
        int pn = 0;
        //移动pn指针，直到pn所指向位置的字符与needle字符串第一个字符相等。
        while (pn < len1 - len2 + 1) {
            //只有子串的第一个字符跟 needle 字符串第一个字符相同的时候才需要比较
            while (pn < len1 - len2 + 1 && haystack.charAt(pn) != needle.charAt(0)) {
                pn++;
            }

            //寻找匹配字串
            int currLen = 0, pL = 0;
            while (pn < len1 && pL < len2 && haystack.charAt(pn) == needle.charAt(pL)) {
                pn++;
                pL++;
                currLen++;
            }

            //如果找到了，返回索引
            if (currLen == len2) {
                return pn - len2;
            }
            //否则，回溯
            pn = pn - currLen + 1;
        }
        return -1;
    }

}
