package org.muxun.algorithm.leetcode.java.dp;

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
 * @created 2024/3/3
 */
@DisplayName("检查数组是否存在有效划分测试用例")
public class LeetCode2369Test {

    @Test
    public void testOne() {
        int[] nums = {4, 4, 4, 5, 6};
        boolean expected = true;
        boolean res = new LeetCode2369().validPartition(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 1, 1, 2};
        boolean expected = false;
        boolean res = new LeetCode2369().validPartition(nums);
        Assertions.assertEquals(expected, res);
    }
}
