package Leetcode.string;

import java.util.Arrays;

public class Leetcode344_ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        Leetcode344_ReverseString.reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    //双指针
    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = temp;
        }
    }
}
