package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-31
 */
@DisplayName("验证二叉树的前序序列化测试用例")
public class LeetCode331Test {

    @Test
    public void testOne() {
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        boolean expected = true;
        boolean res = new LeetCode331().isValidSerialization(preorder);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        String preorder = "1,#";
        boolean expected = false;
        boolean res = new LeetCode331().isValidSerialization(preorder);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testThree() {
        String preorder = "9,#,#,1";
        boolean expected = false;
        boolean res = new LeetCode331().isValidSerialization(preorder);
        Assertions.assertEquals(expected, res);
    }
}
