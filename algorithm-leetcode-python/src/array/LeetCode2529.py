from typing import List


class LeetCode2529(object):
    def maximumCount(self, nums: List[int]) -> int:
        zero_index = self.binarySearch(nums, 0)
        one_index = self.binarySearch(nums, 1)
        return max(zero_index, len(nums) - one_index)

    def binarySearch(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums)
        while left < right:
            mid = left + (right - left) // 2
            if nums[mid] >= target:
                right = mid
            else:
                left = mid + 1
        return left
