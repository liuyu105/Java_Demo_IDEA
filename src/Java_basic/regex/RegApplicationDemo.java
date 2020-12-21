package Java_basic.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegApplicationDemo {
    public static void main(String[] args) {
        //分割字符串
        System.out.println("分割字符串");
        String[] a = "a b c".split("\\s"); // { "a", "b", "c" }
        System.out.println(Arrays.toString(a));
        String[] b = "a b  c".split("\\s");// { "a", "b", "", "c" }
        System.out.println(Arrays.toString(b));
        String[] c = "a, b ;; c".split("[\\,\\;\\s]+"); // { "a", "b", "c" }
        System.out.println(Arrays.toString(c));

        //搜索字符串
        System.out.println("搜索字符串");
        String s = "the quick brown fox jumps over the lazy dog.";
        //中间必须是o，前后两个必须是字符[A-Za-z0-9_]。
        Pattern p = Pattern.compile("\\wo\\w");
        Matcher m = p.matcher(s);
        while (m.find()) {
            String sub = s.substring(m.start(), m.end());
            System.out.println(sub);
        }

        //替换字符串
        System.out.println("替换字符串");
        String s1 = "The     quick\t\t brown   fox  jumps   over the  lazy dog.";
        System.out.println(s1);
        String r = s1.replaceAll("\\s+", " ");
        System.out.println(r); // "The quick brown fox jumps over the lazy dog."

        //反向引用
        System.out.println("反向引用");
        String s2 = "the quick brown fox jumps over the lazy dog.";
        String r2 = s2.replaceAll("\\s([a-z]{4})\\s", " <b>$1</b> ");
        System.out.println(r2);
    }
}
