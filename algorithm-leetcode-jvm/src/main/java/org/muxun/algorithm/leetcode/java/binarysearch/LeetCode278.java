package org.muxun.algorithm.leetcode.java.binarysearch;

/**
 * 题号: 278
 * 题目: 第一个错误版本
 * 链接: <a href="https://leetcode.cn/problems/first-bad-version">第一个错误版本</a>
 * 详情: 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 * @author 慕勋
 * @created 2024/2/13
 */
public class LeetCode278 {

    /**
     * 思路: 二分查找
     * @param n 版本数量
     * @return 起始错误版本数
     */
    public int firstBadVersion(int n, int res) {
        int left = 1;
        int right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(res, middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int target, int x) {
        return x == target;
    }
}
