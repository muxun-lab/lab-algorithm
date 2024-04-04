package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 96
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/unique-binary-search-trees">不同的二叉搜索树</a>
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/3/3
 */
public class LeetCode96 {

    /**
     * 思路: 动态规划
     * 由于左右子树的根节点不一样，所以一定是不重复的
     * 左子树根节点是1，那么右节点从3到n可以构建不重复的二叉搜索树
     * 所以当以i为根节点时，左右子树可以构建的不同的二叉搜索树的个数是左面节点 * 右面节点
     * @param n 节点数量
     * @return 不同二叉搜索树的个数
     */
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
