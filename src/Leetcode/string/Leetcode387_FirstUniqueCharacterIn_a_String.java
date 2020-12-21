package Leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class Leetcode387_FirstUniqueCharacterIn_a_String {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(Leetcode387_FirstUniqueCharacterIn_a_String.firstUniqChar(s));
        //System.out.println(s.length()); //8
    }

    public static int firstUniqChar(String s) {
        int len = s.length();

        Map<Character, Integer> map = new HashMap<>();

        //构建每个字符与出现次数的哈希映射
        for (int i = 0; i < len; i++) {
            // int count = map.get(s.charAt(i));
            //当Map集合中有这个key时，就使用这个key对应的value值，如果没有就使用默认值defaultValue
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        //遍历找第一个不重复的索引
        for (int i = 0; i < len; i++) {
            int count = map.get(s.charAt(i));
            if (count == 1) {
                return i;
            }
        }
        return -1;

    }
}
