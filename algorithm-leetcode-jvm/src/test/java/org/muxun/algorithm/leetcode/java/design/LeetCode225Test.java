package org.muxun.algorithm.leetcode.java.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("用队列实现栈测试用例")
public class LeetCode225Test {

    @Test
    public void testOne() {
        LeetCode225 stack = new LeetCode225();
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(2, stack.top());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertFalse(stack.empty());
    }
}
