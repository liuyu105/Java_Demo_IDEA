package Java_basic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonGreedyMatch {
    public static void main(String[] args) {
        //正则表达式默认是贪婪匹配，使用?可以变为非贪婪匹配
        Pattern pattern = Pattern.compile("(\\d+)(0*)");
        Matcher matcher = pattern.matcher("1230000");
        if (matcher.matches()) {
            System.out.println("group1=" + matcher.group(1)); // "1230000"
            System.out.println("group2=" + matcher.group(2)); // ""
        }

        //非贪婪匹配
        Pattern pattern1 = Pattern.compile("(\\d+?)(0*)");
        Matcher matcher1 = pattern1.matcher("1230000");
        if (matcher1.matches()) {
            System.out.println("group1=" + matcher1.group(1)); // "123"
            System.out.println("group2=" + matcher1.group(2)); // "0000"
        }

        Pattern pattern2 = Pattern.compile("(\\d??)(9*)");
        Matcher matcher2 = pattern2.matcher("19999");
        if (matcher2.matches()) {
            System.out.println("group1=" + matcher2.group(1)); // "1"
            System.out.println("group2=" + matcher2.group(2)); // "9999"
        }
    }
}
