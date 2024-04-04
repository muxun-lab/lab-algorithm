package org.muxun.algorithm.leetcode.java.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号: 2476
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/closest-nodes-queries-in-a-binary-search-tree">二叉搜索树最近节点查询</a>
 * <p>
 * 详情: 给你一个 二叉搜索树 的根节点 root ，和一个由正整数组成、长度为 n 的数组 queries 。
 * <p>
 * 请你找出一个长度为 n 的 二维 答案数组 answer ，其中 answer[i] = [mini, maxi] ：
 * <p>
 * * mini 是树中小于等于 queries[i] 的 最大值 。如果不存在这样的值，则使用 -1 代替。
 * * maxi 是树中大于等于 queries[i] 的 最小值 。如果不存在这样的值，则使用 -1 代替。
 * @author 慕勋
 * @created 2024/2/24
 */
public class LeetCode2476 {

    /**
     * 思路: 数组排序+二分查找
     * 二叉搜索树的中序遍历是升序的，可以免除一次数组排序
     * @param root    根节点
     * @param queries 查找数组
     * @return 搜索结果
     */
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> sortList = new ArrayList<>();
        dfs(root, sortList);

        List<List<Integer>> resList = new ArrayList<>();
        for (int query : queries) {
            int max = -1;
            int min = -1;
            int index = binarySearch(sortList, query);
            if (index != sortList.size()) {
                max = sortList.get(index);
                if (sortList.get(index) == query) {
                    min = query;
                    List<Integer> res = new ArrayList<>();
                    res.add(min);
                    res.add(max);
                    resList.add(res);
                    continue;
                }
            }
            if (index > 0) {
                min = sortList.get(index - 1);
            }
            List<Integer> res = new ArrayList<>();
            res.add(min);
            res.add(max);
            resList.add(res);
        }
        return resList;
    }

    private void dfs(TreeNode node, List<Integer> sortList) {
        if (node == null) {
            return;
        }
        dfs(node.left, sortList);
        sortList.add(node.val);
        dfs(node.right, sortList);
    }

    private int binarySearch(List<Integer> sortList, int target) {
        int left = 0;
        int right = sortList.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sortList.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
