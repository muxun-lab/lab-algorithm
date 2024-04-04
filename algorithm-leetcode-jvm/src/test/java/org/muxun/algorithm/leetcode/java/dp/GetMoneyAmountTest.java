package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-16
 */
@DisplayName("猜数字大小II单元测试")
public class GetMoneyAmountTest {

    @Test
    public void getMoneyAmountTestOne() {
        Assertions.assertEquals(16, new GetMoneyAmount().getMoneyAmount(10));
    }

    @Test
    public void getMoneyAmountViolenceTestOne() {
        Assertions.assertEquals(16, new GetMoneyAmount().getMoneyAmountViolence(10));
    }
}
