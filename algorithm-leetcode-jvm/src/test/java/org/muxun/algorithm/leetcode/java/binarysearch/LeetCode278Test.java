package org.muxun.algorithm.leetcode.java.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/13
 */
@DisplayName("第一个错误版本测试用例")
public class LeetCode278Test {

    @Test
    public void testOne() {
        int n = 5;
        int bad = 4;
        int res = new LeetCode278().firstBadVersion(n, bad);
        Assertions.assertEquals(bad, res);
    }

    @Test
    public void testTwo() {
        int n = 1;
        int bad = 1;
        int res = new LeetCode278().firstBadVersion(n, bad);
        Assertions.assertEquals(bad, res);
    }
}
