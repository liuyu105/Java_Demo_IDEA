package Leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode242_ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(Leetcode242_ValidAnagram.isAnagram2(s, t));
    }

    //方法一：排序比较
    public static boolean isAnagram(String s, String t) {
        //将字符串升序排序
        String s1 = rank(s);
        String t1 = rank(t);

        int lens = s1.length();
        int lent = t1.length();
        //return
        if (lens == lent) {
            for (int i = 0; i < lens; i++) {
                if (s1.charAt(i) != t1.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //对字符串进行排序
    public static String rank(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        //valueOf返回指定值的String实例
        return String.valueOf(array);

        //返回的仍然是字符数组
        //return Arrays.toString(array);
    }

    //方法1.1：排序比较
    public static boolean isAnagram1(String s, String t) {
        //将字符串升序排序
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        //比较字符数组的大小
        return Arrays.equals(s1, t1);
    }


    //方法二：哈希表
    public static boolean isAnagram2(String s, String t) {
        Map<Character, Integer> map_s = new HashMap<>();
        Map<Character, Integer> map_t = new HashMap<>();
        if (s.length() == t.length()) {
            //建立每个字符与出现的次数之间的映射
            for (int i = 0; i < s.length(); i++) {
                map_s.put(s.charAt(i), map_s.getOrDefault(s.charAt(i), 0) + 1);
                map_t.put(t.charAt(i), map_t.getOrDefault(t.charAt(i), 0) + 1);
            }

            //进行比较
            //哈希方法1:keySet()迭代器
//            Iterator<Character> iter1 = map_s.keySet().iterator();
//            while (iter1.hasNext()) {
//                Character s_key = (Character) iter1.next();
//                if (!map_s.get(s_key).equals(map_t.get(s_key))) {
//                    return false;
//                }
//            }
//            return true;
            //哈希方法2:keySet()，for each
//            for (Character c : map_s.keySet()) {
//                if (!map_s.get(c).equals(map_t.get(c))) {
//                    return false;
//                }
//            }
//            return true;
            //哈希方法3：entrySet()
            for (Map.Entry<Character, Integer> entry1 : map_s.entrySet()) {
                if (!entry1.getValue().equals(map_t.get(entry1.getKey()))) {
                    return false;
                }
            }
            return true;

        }
        return false;
    }

    //方法三：哈希表2
    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        //共用一个map
        Map<Character, Integer> map = new HashMap<>();
        //生成map_s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        //对字符串t与s中字符重复的，将次数进行删减
        for (int i = 0; i < t.length(); i++) {
            //t的字符
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if (map.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}
