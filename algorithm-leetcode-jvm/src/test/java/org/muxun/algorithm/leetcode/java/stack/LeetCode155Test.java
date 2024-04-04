package org.muxun.algorithm.leetcode.java.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024/2/11
 */
@DisplayName("最小栈测试用例")
public class LeetCode155Test {

    @Test
    public void testOne() {
        LeetCode155 stack = new LeetCode155();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        int min = stack.getMin();
        stack.pop();
        int top = stack.top();
        int min2 = stack.getMin();
        int expectedMin = -3;
        int expectedTop = 0;
        int expectedMin2 = -2;
        Assertions.assertEquals(expectedMin, min);
        Assertions.assertEquals(expectedTop, top);
        Assertions.assertEquals(expectedMin2, min2);
    }
}
