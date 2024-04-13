package org.muxun.algorithm.leetcode.competition.week.week.threehundredninety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredninety.LeetCode100228;

/**
 * @author 慕勋
 * @created 2024-03-24
 */
@DisplayName("执行操作使数据元素之和大于等于 K测试用例")
public class LeetCode100228Test {

    @Test
    public void testOne() {
        int k = 11;
        int expected = 5;
        int res = new LeetCode100228().minOperations(k);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int k = 1;
        int expected = 0;
        int res = new LeetCode100228().minOperations(k);
        Assertions.assertEquals(expected, res);
    }
}
