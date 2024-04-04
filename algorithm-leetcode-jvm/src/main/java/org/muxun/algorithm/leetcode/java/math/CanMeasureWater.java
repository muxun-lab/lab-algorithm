package org.muxun.algorithm.leetcode.java.math;

import java.util.*;

/**
 * 题号：365
 * 题目：水壶问题
 * 详情：有两个容量分别为x升和y升的水壶以及无限多的水
 * 请判断能否通过使用这两个水壶，从而可以得到恰好z升的水？
 * 如果可以，最后请用以上水壶中的一或两个来盛放取得的z升水
 * 允许：
 * * 装满任意一个水壶
 * * 清空任意一个水壶
 * * 从一个水壶向另外一个水壶倒水，直到装满或者倒空
 * @author 慕勋
 * @created 2020-03-21
 */
public class CanMeasureWater {

    /**
     * 思路：深度优先遍历
     * 我们需要做如下的操作：
     * * 把X壶的水灌进Y壶，直至灌满或倒空
     * * 把Y壶的谁灌进X壶，直至灌满或倒空
     * * 把X壶灌满
     * * 把Y壶灌满
     * * 把X壶倒空
     * * 把Y壶倒空
     * 每一步，会尝试所有的可能，递归进行下去
     * @param x 水壶X的容量
     * @param y 水壶Y的容量
     * @param z 需要的水容量
     * @return 是否可以乘出给定的水容量
     */
    public boolean canMeasureWater(int x, int y, int z) {
        // 存储所有可能的状态
        LinkedList<int[]> stack = new LinkedList<>();
        // 存储处理过的状态
        Set<Map.Entry<Integer, Integer>> seen = new HashSet<>();
        stack.push(new int[]{0, 0});
        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            // 命中条件
            if (current[0] == z || current[1] == z || current[0] + current[1] == z) {
                return true;
            }
            Map.Entry<Integer, Integer> currentEntry = new AbstractMap.SimpleEntry<>(current[0], current[1]);
            if (seen.contains(currentEntry)) {
                // 之前处理过，继续
                continue;
            }
            // 先将处理的状态放入到处理过的集合中
            seen.add(currentEntry);
            // 分别将X、Y倒空
            stack.push(new int[]{0, current[1]});
            stack.push(new int[]{current[0], 0});
            // 分别将X、Y加满
            stack.push(new int[]{x, current[1]});
            stack.push(new int[]{current[0], y});
            // 将X导入Y中
            if (current[0] + current[1] < y) {
                // 此时不会倒满
                stack.push(new int[]{0, current[0] + current[1]});
            } else {
                stack.push(new int[]{current[0] - (y - current[1]), y});
            }
            // 将Y倒入X中
            if (current[0] + current[1] < x) {
                // 此时不会倒满
                stack.push(new int[]{current[0] + current[1], 0});
            } else {
                stack.push(new int[]{x, current[1] - (x - current[0])});
            }
        }
        return false;
    }

    /**
     * 思路：贝祖定律
     * * 不可能同时存在两个不满的水桶
     * * 给不满的水桶加水是没有意义的
     * * 把不满的水桶里的水倒掉是没有意义的
     * 所以题目可以化解为：ax + by = z
     * 贝祖定律告诉我们，a,b是x，y的最大公约数的倍数时，有解
     * @param x 水壶X的容量
     * @param y 水壶Y的容量
     * @param z 需要的水容量
     * @return 是否可以乘出给定的水容量
     */
    public boolean canMeasureWaterGCD(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        if (x == 0 || y == 0) {
            return z == 0 || x + y == z;
        }
        return z % gcd(x, y) == 0;
    }

    private int gcd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }
}

