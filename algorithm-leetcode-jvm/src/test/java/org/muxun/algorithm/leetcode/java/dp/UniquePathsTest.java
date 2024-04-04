package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-17
 */
@DisplayName("不同路径单元测试")
public class UniquePathsTest {

    @Test
    public void uniquePathsTestOne() {
        Assertions.assertEquals(3, new UniquePaths().uniquePaths(3, 2));
    }

    @Test
    public void uniquePathsTestTwo() {
        Assertions.assertEquals(28, new UniquePaths().uniquePaths(7, 3));
    }
}
