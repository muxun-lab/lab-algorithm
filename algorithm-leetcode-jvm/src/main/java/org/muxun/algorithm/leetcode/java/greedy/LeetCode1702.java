package org.muxun.algorithm.leetcode.java.greedy;

/**
 * 题号: 1702
 * <p>
 * 题目: <a href="https://leetcode.cn/problems/maximum-binary-string-after-change">修改后的最大二进制字符串</a>
 * <p>
 * 详情: 给你一个二进制字符串 binary ，它仅有 0 或者 1 组成。你可以使用下面的操作任意次对它进行修改：
 * <p>
 * <li> 操作 1 ：如果二进制串包含子字符串 "00" ，你可以用 "10" 将其替换。
 * <li> <li> 比方说， "00010" -> "10010"
 * <li> 操作 2 ：如果二进制串包含子字符串 "10" ，你可以用 "01" 将其替换。
 * <li> <li> 比方说， "00010" -> "00001"
 * 请你返回执行上述操作任意次以后能得到的 最大二进制字符串 。
 * <p>
 * 如果二进制字符串 x 对应的十进制数字大于二进制字符串 y 对应的十进制数字，那么我们称二进制字符串 x 大于二进制字符串 y 。
 * @author 慕勋
 * @created 2024-04-10
 */
public class LeetCode1702 {

    /**
     * 思路: 贪心算法
     * 根据灵神的思路：
     * 1. 结果不会包含两个连续的00，因为和操作1互斥，可以变成10从而得到更大的答案
     * 2. 结果中至多含有一个0，因为和操作2互斥，我们可以通过移位将右边的0移动到左边的0的位置，然后通过操作1变成更大的数
     * 所以解决问题的思路就在于，至多会出现一个0，所以我们可以将右边的0移到左边0的位置，然后进行操作1，把数变得更大
     * @param binary 二进制字符串
     * @return 调整后的最大二进制字符串
     */
    public String maximumBinaryString(String binary) {
        int index = binary.indexOf('0');
        // 证明全是1
        if (index < 0) {
            return binary;
        }
        int n = binary.length();
        char[] arr = binary.toCharArray();
        int count = 0;
        index++;
        while (index < n) {
            count += arr[index] - '0';
            index++;
        }
        return "1".repeat(n - count - 1) + "0" + "1".repeat(count);
    }
}
