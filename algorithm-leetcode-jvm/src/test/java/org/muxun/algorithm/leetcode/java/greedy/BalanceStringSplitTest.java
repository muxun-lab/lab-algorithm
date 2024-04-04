package org.muxun.algorithm.leetcode.java.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-14
 */
@DisplayName("分割平衡字符串测试类")
public class BalanceStringSplitTest {

    @Test
    public void balanceStringSplitTestOne() {
        Assertions.assertEquals(4, new BalanceStringSplit().balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    public void balanceStringSplitTestTwo() {
        Assertions.assertEquals(3, new BalanceStringSplit().balancedStringSplit("RLLLLRRRLR"));
    }

    @Test
    public void balanceStringSplitTestThree() {
        Assertions.assertEquals(1, new BalanceStringSplit().balancedStringSplit("LLLLRRRR"));
    }

    @Test
    public void balanceStringSplitTestFour() {
        Assertions.assertEquals(2, new BalanceStringSplit().balancedStringSplit("RRLRRLRLLLRL"));
    }
}
