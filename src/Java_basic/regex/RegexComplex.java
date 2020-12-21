package Java_basic.regex;

public class RegexComplex {
    public static void main(String[] args) {

        //匹配开头和结尾
        //用^表示开头，$表示结尾
        String re = "^A\\d{3}$";
        System.out.println("匹配开头和结尾");
        System.out.println("A001".matches(re));//true
        System.out.println("A01".matches(re)); //false
        System.out.println("AB001".matches(re)); //false

        //匹配指定范围
        //使用[...]可以匹配范围内的字符
        System.out.println("匹配指定范围");
        String re1 = "[0-9a-fA-F]{6}";//匹配6位大小写不限的十六进制数
        String re2 = "[^1-9]{3}";//不包含指定范围的字符
        System.out.println("ABC".matches(re2)); //true
        System.out.println("AB1".matches(re2)); //false

        //或规则匹配
        //用|连接的两个正则规则是或规则
        System.out.println("或规则匹配");
        String re3 = "java|php";
        System.out.println("java".matches(re3));
        System.out.println("php".matches(re3));
        System.out.println("go".matches(re3)); //false

        //使用括号把公共部分提出来
        System.out.println("使用括号");
        String re4 = "learn\\s(java|php|go)";
        System.out.println("learn java".matches(re4));
        System.out.println("learn Java".matches(re4));
        System.out.println("learn php".matches(re4));
        System.out.println("learn Go".matches(re4));

    }
}
