package Java_basic.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupMatch {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher m = p.matcher("010-12345678");
        //匹配成功才可以提取group子串
        if (m.matches()) {
            String g = m.group(0); //提取整个字符串
            String g1 = m.group(1); //提取第一个子串
            String g2 = m.group(2); //提取第二个子串
            System.out.println(g);
            System.out.println(g1);
            System.out.println(g2);
        } else {
            System.out.println("匹配失败！");
        }
    }
}
