package org.muxun.algorithm.leetcode.java.array;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-01-24
 */
@DisplayName("杨辉三角 II测试用例")
public class LeetCode119Test {

    @Test
    public void testOne() {
        int rowIndex = 3;
        List<Integer> expected = List.of(1, 3, 3, 1);
        List<Integer> resList = new LeetCode119().getRow(rowIndex);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        int rowIndex = 0;
        List<Integer> expected = List.of(1);
        List<Integer> resList = new LeetCode119().getRow(rowIndex);
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testThree() {
        int rowIndex = 1;
        List<Integer> expected = List.of(1, 1);
        List<Integer> resList = new LeetCode119().getRow(rowIndex);
        Assertions.assertIterableEquals(expected, resList);
    }
}
