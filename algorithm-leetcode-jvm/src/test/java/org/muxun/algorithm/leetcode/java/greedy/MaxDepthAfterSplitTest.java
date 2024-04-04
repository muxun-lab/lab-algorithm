package org.muxun.algorithm.leetcode.java.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-04-01
 */
@DisplayName("有效括号的嵌套深度单元测试")
public class MaxDepthAfterSplitTest {

    @Test
    public void maxDepthAfterSplitTestOne() {
        Assertions.assertArrayEquals(new int[]{0, 1, 1, 1, 1, 0}, new MaxDepthAfterSplit().maxDepthAfterSplit("(()())"));
    }

    @Test
    public void maxDepthAfterSplitTestTwo() {
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 1, 1, 0, 1, 1}, new MaxDepthAfterSplit().maxDepthAfterSplit("()(())()"));
    }

    @Test
    public void maxDepthAfterSplitUpgradeTestOne() {
        Assertions.assertArrayEquals(new int[]{0, 1, 1, 1, 1, 0}, new MaxDepthAfterSplit().maxDepthAfterSplitUpgrade("(()())"));
    }

    @Test
    public void maxDepthAfterSplitUpgradeTestTwo() {
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 1, 1, 0, 1, 1}, new MaxDepthAfterSplit().maxDepthAfterSplitUpgrade("()(())()"));
    }
}
