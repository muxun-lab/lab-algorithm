package org.muxun.algorithm.leetcode.java.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-16
 */
@DisplayName("猜数字大小")
public class GuessNumberTest {

    @Test
    public void guessNumberTestOne() {
        Assertions.assertEquals(6, new GuessNumber(6).guessNumber(10));
    }

    @Test
    public void guessNumberTestTwo() {
        Assertions.assertEquals(15, new GuessNumber(382).guessNumber(15));
    }
}
