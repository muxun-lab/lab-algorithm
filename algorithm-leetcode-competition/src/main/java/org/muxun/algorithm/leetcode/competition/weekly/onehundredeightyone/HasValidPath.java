package org.muxun.algorithm.leetcode.competition.weekly.onehundredeightyone;

/**
 * 题号：5366
 * 题目：检查网格中是否存在有效路径
 * 链接：https://leetcode-cn.com/problems/check-if-there-is-a-valid-path-in-a-grid/
 * 详情：给你一个m x n的网格grid
 * 网格里的每个单元都代表一条街道，grid[i][j] 的街道可以是：
 * * 1 表示连接左单元格和右单元格的街道。
 * * 2 表示连接上单元格和下单元格的街道。
 * * 3 表示连接左单元格和下单元格的街道。
 * * 4 表示连接右单元格和下单元格的街道。
 * * 5 表示连接左单元格和上单元格的街道。
 * * 6 表示连接右单元格和上单元格的街道。
 * 你最开始从左上角的单元格(0, 0)开始出发，网格中的「有效路径」是指从左上方的单元格(0, 0)开始、一直到右下方的(m - 1, n - 1)结束的路径
 * 该路径必须只沿着街道走。
 * 注意：你「不能」变更街道。
 * 如果网格中存在有效的路径，则返回true，否则返回false
 * @author sunshine
 * @created 2020-03-22
 */
public class HasValidPath {

    private int m;
    private int n;
    private boolean[][] visited;
    private int[][] grid;

    /**
     * 思路：深度优先遍历
     * 需要判断向上、下、左、右四个方向移动时，是否可行，不可行直接返回false
     * 记录已经走过的路，如果发现路走过，则返回false
     * dfs进行递归
     * @param grid 道路矩阵
     * @return 是否可以从[0, 0]到达[m - 1, n - 1]
     */
    public boolean hasValidPathDFS(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        this.visited = new boolean[m][n];
        this.grid = grid;
        return dfs(0, 0);
    }

    private boolean dfs(int x, int y) {
        if (visited[x][y]) {
            return false;
        }
        if ((x == m - 1) && (y == n - 1)) {
            return true;
        }
        int current = grid[x][y];
        visited[x][y] = true;
        if (current == 1) {
            return (toLeft(x, y) && dfs(x, y - 1)) || (toRight(x, y) && dfs(x, y + 1));
        } else if (current == 2) {
            return (toUp(x, y) && dfs(x - 1, y)) || (toDown(x, y) && dfs(x + 1, y));
        } else if (current == 3) {
            return (toLeft(x, y) && dfs(x, y - 1)) || (toDown(x, y) && dfs(x + 1, y));
        } else if (current == 4) {
            return (toRight(x, y) && dfs(x, y + 1)) || (toDown(x, y) && dfs(x + 1, y));
        } else if (current == 5) {
            return (toLeft(x, y) && dfs(x, y - 1)) || (toUp(x, y) && dfs(x - 1, y));
        } else if (current == 6) {
            return (toRight(x, y) & dfs(x, y + 1)) || (toUp(x, y) && dfs(x - 1, y));
        }
        return false;
    }

    private boolean toLeft(int x, int y) {
        if (y <= 0) {
            return false;
        }
        if (grid[x][y - 1] == 1) {
            return true;
        }
        if (grid[x][y - 1] == 4) {
            return true;
        }
        return grid[x][y - 1] == 6;
    }

    private boolean toRight(int x, int y) {
        if (y + 1 >= n) {
            return false;
        }
        if (grid[x][y + 1] == 1) {
            return true;
        }
        if (grid[x][y + 1] == 3) {
            return true;
        }
        return grid[x][y + 1] == 5;
    }

    private boolean toUp(int x, int y) {
        if (x <= 0) {
            return false;
        }
        if (grid[x - 1][y] == 2) {
            return true;
        }
        if (grid[x - 1][y] == 3) {
            return true;
        }
        return grid[x - 1][y] == 4;
    }

    private boolean toDown(int x, int y) {
        if (x + 1 >= m) {
            return false;
        }
        if (grid[x + 1][y] == 2) {
            return true;
        }
        if (grid[x + 1][y] == 5) {
            return true;
        }
        return grid[x + 1][y] == 6;
    }
}
