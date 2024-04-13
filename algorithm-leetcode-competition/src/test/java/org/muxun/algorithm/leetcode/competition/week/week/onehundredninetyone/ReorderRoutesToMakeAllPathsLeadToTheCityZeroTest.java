package org.muxun.algorithm.leetcode.competition.week.week.onehundredninetyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredninetyone.ReorderRoutesToMakeAllPathsLeadToTheCityZero;

/**
 * @author sunshine
 * @created 2020-05-31
 */
@DisplayName("重新规划路线单元测试")
public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {

    @Test
    public void minReorderTestOne() {
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        Assertions.assertEquals(6, new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(6, connections));
    }

    @Test
    public void minReorderTestTwo() {
        int[][] connections = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        Assertions.assertEquals(2, new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(5, connections));
    }

    @Test
    public void minReorderTestThree() {
        int[][] connections = {{1, 0}, {2, 0}};
        Assertions.assertEquals(0, new ReorderRoutesToMakeAllPathsLeadToTheCityZero().minReorder(3, connections));
    }
}
