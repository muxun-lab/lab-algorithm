package org.muxun.algorithm.leetcode.java.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024-03-08
 */
@DisplayName("找出美丽数组的最小和测试用例")
public class LeetCode2834Test {

    @Test
    public void testOne() {
        int n = 2;
        int target = 3;
        int expected = 4;
        int res = new LeetCode2834().minimumPossibleSum(n, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int n = 3;
        int target = 3;
        int expected = 8;
        int res = new LeetCode2834().minimumPossibleSum(n, target);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        int n = 1;
        int target = 1;
        int expected = 1;
        int res = new LeetCode2834().minimumPossibleSum(n, target);
        Assertions.assertEquals(expected, res);
    }
}
