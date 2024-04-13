package org.muxun.algorithm.leetcode.competition.weekly.threehundredeightyseven;

/**
 * 题号: 100237
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/count-submatrices-with-top-left-element-and-sum-less-than-k">元素和小于等于 k 的子矩阵的数目</a>
 * <p>
 * 详情: 给你一个下标从 0 开始的整数矩阵 grid 和一个整数 k。
 * <p>
 * 返回包含 grid 左上角元素、元素和小于或等于 k 的 子矩阵 的数目
 * @author 慕勋
 * @created 2024/3/3
 */
public class LeetCode100237 {

    /**
     * 思路: 二维前缀和
     * @param grid 二维矩阵
     * @param k    最大值
     * @return 子矩阵个数
     */
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // 两个矩形之和-一次重叠的公共部分
                grid[i][j] += grid[i - 1][j] + grid[i][j - 1] - grid[i - 1][j - 1];
            }
        }
        int ans = 0;
        // 计算每个前缀和的值，如果遇到断头路直接返回
        for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] <= k) {
                    flag = true;
                    ans++;
                } else {
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        return ans;
    }
}
