package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-19
 */
@DisplayName("不同路径II单元测试")
public class UniquePathsWithObstaclesTest {

    @Test
    public void uniquePathsWithObstaclesTestOne() {
        Assertions.assertEquals(2, new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

    @Test
    public void uniquePathsWithObstaclesTestTwo() {
        Assertions.assertEquals(1, new UniquePathsWithObstacles().uniquePathsWithObstacles(new int[][]{{0}, {0}}));
    }
}
