package org.muxun.algorithm.leetcode.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-19
 */
@DisplayName("有效的括号测试类")
public class BracketIsValidTest {

    @Test
    public void bracketIsValidTestOne() {
        Assertions.assertTrue(new BracketIsValid().isValid("()"));
    }

    @Test
    public void bracketIsValidTestTwo() {
        Assertions.assertTrue(new BracketIsValid().isValid("()[]{}"));
    }

    @Test
    public void bracketIsValidTestThree() {
        Assertions.assertFalse(new BracketIsValid().isValid("(]"));
    }

    @Test
    public void bracketIsValidTestFour() {
        Assertions.assertFalse(new BracketIsValid().isValid("([)]"));
    }

    @Test
    public void bracketIsValidTestFive() {
        Assertions.assertTrue(new BracketIsValid().isValid("{[]}"));
    }

    @Test
    public void bracketIsValidTestSix() {
        Assertions.assertFalse(new BracketIsValid().isValid("(("));
    }

    @Test
    public void bracketIsValidTestSeven() {
        Assertions.assertFalse(new BracketIsValid().isValid("}{"));
    }
}
