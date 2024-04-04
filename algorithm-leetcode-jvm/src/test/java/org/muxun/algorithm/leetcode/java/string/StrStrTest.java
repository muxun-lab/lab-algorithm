package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-19
 */
@DisplayName("实现strStr()测试类")
public class StrStrTest {

    @Test
    public void strStrTestOne() {
        Assertions.assertEquals(2, new StrStr().strStr("hello", "ll"));
    }

    @Test
    public void strStrTestTwo() {
        Assertions.assertEquals(-1, new StrStr().strStr("aaaaa", "bba"));
    }

    @Test
    public void strStrTestThree() {
        Assertions.assertEquals(-1, new StrStr().strStr("aaaa", "baaa"));
    }
}
