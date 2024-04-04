package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-17
 */
@DisplayName("除数博弈单元测试")
public class DivisorGameTest {

    @Test
    public void divisorGameTestOne() {
        Assertions.assertTrue(new DivisorGame().divisorGame(2));
    }

    @Test
    public void divisorGameTestTwo() {
        Assertions.assertFalse(new DivisorGame().divisorGame(3));
    }
}
