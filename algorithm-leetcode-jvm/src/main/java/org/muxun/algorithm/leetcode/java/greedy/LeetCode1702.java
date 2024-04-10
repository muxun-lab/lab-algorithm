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
     * @param binary 二进制字符串
     * @return 调整后的最大二进制字符串
     */
    public String maximumBinaryString(String binary) {
        int n = binary.length();
        char[] arr = binary.toCharArray();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') {
                while (index <= i || (index < n && arr[index] == '1')) {
                    index++;
                }
                if (index < n) {
                    arr[index] = '1';
                    arr[i] = '1';
                    arr[i + 1] = '0';
                }
            }
        }
        return new String(arr);
    }
}
