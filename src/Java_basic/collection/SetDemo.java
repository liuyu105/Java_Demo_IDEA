package Java_basic.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        System.out.println(set.add("abc"));
        System.out.println(set.add("abc"));
        System.out.println(set.add("xyz"));
        System.out.println(set.contains("xyz"));
        System.out.println(set.remove("xyz"));
        System.out.println(set.size());
    }
}
