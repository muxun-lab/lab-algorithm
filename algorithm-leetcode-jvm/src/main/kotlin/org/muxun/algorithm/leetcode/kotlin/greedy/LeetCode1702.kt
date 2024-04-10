package org.muxun.algorithm.leetcode.kotlin.greedy

class LeetCode1702 {

    fun maximumBinaryString(binary: String): String {
        var index = binary.indexOf('0')
        if (index < 0) {
            return binary
        }
        val n = binary.length
        val arr = binary.toCharArray()
        var count = 0
        index++
        while (index < n) {
            count += arr[index++] - '0'
        }
        return "1".repeat(n - count - 1) + "0" + "1".repeat(count)
    }
}