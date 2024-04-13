package org.muxun.algorithm.leetcode.competition.week.week.onehundredeightyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredeightyone.HasValidPath;

/**
 * @author sunshine
 * @created 2020-03-22
 */
@DisplayName("检查网格中是否存在有效路径单元测试")
public class HasValidPathTest {

    @Test
    public void hasValidPathTestOne() {
        Assertions.assertTrue(new HasValidPath().hasValidPathDFS(new int[][]{{2, 4, 3}, {6, 5, 2}}));
    }

    @Test
    public void hasValidPathTestTwo() {
        Assertions.assertFalse(new HasValidPath().hasValidPathDFS(new int[][]{{1, 1, 2}}));
    }

    @Test
    public void hasValidPathTestThree() {
        Assertions.assertTrue(new HasValidPath().hasValidPathDFS(new int[][]{{2}, {2}, {2}, {2}, {2}, {2}, {6}}));
    }
}
