package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2024/1/30
 */
@DisplayName("使循环数组所有元素相等的最少秒数测试用例")
public class LeetCode2808Test {

    @Test
    public void testOne() {
        List<Integer> numList = List.of(1, 2, 1, 2);
        int res = new LeetCode2808().minimumSeconds(numList);
        Assertions.assertEquals(1, res);
    }

    @Test
    public void testTwo() {
        List<Integer> numList = List.of(2, 1, 3, 3, 2);
        int res = new LeetCode2808().minimumSeconds(numList);
        Assertions.assertEquals(2, res);
    }

    @Test
    public void testThree() {
        List<Integer> numList = List.of(5, 5, 5, 5);
        int res = new LeetCode2808().minimumSeconds(numList);
        Assertions.assertEquals(0, res);
    }
}
