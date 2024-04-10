package org.muxun.algorithm.leetcode.kotlin.greedy

import kotlin.test.Test
import kotlin.test.junit5.JUnit5Asserter.assertEquals

class LeetCode1702Test {

    @Test
    fun testOne() {
        val binary = "000110"
        val expected = "111011"
        val res = LeetCode1702().maximumBinaryString(binary)
        assertEquals("修改后的最大二进制字符串测试用例1", expected, res)
    }

    @Test
    fun testTwo() {
        val binary = "01"
        val expected = "01"
        val res = LeetCode1702().maximumBinaryString(binary)
        assertEquals("修改后的最大二进制字符串测试用例2", expected, res)
    }
}