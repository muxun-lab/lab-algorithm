package org.muxun.algorithm.leetcode.java.binarysearch;

/**
 * 题号：374
 * 题目：猜数字大小
 * 详情：
 * 我们正在玩一个猜数字游戏，游戏规则如下：
 * 我从1到n选择一个数字，你需要猜我选择了哪个数字
 * 每次你猜错了，我会告诉你这个数字是大了还是小了
 * 你调用一个预先定义好的接口guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）
 * @author 慕勋
 * @created 2020-03-16
 */
public class GuessNumber {

    private final int target;

    public GuessNumber(int target) {
        this.target = target;
    }

    /**
     * 思路：二分查找
     * 需要考虑整型移除问题
     * @param n 需要猜测的数字
     * @return 猜中的数字
     */
    public int guessNumber(int n) {
        int left = 0, right = n;
        while (left < right) {
            // 此题重点，需要考虑整型移除问题
            // 错误二分写法：(left + right) / 2
            // 标准二分写法：left + (right - left) / 2
            // 装逼二分写法：(left + right) >>> 1
            int middle = (left + right) >>> 1;
            int guess = guess(middle);
            if (guess == 0) {
                return middle;
            } else if (guess == 1) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }

    private int guess(int num) {
        return Integer.compare(this.target, num);
    }
}
