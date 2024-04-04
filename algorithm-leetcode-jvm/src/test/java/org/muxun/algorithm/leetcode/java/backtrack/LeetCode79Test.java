package org.muxun.algorithm.leetcode.java.backtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/1
 */
@DisplayName("单词搜索测试用例")
public class LeetCode79Test {

    @Test
    public void testOne() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean expected = true;
        boolean res = new LeetCode79().exist(board, word);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        boolean expected = true;
        boolean res = new LeetCode79().exist(board, word);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        boolean expected = false;
        boolean res = new LeetCode79().exist(board, word);
        Assertions.assertEquals(expected, res);
    }
}
