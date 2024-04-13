package org.muxun.algorithm.leetcode.competition.week.week.threehundredeightyeight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyeight.LeetCode100233;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024-03-10
 */
@DisplayName("重新分装苹果测试用例")
public class LeetCode100233Test {

    @Test
    public void testOne() {
        int[] apple = {1, 3, 2};
        int[] capacity = {4, 3, 1, 5, 2};
        int expected = 2;
        int res = new LeetCode100233().minimumBoxes(apple, capacity);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] apple = {5, 5, 5};
        int[] capacity = {2, 4, 2, 7};
        int expected = 4;
        int res = new LeetCode100233().minimumBoxes(apple, capacity);
        Assertions.assertEquals(expected, res);
    }
}
