package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode36_ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {
                '6', '.', '.', '1', '9', '5', '.', '.', '.'}, {
                '.', '9', '8', '.', '.', '.', '.', '6', '.'}, {
                '8', '.', '.', '.', '6', '.', '.', '.', '3'}, {
                '4', '.', '.', '8', '.', '3', '.', '.', '1'}, {
                '7', '.', '.', '.', '2', '.', '.', '.', '6'}, {
                '.', '6', '.', '.', '.', '.', '2', '8', '.'}, {
                '.', '.', '.', '4', '1', '9', '.', '.', '5'}, {
                '.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(Leetcode36_ValidSudoku.isValidSudoku(board));
    }

    //方法:哈希表
    public static boolean isValidSudoku(char[][] board) {
        //定义行、列、块的哈希表，存储元素与次数之间的映射
        Map<Integer, Integer>[] rows = new HashMap[9];
        Map<Integer, Integer>[] cols = new HashMap[9];
        Map<Integer, Integer>[] boxes = new HashMap[9];
        //初始化元素为0
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            cols[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }

        //一次遍历
        for (int i = 0; i < rows.length; i++)
            for (int j = 0; j < cols.length; j++) {
                //如果不是空格
                if (board[i][j] != '.') {
                    //将字符转为int型
                    int n = (int) board[i][j];
                    //box_index的求法是核心！！
                    int box_index = (i / 3) * 3 + j / 3;

                    //对每部分出现的数值的次数进行统计
                    //getOrDefault：如果Map集合中有这个key时，就使用这个key值，没有就使用默认值defaultValue
                    rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                    cols[j].put(n, cols[j].getOrDefault(n, 0) + 1);
                    boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);

                    //统计过程中便可以进行判断
                    if (rows[i].get(n) > 1 || cols[j].get(n) > 1 || boxes[box_index].get(n) > 1) {
                        return false;
                    }
                }
            }
        return true;
    }
}