package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-09
 */
@DisplayName("数组中的第K个最大元素测试类")
public class LeetCode215Test {

    @Test
    public void firstKthLargestTestOne() {
        Assertions.assertEquals(5, new LeetCode215().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void firstKthLargestTestTwo() {
        Assertions.assertEquals(4, new LeetCode215().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
