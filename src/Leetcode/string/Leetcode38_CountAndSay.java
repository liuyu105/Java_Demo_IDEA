package Leetcode.string;

public class Leetcode38_CountAndSay {
    public static void main(String[] args) {
        System.out.println(Leetcode38_CountAndSay.countAndSay(3));
    }


    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        int count = 1;
        String pre = countAndSay(n - 1); //// 使用递归来一层一层往前推
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pre.length(); i++) {
            if (i < pre.length() - 1 && pre.charAt(i) == pre.charAt(i + 1)) {
                count++; // 比如previous是111221时，111部分会让count=3，此时i在第三个1处
            } else {
                result.append(count).append(pre.charAt(i));
                count = 1;
            }
        }
        return result.toString();
    }
}
