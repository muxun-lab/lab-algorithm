package org.muxun.algorithm.leetcode.java.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * @author 慕勋
 * @created 2020-01-29
 */
public class MajorityElement {

    /**
     * 利用HashMap key-value的特性，存储每个值出现的次数，空间复杂度较高
     * @param nums 给定的含有多数元素的数组
     * @return 多数元素
     */
    public int majorityElement(int[] nums) {
        int watermark = nums.length / 2;
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int num : nums) {
            if (resultMap.containsKey(num)) {
                resultMap.put(num, resultMap.get(num) + 1);
            } else {
                resultMap.put(num, 1);
            }
            if (resultMap.get(num) > watermark) {
                return num;
            }
        }
        return -1;
    }

    /**
     * 投票法
     * 首先开始计数，出现+1，未出现-1，归0则遗忘之前的数
     * 最后没有归0的数则是多数元素
     * @param nums 给定的含有多数元素的数组
     * @return 多数元素
     */
    public int majorityElementUpgrade(int[] nums) {
        int count = 0;
        int temp = 0;
        for (int num : nums) {
            if (count == 0) {
                temp = num;
            }
            count += num == temp ? 1 : -1;
        }
        return temp;
    }
}
