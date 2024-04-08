package org.muxun.algorithm.leetcode.kotlin.array

import kotlin.test.Test
import kotlin.test.assertEquals

class LeetCode2529Test {

    @Test
    fun testOne() {
        val nums = intArrayOf(-2, -1, -1, 1, 2, 3)
        val expected = 3
        val res = LeetCode2529().maximumCount(nums)
        assertEquals(expected, res)
    }

    @Test
    fun testTwo() {
        val nums = intArrayOf(-3, -2, -1, 0, 0, 1, 2)
        val expected = 3
        val res = LeetCode2529().maximumCount(nums)
        assertEquals(expected, res)
    }

    @Test
    fun testThree() {
        val nums = intArrayOf(5, 20, 66, 1314)
        val expected = 4
        val res = LeetCode2529().maximumCount(nums)
        assertEquals(expected, res)
    }
}