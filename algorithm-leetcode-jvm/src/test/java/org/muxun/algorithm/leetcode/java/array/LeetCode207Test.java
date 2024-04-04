package org.muxun.algorithm.leetcode.java.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-14
 */
@DisplayName("课程表测试用例")
public class LeetCode207Test {

    @Test
    public void testOne() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        boolean expected = true;
        boolean res = new LeetCode207().canFinish(numCourses, prerequisites);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        boolean expected = false;
        boolean res = new LeetCode207().canFinish(numCourses, prerequisites);
        Assertions.assertEquals(expected, res);
    }
}
