from typing import List


class LeetCode2923(object):
    def findChampion(self, grid: List[List[int]]) -> int:
        n = len(grid)
        for i, line in enumerate(grid):
            if sum(line) == n - 1:
                return i
