package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-17
 */
@DisplayName("LFU缓存测试用例")
public class LeetCode460Test {

    @Test
    public void testOne() {
        LeetCode460 lfuCache = new LeetCode460(2);
        lfuCache.put(1, 1);
        lfuCache.put(2, 2);
        int expected1 = 1;
        int res1 = lfuCache.get(1);
        lfuCache.put(3, 3);
        int expected2 = -1;
        int res2 = lfuCache.get(2);
        int expected3 = 3;
        int res3 = lfuCache.get(3);
        lfuCache.put(4, 4);
        int expected4 = -1;
        int res4 = lfuCache.get(1);
        int expected5 = 3;
        int res5 = lfuCache.get(3);
        int expected6 = 4;
        int res6 = lfuCache.get(4);
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
        Assertions.assertEquals(expected3, res3);
        Assertions.assertEquals(expected4, res4);
        Assertions.assertEquals(expected5, res5);
        Assertions.assertEquals(expected6, res6);
    }
}
