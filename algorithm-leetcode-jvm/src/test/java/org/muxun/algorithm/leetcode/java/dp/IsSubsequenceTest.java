package org.muxun.algorithm.leetcode.java.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-14
 */
@DisplayName("判断子序列单元测试")
public class IsSubsequenceTest {

    @Test
    public void isSubsequenceTestOne() {
        Assertions.assertTrue(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void isSubsequenceTestTwo() {
        Assertions.assertFalse(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void isSubsequenceTestThree() {
        Assertions.assertFalse(new IsSubsequence().isSubsequence("leeeeetcode", "leeetcode"));
    }

    @Test
    public void isSubsequenceDynamicProgrammingTestOne() {
        Assertions.assertTrue(new IsSubsequence().isSubsequenceDynamicProgramming("abc", "ahbgdc"));
    }

    @Test
    public void isSubsequenceDynamicProgrammingTestTwo() {
        Assertions.assertFalse(new IsSubsequence().isSubsequenceDynamicProgramming("axc", "ahbgdc"));
    }

    @Test
    public void isSubsequenceDynamicProgrammingTestThree() {
        Assertions.assertFalse(new IsSubsequence().isSubsequenceDynamicProgramming("leeeeetcode", "leeetcode"));
    }
}
