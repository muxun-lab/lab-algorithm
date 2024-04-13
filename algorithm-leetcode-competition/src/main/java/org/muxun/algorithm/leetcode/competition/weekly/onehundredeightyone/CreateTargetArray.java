package org.muxun.algorithm.leetcode.competition.weekly.onehundredeightyone;

import java.util.LinkedList;

/**
 * 题号：5364
 * 题目：按既定数组顺序创建目标数组
 * 详情：给你两个整数数组nums和index，你需要按照以下规则创建目标数组：
 * * 目标数组target最初为空。
 * * 按从左到右的顺序依次读取nums[i]和index[i]，在target数组中的下标index[i]处插入值nums[i]。
 * * 重复上一步，直到在nums和index中都没有要读取的元素。
 * 请你返回目标数组
 * 题目保证数字插入位置总是存在
 * @author sunshine
 * @created 2020-03-22
 */
public class CreateTargetArray {

    /**
     * 思路：链表特性，直接解决
     * @param nums  插入目标数组的数
     * @param index 插入目标数组的索引
     * @return 含有目标值的目标数组
     */
    public int[] createTargetArray(int[] nums, int[] index) {
        int m = nums.length;
        LinkedList<Integer> resultList = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            resultList.add(index[i], nums[i]);
        }
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
