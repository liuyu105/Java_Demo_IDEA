package Java_basic.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Person p = new Person("liu", 22);
        Map<String, Person> map = new HashMap<>();
        map.put("liu", p);//将“liu”和Person实例映射并关联
        Person target = map.get("liu"); //通过key查找并返回映射的Person实例
        System.out.println(target == p); //true，同一个实例
        System.out.println(target.age); //22
        Person another = map.get("Bob");
        System.out.println(another); //未找到，返回null
        System.out.println(map.containsKey("liu")); //查询是否包含某个key

        //遍历Map
        //1）使用for each循环遍历Map实例的keySet()方法返回的Set集合，它包含不重复的key的集合
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 123);
        map1.put("pear", 456);
        map1.put("banana", 789);
        for (String key : map1.keySet()) {
            Integer value = map1.get(key);
            System.out.println(key + "=" + value);
        }
        //2)同时遍历key和value可以使用for each循环遍历Map对象的entrySet()集合，它包含每一个key-value映射
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
