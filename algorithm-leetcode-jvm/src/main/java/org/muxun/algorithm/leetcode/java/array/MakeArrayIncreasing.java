package org.muxun.algorithm.leetcode.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题号：1187
 * 题目：使数组严格递增
 * 详情：给你两个整数数组 arr1 和 arr2，返回使 arr1 严格递增所需要的最小「操作」数（可能为 0）。
 * 每一步「操作」中，你可以分别从 arr1 和 arr2 中各选出一个索引，
 * 分别为 i 和 j，0 <= i < arr1.length 和 0 <= j < arr2.length，然后进行赋值运算 arr1[i] = arr2[j]。
 * 如果无法让 arr1 严格递增，请返回 -1。
 */
public class MakeArrayIncreasing {

    public static final int INF = 0x3f3f3f3f;

    /**
     * 思路：
     * 数组要求严格递增，所以数组中不存在相同的元素，可以先处理arr2中的相同元素
     * arr1长度为m，arr2长度为n，那么最大的替换次数为min(m, n)
     * 设dp[i][j]表示数组arr1中前i个数进行了j次替换后形成的严格递增子数组末尾元素的最小值
     * 当我们遍历arr1的第i个元素时，此时arr1[i]要么进行替换，要么进行保留：
     * * 此时如果arr1[i]进行保留，则arr[i]一定大于arr1[i-1]，也就是arr1[i] > dp[i-1][j]
     * * 此时如果arr[i]需要进行替换，则arr2[k] > dp[i-1][j-1]
     * 实际计算过程如下：
     * * 对arr2去掉重复的元素，并进行排序
     * * 计算前i个元素在满足j次替换时的最小元素：
     * * * 如果当前元素arr[i]大于dp[i][j-1]，此时dp[i][j]=min(arr1[i], dp[i,j])
     * * * 如果前i-1个元素可以满足j-1次替换后成为严格的递增数组，dp[i-1][j-1]!=INF，尝试在第j次替换屌arr1[i]，从arr2中查找严格大于dp[i-1][j-1]的 最小值 即可
     * @param arr1 数组1
     * @param arr2 数组2
     * @return 最小操作数
     */
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        int n = arr1.length;
        int m = arr2.length;
        int[][] dp = new int[n + 1][Math.min(m, n) + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
        }
        int prev = -1;
        List<Integer> list = new ArrayList<>();
        for (int num : arr2) {
            if (num != prev) {
                list.add(num);
                prev = num;
            }
        }
        dp[0][0] = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, m); j++) {
                // 如果当前元素大于当前序列的最后一个元素
                if (arr1[i - 1] > dp[i - 1][j]) {
                    dp[i][j] = arr1[i - 1];
                }
                if (j > 0 && dp[i - 1][j - 1] != INF) {
                    // 查找严格意义上大于dp[i-1][j-1]的最小元素
                    int index = binarySearch(list, j - 1, dp[i - 1][j - 1]);
                    if (index != list.size()) {
                        dp[i][j] = Math.min(dp[i][j], list.get(index));
                    }
                }
                if (i == n && dp[i][j] != INF) {
                    return j;
                }
            }
        }
        return -1;
    }

    public int binarySearch(List<Integer> list, int low, int target) {
        int high = list.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
