package org.muxun.algorithm.leetcode.java.design;

import java.util.HashMap;
import java.util.Map;

/**
 * 题号: 2671
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/frequency-tracker">频率跟踪器</a>
 * <p>
 * 详情: 请你设计并实现一个能够对其中的值进行跟踪的数据结构，并支持对频率相关查询进行应答。
 * <p>
 * 实现 FrequencyTracker 类：
 * <p>
 * <li> FrequencyTracker()：使用一个空数组初始化 FrequencyTracker 对象。
 * <li> void add(int number)：添加一个 number 到数据结构中。
 * <li> void deleteOne(int number)：从数据结构中删除一个 number 。数据结构 可能不包含 number ，在这种情况下不删除任何内容。
 * <li> bool hasFrequency(int frequency): 如果数据结构中存在出现 frequency 次的数字，则返回 true，否则返回 false。
 * @author 慕勋
 * @created 2024-03-21
 */
public class LeetCode2671 {

    private final Map<Integer, Integer> countMap = new HashMap<>();
    private final Map<Integer, Integer> freqMap = new HashMap<>();

    public LeetCode2671() {

    }

    public void add(int number) {
        update(number, 1);
    }

    public void deleteOne(int number) {
        if (countMap.getOrDefault(number, 0) > 0) {
            update(number, -1);
        }
    }

    public boolean hasFrequency(int frequency) {
        return freqMap.getOrDefault(frequency, 0) > 0;
    }

    private void update(int num, int count) {
        int c = countMap.merge(num, count, Integer::sum);
        freqMap.merge(c - count, -1, Integer::sum);
        freqMap.merge(c, 1, Integer::sum);
    }
}
