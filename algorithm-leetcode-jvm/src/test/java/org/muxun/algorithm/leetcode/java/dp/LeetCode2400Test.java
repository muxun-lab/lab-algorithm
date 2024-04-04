package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2024/2/8
 */
@DisplayName("恰好移动 k 步到达某一位置的方法数目测试用例")
public class LeetCode2400Test {

    @Test
    public void testOne() {
        int startPos = 1;
        int endPos = 2;
        int k = 3;
        int res = new LeetCode2400().numberOfWays(startPos, endPos, k);
        int expected = 3;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int startPos = 2;
        int endPos = 5;
        int k = 10;
        int res = new LeetCode2400().numberOfWays(startPos, endPos, k);
        int expected = 0;
        Assertions.assertEquals(expected, res);
    }
}
