package org.muxun.algorithm.leetcode.java.array;

/**
 * 题号：1013
 * 题目：将数组等分成和相等的三个部分
 * 详情：给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false
 * 形式上，如果可以找出索引 i+1 < j 且满足 
 * (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 
 * 就可以将数组三等分
 * <p>
 * 提示：
 * * 3 <= A.length <= 50000
 * * -10^4 <= A[i] <= 10^4
 * @author 慕勋
 * @created 2020-03-11
 */
public class CanThreePartsEqualSum {

    /**
     * 思路：三等分，必然是三的倍数，取三的倍数
     * @param A 给定的数组
     * @return 数组是否可以等分为和相同的三个部分
     */
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int s1 = 0;
        int flag = 0;
        for (int num : A) {
            s1 += num;
            if (s1 == sum / 3) {
                flag++;
                s1 = 0;
            }
        }
        return flag >= 3;
    }

    /**
     * 思路：双指针
     * @param A 给定的数组
     * @return 数组是否可以等分为和相同的三个部分
     */
    public boolean canThreePartsEqualSumDoublePointer(int[] A) {
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int left = 0;
        int leftSum = A[left];
        int right = A.length - 1;
        int rightSum = A[right];
        while (left + 1 < right) {
            if (leftSum == sum / 3 && rightSum == sum / 3) {
                return true;
            }
            if (leftSum != sum / 3) {
                leftSum += A[++left];
            }
            if (rightSum != sum / 3) {
                rightSum += A[--right];
            }
        }
        return false;
    }
}
