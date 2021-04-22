package Leetcode.stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Leetcode20 {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

    //方法一:栈
    public static boolean isValid(String s) {
        int n = s.length();
        //奇数不符合
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                //是右括号，则判断栈中栈顶是否为 该右括号对应的左括号
                // 栈无元素或者栈顶不是，返回false。
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                // 匹配到，则将栈顶元素取出。
                stack.pop();
            } else {
                //是左括号所以入栈
                stack.push(ch);
            }
        }
        return stack.isEmpty();

    }

}
