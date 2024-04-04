package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-02-23
 */
@DisplayName("组合总和II测试类")
public class CombinationSum2Test {

    @Test
    public void combinationSum2TestOne() {
        Assertions.assertIterableEquals(List.of(List.of(1, 7), List.of(1, 2, 5), List.of(2, 6), List.of(1, 1, 6)), new CombinationSum2().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    @Test
    public void combinationSum2TestTwo() {
        Assertions.assertIterableEquals(List.of(List.of(1, 2, 2), List.of(5)), new CombinationSum2().combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }
}
