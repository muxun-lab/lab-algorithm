package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-01-30
 */
@DisplayName("盛水最多的容器测试用例")
public class LeetCode11Test {

    @Test
    public void maxAreaTestOne() {
        int res = new LeetCode11().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        int expected = 49;
        Assertions.assertEquals(49, res);
    }

    @Test
    public void maxAreaTestTwo() {
        int res = new LeetCode11().maxAreaByDoublePointer(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        int expected = 49;
        Assertions.assertEquals(49, res);
    }
}
