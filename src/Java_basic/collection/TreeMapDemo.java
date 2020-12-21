package Java_basic.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //TreeMap保证遍历时以Key的顺序来进行排序
        Map<String, Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        //放入的Key必须实现Comparable接口。
        Map<Person, Integer> map1 = new TreeMap<>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        map1.put(new Person("Tom"), 1);
        map1.put(new Person("Bob"), 2);
        map1.put(new Person("Lily"), 3);
        for (Person key : map1.keySet()) {
            System.out.println(key);
        }
        // {Person: Bob}, {Person: Lily}, {Person: Tom}
        System.out.println(map1.get(new Person("Bob"))); // 2
    }
}
