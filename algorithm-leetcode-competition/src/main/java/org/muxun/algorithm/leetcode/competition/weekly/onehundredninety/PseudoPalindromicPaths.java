package org.muxun.algorithm.leetcode.competition.weekly.onehundredninety;

import org.muxun.algorithm.leetcode.competition.weekly.onehundredeighty.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 题号：5418
 * 题目：二叉树中的伪回文路径
 * 题链：https://leetcode-cn.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
 * 详情：给你一棵二叉树，每个节点的值为 1 到 9
 * 我们称二叉树中的一条路径是 「伪回文」的
 * 当它满足：
 * * 路径经过的所有节点值的排列中，存在一个回文序列
 * * 请你返回从根到叶子节点的所有路径中 伪回文 路径的数目
 * @author sunshine
 * @created 2020-05-24
 */
public class PseudoPalindromicPaths {

    private final List<List<Integer>> resultList = new ArrayList<>();

    private final List<Integer> perPathList = new ArrayList<>();

    /**
     * 思路：BFS+迭代
     * @param root 给定二叉树根节点
     * @return 伪回文路径数目
     */
    public int pseudoPalindromicPaths(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<String> paths = new LinkedList();
        LinkedList<TreeNode> stack = new LinkedList();
        LinkedList<String> pathList = new LinkedList();
        stack.add(root);
        pathList.add(Integer.toString(root.val));
        TreeNode node;
        String path;
        while (!stack.isEmpty()) {
            node = stack.pollLast();
            path = pathList.pollLast();
            if ((node.left == null) && (node.right == null))
                paths.add(path);
            if (node.left != null) {
                stack.add(node.left);
                pathList.add(path + node.left.val);
            }
            if (node.right != null) {
                stack.add(node.right);
                pathList.add(path + node.right.val);
            }
        }
        int count = 0;
        for (int i = 0; i < paths.size(); i++) {
            path = paths.get(i);
            int size = path.length();
            HashMap<Integer, Integer> pathMap = new HashMap<>();
            for (int j = 0; j < path.length(); j++) {
                int current = path.charAt(j);
                if (!pathMap.containsKey(current)) {
                    pathMap.put(current, 0);

                }
                pathMap.put(current, pathMap.get(current) + 1);
            }
            boolean flag = true;
            int evenCount = 0;
            for (int number : pathMap.values()) {
                if (size % 2 == 0 && number % 2 == 1) {
                    flag = false;
                    break;
                }
                if (size % 2 == 1) {
                    if (number % 2 == 1) {
                        evenCount++;
                    }
                    if (evenCount > 1) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    /**
     * 思路：DFS+回溯
     * 整体思路相同，优化解法使用了DFS，减少了BFS的时间复杂度
     * @param root 给定二叉树根节点
     * @return 伪回文路径数目
     */
    public int pseudoPalindromicPathsOptimize(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int count = 0;
        dfs(root);
        for (List<Integer> path : resultList) {
            if (isPalindromic(path)) {
                count++;
            }
        }
        return count;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            perPathList.add(root.val);
            resultList.add(new ArrayList<>(perPathList));
            perPathList.remove(perPathList.size() - 1);
            return;
        }
        perPathList.add(root.val);
        dfs(root.left);
        dfs(root.right);
        perPathList.remove(perPathList.size() - 1);
    }

    public boolean isPalindromic(List<Integer> pathList) {
        int[] markArray = new int[10];
        for (int i = 0; i < pathList.size(); i++) {
            markArray[pathList.get(i)]++;
        }
        int even = 0;
        for (int i = 0; i < markArray.length; i++) {
            if (markArray[i] % 2 == 1) {
                even++;
            }
        }
        return even < 2;
    }
}
