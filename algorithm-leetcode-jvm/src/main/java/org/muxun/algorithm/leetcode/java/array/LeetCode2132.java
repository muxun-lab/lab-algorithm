package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：2132
 * 题目：用邮票贴满网格图
 * 链接：https://leetcode.cn/problems/stamping-the-grid
 * 详情：给你一个 m x n 的二进制矩阵 grid ，每个格子要么为 0 （空）要么为 1 （被占据）。
 * <p>
 * 给你邮票的尺寸为 stampHeight x stampWidth 。我们想将邮票贴进二进制矩阵中，且满足以下 限制 和 要求 ：
 * <p>
 * 1. 覆盖所有 空 格子。
 * 2. 不覆盖任何 被占据 的格子。
 * 3. 我们可以放入任意数目的邮票。
 * 4. 邮票可以相互有 重叠 部分。
 * 5. 邮票不允许 旋转 。
 * 6. 邮票必须完全在矩阵 内 。
 * 如果在满足上述要求的前提下，可以放入邮票，请返回 true ，否则返回 false 。
 * @author 慕勋
 * @created 2023-12-14
 */
public class LeetCode2132 {

    /**
     * 思路: 二分矩阵
     * @param grid        矩阵
     * @param stampHeight 邮票长度
     * @param stampWidth  邮票宽度
     * @return 输出结果
     */
    public boolean possibleToStamp(int[][] grid, int stampHeight, int stampWidth) {
        int m = grid.length, n = grid[0].length;
        int[][] sum = new int[m + 2][n + 2];
        int[][] diff = new int[m + 2][n + 2];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + grid[i - 1][j - 1];
            }
        }

        for (int i = 1; i + stampHeight - 1 <= m; i++) {
            for (int j = 1; j + stampWidth - 1 <= n; j++) {
                int x = i + stampHeight - 1;
                int y = j + stampWidth - 1;
                if (sum[x][y] - sum[x][j - 1] - sum[i - 1][y] + sum[i - 1][j - 1] == 0) {
                    diff[i][j]++;
                    diff[i][y + 1]--;
                    diff[x + 1][j]--;
                    diff[x + 1][y + 1]++;
                }
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                diff[i][j] += diff[i - 1][j] + diff[i][j - 1] - diff[i - 1][j - 1];
                if (diff[i][j] == 0 && grid[i - 1][j - 1] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
