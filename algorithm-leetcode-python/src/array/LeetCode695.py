from typing import List


class LeetCode695:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if not grid or not grid[0]:
            return 0
        ans = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] != 1:
                    continue
                res = self.dfs(grid, i, j)
                ans = max(ans, res)
        return ans

    def dfs(self, grid: List[List[int]], x: int, y: int) -> int:
        if x < 0 or y < 0 or x >= len(grid) or y >= len(grid[0]):
            return 0
        if grid[x][y] == 0:
            return 0
        grid[x][y] = -1
        up = self.dfs(grid, x - 1, y)
        down = self.dfs(grid, x + 1, y)
        left = self.dfs(grid, x, y - 1)
        right = self.dfs(grid, x, y + 1)
        return up + down + left + right + 1
