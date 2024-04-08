package org.muxun.algorithm.leetcode.kotlin.array

import kotlin.math.max

class LeetCode2529 {

    fun maximumCount(nums: IntArray): Int {
        val zeroIndex = binarySearch(nums, 0)
        val oneIndex = binarySearch(nums, 1)
        return max(zeroIndex, nums.size - oneIndex)
    }

    private fun binarySearch(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] >= target) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }
}