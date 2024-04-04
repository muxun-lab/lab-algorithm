package org.muxun.algorithm.leetcode.java.array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-01-24
 */
@DisplayName("杨辉三角测试用例")
public class LeetCode118Test {

    @Test
    public void testOne() {
        int numsRow = 5;
        List<List<Integer>> expected = List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1));
        List<List<Integer>> resList = new LeetCode118().generate(numsRow);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        int numsRow = 1;
        List<List<Integer>> expected = List.of(List.of(1));
        List<List<Integer>> resList = new LeetCode118().generate(numsRow);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testThree() {
        int numsRow = 5;
        List<List<Integer>> expected = List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1));
        List<List<Integer>> resList = new LeetCode118().generateOptimization(numsRow);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testFour() {
        int numsRow = 1;
        List<List<Integer>> expected = List.of(List.of(1));
        List<List<Integer>> resList = new LeetCode118().generateOptimization(numsRow);
        Assertions.assertIterableEquals(expected, resList);
    }
}
