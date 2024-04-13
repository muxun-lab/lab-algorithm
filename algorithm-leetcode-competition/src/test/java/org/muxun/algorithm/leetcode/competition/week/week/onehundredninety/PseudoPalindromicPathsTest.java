package org.muxun.algorithm.leetcode.competition.week.week.onehundredninety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredeighty.TreeNode;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredninety.PseudoPalindromicPaths;

/**
 * @author sunshine
 * @created 2020-05-24
 */
@DisplayName("二叉树中的伪回文路径单元测试")
public class PseudoPalindromicPathsTest {

    @Test
    public void pseudoPalindromicPathsTestOne() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        Assertions.assertEquals(2, new PseudoPalindromicPaths().pseudoPalindromicPaths(root));
    }

    @Test
    public void pseudoPalindromicPathsTestTwo() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(1);
        Assertions.assertEquals(1, new PseudoPalindromicPaths().pseudoPalindromicPaths(root));
    }

    @Test
    public void pseudoPalindromicPathsTestThree() {
        TreeNode root = new TreeNode(9);
        Assertions.assertEquals(1, new PseudoPalindromicPaths().pseudoPalindromicPaths(root));
    }

    @Test
    public void pseudoPalindromicPathsOptimizeTestOne() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        Assertions.assertEquals(2, new PseudoPalindromicPaths().pseudoPalindromicPathsOptimize(root));
    }

    @Test
    public void pseudoPalindromicPathsOptimizeTestTwo() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.right = new TreeNode(1);
        Assertions.assertEquals(1, new PseudoPalindromicPaths().pseudoPalindromicPathsOptimize(root));
    }

    @Test
    public void pseudoPalindromicPathsOptimizeTestThree() {
        TreeNode root = new TreeNode(9);
        Assertions.assertEquals(1, new PseudoPalindromicPaths().pseudoPalindromicPathsOptimize(root));
    }
}
