package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-02-21
 */
@DisplayName("组合总和测试类")
public class CombinationSumTest {

    @Test
    public void combinationSumTestOne() {
        Assertions.assertIterableEquals(List.of(List.of(2, 2, 3), List.of(7)), new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    @Test
    public void combinationSumTestTwo() {
        Assertions.assertIterableEquals(List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)), new CombinationSum().combinationSum(new int[]{2, 3, 5}, 8));
    }
}
