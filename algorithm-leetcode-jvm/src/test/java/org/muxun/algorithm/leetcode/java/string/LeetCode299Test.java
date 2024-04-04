package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-10
 */
@DisplayName("猜数字游戏测试用例")
public class LeetCode299Test {

    @Test
    public void testOne() {
        String secret = "1807";
        String guess = "7810";
        String expected = "1A3B";
        String res = new LeetCode299().getHint(secret, guess);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String secret = "1123";
        String guess = "0111";
        String expected = "1A1B";
        String res = new LeetCode299().getHint(secret, guess);
        Assertions.assertEquals(expected, res);
    }
}
