package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-21
 */
@DisplayName("字符串相乘测试类")
public class StringMultiplyTest {

    @Test
    public void stringMultiplyTestOne() {
        Assertions.assertEquals("5535", new StringMultiply().multiply("123", "45"));
    }

    @Test
    public void stringMultiplyTestTwo() {
        Assertions.assertEquals("", new StringMultiply().multiply("123456789", "987654321"));
    }

    @Test
    public void stringMultiplyAddStringTestOne() {
        Assertions.assertEquals("168", new StringMultiply().addString("123", "45"));
    }

    @Test
    public void stringMultiplyUpgradeTestOne() {
        Assertions.assertEquals("5535", new StringMultiply().multiplyUpgrade("123", "45"));
    }
}
