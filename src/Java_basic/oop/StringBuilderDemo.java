package Java_basic.oop;

import java.util.StringJoiner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        //StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());

        String s = String.join(",", names);
        System.out.println("2:"+s);
        //StringJoiner
        StringJoiner sj = new StringJoiner(", ");

        //指定开头结尾
        StringJoiner sj1 = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj1.add(name);
        }
        System.out.println(sj1.toString());


    }
}
