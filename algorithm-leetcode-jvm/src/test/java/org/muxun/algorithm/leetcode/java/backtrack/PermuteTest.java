package org.muxun.algorithm.leetcode.java.backtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author 慕勋
 * @created 2020-03-18
 */
@DisplayName("全排列单元测试")
public class PermuteTest {

    @Test
    public void permuteTestOne() {
        Assertions.assertIterableEquals(List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)), new Permute().permute(new int[]{1, 2, 3}));
    }

    @Test
    public void permuteTestTwo() {
        Assertions.assertIterableEquals(List.of(List.of(1)), new Permute().permute(new int[]{1}));
    }
}
