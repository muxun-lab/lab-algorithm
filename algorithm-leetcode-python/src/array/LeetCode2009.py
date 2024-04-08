from typing import List


class LeetCode2009(object):
    def minOperations(self, nums: List[int]) -> int:
        n = len(nums)
        sort = sorted(set(nums))
        res = n
        index = 0
        for i, left in enumerate(sort):
            right = left + n - 1
            while index < len(sort) and sort[index] <= right:
                res = min(res, n - (index - i + 1))
                index = index + 1
        return res
