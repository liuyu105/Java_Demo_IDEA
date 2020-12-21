package Java_basic.regex;

public class RegexDemo {
    public static void main(String[] args) {
        // \d表示任意一个数字
        String regex = "20\\d\\d";
        System.out.println("2019".matches(regex)); // true
        System.out.println("2100".matches(regex)); //false

        //精准匹配
        System.out.println("精准匹配：");
        String re1 = "abc";
        System.out.println("abc".matches(re1));
        System.out.println("Abc".matches(re1));
        System.out.println("abcd".matches(re1));

        String re2 = "a\\&c"; // 对应的正则是a\&c
        System.out.println("a&c".matches(re2)); //true
        System.out.println("a-c".matches(re2));
        System.out.println("a&&c".matches(re2));

        //匹配任意字符
        System.out.println("匹配任意字符：");
        String re3 = "a.c";
        System.out.println("abc".matches(re3)); //true
        System.out.println("a&c".matches(re3)); //true
        System.out.println("ac".matches(re3)); //false
        System.out.println("abcc".matches(re3)); //false

        //匹配数字
        System.out.println("匹配数字：");
        String re4 = "00\\d";
        System.out.println("005".matches(re4));//true
        System.out.println("00A".matches(re4));//false
        System.out.println("0088".matches(re4));//false

        //匹配常用字符
        //用\w可以匹配一个字母、数字或下划线，w的意思是word。
        System.out.println("匹配常用字符:");
        String re5 = "java\\w";
        System.out.println("javac".matches(re5));//true
        System.out.println("java9".matches(re5));//true
        System.out.println("java_".matches(re5));//true
        System.out.println("java#".matches(re5));//false
        System.out.println("java ".matches(re5));//false

        //匹配空格字符
        System.out.println("匹配空格字符");
        String re6 = "a\\sc";
        System.out.println("a c".matches(re6)); //true
        System.out.println("a\tc".matches(re6)); //true
        System.out.println("a  c".matches(re6)); //false,两个空格
        System.out.println("abc".matches(re6)); //false

        //匹配非数字
        // \D匹配一个非数字
        System.out.println("匹配非数字");
        String re7 = "00\\D";
        System.out.println("00A".matches(re7));//true
        System.out.println("00&".matches(re7));//true

        //重复匹配
        System.out.println("重复匹配");
        //修饰符*可以匹配任意字符，包括0个字符
        String re8 = "A\\d*";
        System.out.println("重复匹配：*");
        System.out.println("A0".matches(re8)); //true
        System.out.println("A01".matches(re8)); //true
        System.out.println("A001".matches(re8)); //true
        //修饰符+可以匹配至少一个字符
        String re9 = "A\\d+";
        System.out.println("重复匹配：+");
        System.out.println("A".matches(re9)); //false
        System.out.println("A0".matches(re9)); //true
        System.out.println("A01".matches(re9)); //true
        //修饰符？可以匹配0或一个字符
        String re10 = "A\\d?";
        System.out.println("重复匹配：?");
        System.out.println("A".matches(re10)); //true
        System.out.println("A0".matches(re10)); //true
        System.out.println("A01".matches(re10)); //false
        //修饰符{n}可以精确指定n个字符
        String re11 = "A\\d{3}";
        System.out.println("重复匹配：{n}");
        System.out.println("A".matches(re11)); //false
        System.out.println("A123".matches(re11)); //true
        //修饰符{n,m}可以指定匹配n~m个字符
        String re12 = "A\\d{3,5}";
        System.out.println("重复匹配：{n,m}");
        System.out.println("A123".matches(re12)); //true
        System.out.println("A1235".matches(re12)); //true
        System.out.println("A12345".matches(re12)); //true
        //修饰符{n,}就可以匹配至少n个字符
        String re13="A\\d{1,}";
        System.out.println("重复匹配：{n,}");
        System.out.println("A".matches(re13)); //false
        System.out.println("A1".matches(re13)); //true
    }

    //判断手机号是否为11位
    public static boolean isValidMobileNumber(String s) {
        return s.matches("\\d{11}");
    }
}
