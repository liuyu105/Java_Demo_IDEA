package Leetcode.string;

public class Leetcode125_ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(Leetcode125_ValidPalindrome.isPalindrome2(s));
    }

    //题主方法：双指针
    public static boolean isPalindrome(String s) {
        if (s.equals("")) {
            return true;
        }
        int len = s.length();
        for (int i = 0, j = len - 1; i < j; ) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z' || s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= '0' && s.charAt(j) <= '9') {
                    //关键部分
                    if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                        return false;
                    }
                    i++;
                    j--;
                } else {
                    //i符合，j不符合
                    j--;
                }
            } else {
                //i不符合
                i++;
            }

        }
        return true;
    }

    //正则表达式
    public static boolean isPalindrome2(String s) {
        //正则表达式，^代表非
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            char ch = str.charAt(i);
            if (Character.toLowerCase(ch) != Character.toLowerCase(str.charAt(len - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
