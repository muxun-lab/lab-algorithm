package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/5/13
 */
@DisplayName("合并区间单元测试")
public class MergeAreaTest {

    @Test
    public void mergeAreaTestOne() {
        Assertions.assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, new MergeArea().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    public void mergeAreaTestTwo() {
        Assertions.assertArrayEquals(new int[][]{{1, 5}}, new MergeArea().merge(new int[][]{{1, 4}, {4, 5}}));
    }

    @Test
    public void mergeAreaTestThree() {
        Assertions.assertArrayEquals(new int[][]{{1, 4}, {5, 6}}, new MergeArea().merge(new int[][]{{1, 4}, {5, 6}}));
    }
}
