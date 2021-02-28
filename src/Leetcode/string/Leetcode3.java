package Leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        //哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        //右指针初始值为-1，表示还在字符串左边界左侧
        int rk = -1, max = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                //左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                //不断移动右指针
                occ.add(s.charAt(rk + 1));
                rk++;
            }
            max = Math.max(max, rk - i + 1);
        }
        return max;
    }
}
