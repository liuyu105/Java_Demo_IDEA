package Leetcode.string;

public class Leetcode14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(Leetcode14_LongestCommonPrefix.longestCommonPrefix1(strs));
    }


    //方法一：横向扫描：将每两个字符串进行比较后，再将公共部分与第三个比较
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            result = CommonPrefix(result, strs[i]);
        }
        return result;
    }

    //两个字符串的公共前缀
    public static String CommonPrefix(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) {
            return "";
        }
        //最小公共前缀长度
        int len = Math.min(str1.length(), str2.length());
        //最小公共前缀
        String result;
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.substring(0, i);
                return result;
            }
        }
        return str1.substring(0, len);
    }

    //方法二：纵向扫描：将每个字符串第一列进行比较后，再将第二列进行比较，依次类推
    public static String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int len = strs[0].length();
        int count = strs.length;
        //行
        for (int i = 0; i < len; i++) {
            //列
            char ch = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (strs[j].charAt(i) != ch || i == strs[j].length()) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

}
