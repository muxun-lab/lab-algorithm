package org.muxun.algorithm.leetcode.java.dp;

import org.muxun.algorithm.leetcode.java.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：95
 * 题目：不同的二叉搜索树II
 * 详情：给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树
 * 二叉搜索树的性质：左子树的值小于根节点，右子树的节点值大于根节点
 * @author 慕勋
 * @created 2020-03-18
 */
public class GenerateTress {

    /**
     * 思路：递归
     * @param n 给定树的节点个数及值
     * @return 给定节点个数的二叉树全排列
     */
    public List<TreeNode> generateTreesRecursion(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        if (n == 1) {
            return new ArrayList<>() {{
                add(new TreeNode(1));
            }};
        }
        return recursion(1, n);
    }

    public List<TreeNode> recursion(int start, int end) {
        List<TreeNode> resultList = new ArrayList<>();
        if (start > end) {
            resultList.add(null);
            return resultList;
        }
        if (start == end) {
            resultList.add(new TreeNode(start));
            return resultList;
        }
        for (int i = start; i <= end; i++) {
            // 左子树
            List<TreeNode> leftSubTreeList = recursion(start, i - 1);
            // 右子树
            List<TreeNode> rightSubTreeList = recursion(i + 1, end);
            // 结合左右子树
            for (TreeNode leftSubTreeRoot : leftSubTreeList) {
                for (TreeNode rightSubTreeRoot : rightSubTreeList) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftSubTreeRoot;
                    root.right = rightSubTreeRoot;
                    resultList.add(root);
                }
            }
        }
        return resultList;
    }

    /**
     * 思路：动态规划
     * 状态定义：dp[1][n]为选举1作为节点，n=3时，生成的二叉树
     * 转移方程：选举i时，其实是考虑dp[1][i]和d[i+1][n]的排列
     * 初始值：dp[1][2]=1 dp[1][]=1
     * 返回值：树的全排列
     * @param n 给定树的节点个数及值
     * @return 给定节点个数的二叉树全排列
     */
    public List<TreeNode> generateTrees(int n) {
        ArrayList<TreeNode>[] dp = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = new ArrayList<>();
            for (int j = 1; j <= i; i++) {
                int leftNodeLength = j - 1;
                int rightNodeLength = j + 1;
                for (TreeNode leftSubTreeNode : dp[leftNodeLength]) {
                    for (TreeNode rightSubTreeNode : dp[rightNodeLength]) {
                        TreeNode root = new TreeNode(i);
                        root.left = leftSubTreeNode;
                        // 避免重复计算，相加即可
                        root.right = clone(rightSubTreeNode, i);
                        dp[i].add(root);
                    }
                }
            }
        }
        return dp[n];
    }

    private TreeNode clone(TreeNode rightSubTreeNode, int offset) {
        if (rightSubTreeNode == null) {
            return null;
        }
        // 值需要相加
        TreeNode root = new TreeNode(rightSubTreeNode.val + offset);
        root.left = clone(rightSubTreeNode.left, offset);
        root.right = clone(rightSubTreeNode.right, offset);
        return root;
    }

    /**
     * 思路：动态规划
     * 插入的节点一定是在根节点，右子节点，右子节点的右子节点，右子节点的右子节点的右子节点
     * @param n 给定树的节点个数及值
     * @return 给定节点个数的二叉树全排列
     */
    public List<TreeNode> generateTreesDynamicProgrammingUpgrade(int n) {
        List<TreeNode> previousList = new ArrayList<>();
        List<TreeNode> resultList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            for (TreeNode previousRoot : previousList) {
                TreeNode root = new TreeNode(i);
                root.left = previousRoot;
                resultList.add(root);
                for (int j = 0; j <= n; j++) {
                    TreeNode current = copy(previousRoot);
                    TreeNode rightSubTree = current;
                    int k = 0;
                    while (k < j) {
                        if (rightSubTree == null) {
                            break;
                        }
                        rightSubTree = rightSubTree.right;
                        k++;
                    }
                    if (rightSubTree == null) {
                        break;
                    }
                    TreeNode rightTree = rightSubTree.right;
                    root = new TreeNode(i);
                    rightTree.right = root;
                    root.left = rightTree;
                    resultList.add(current);
                }
            }
        }
        return resultList;
    }

    private TreeNode copy(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode newRoot = new TreeNode(root.val);
        newRoot.left = copy(root.left);
        newRoot.right = copy(root.right);
        return newRoot;
    }
}
