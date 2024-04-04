package org.muxun.algorithm.leetcode.java.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 题号：12
 * 题目：整数转罗马数字
 * 详情：
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。
 * 这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 * @author 慕勋
 * @created 2020-02-12
 */
public class IntToRoman {

    /**
     * 思路：遍历相减，处理特殊情况
     * 优化思路，将特出情况放入到字典表里，然后重构代码即可
     * @param num 给定的数字
     * @return 对应的罗马数字
     */
    public String intToRoman(int num) {
        Map<Integer, String> unitMap = new HashMap<>();
        unitMap.put(1, "I");
        unitMap.put(5, "V");
        unitMap.put(10, "X");
        unitMap.put(50, "L");
        unitMap.put(100, "C");
        unitMap.put(500, "D");
        unitMap.put(1000, "M");
        StringBuilder result = new StringBuilder();
        int number = 0;
        if (num / 1000 > 0) {
            for (int i = 0; i < num / 1000; i++) {
                result.append(unitMap.get(1000));
            }
        }
        num = num % 1000;
        if (num / 100 > 0) {
            number = num / 100;
            if (number < 4) {
                for (int i = 0; i < number; i++) {
                    result.append(unitMap.get(100));
                    num -= 100;
                }
            } else if (number == 4) {
                result.append(unitMap.get(100)).append(unitMap.get(500));
                num -= 400;
            } else if (number == 9) {
                result.append(unitMap.get(100)).append(unitMap.get(1000));
                num -= 900;
            } else {
                result.append(unitMap.get(500));
                num -= 500;
                for (int i = 0; i < number - 5; i++) {
                    result.append(unitMap.get(100));
                    num -= 100;
                }
            }
        }
        if (num / 10 > 0) {
            number = num / 10;
            if (number < 4) {
                for (int i = 0; i < number; i++) {
                    result.append(unitMap.get(10));
                    num -= 10;
                }
            } else if (number == 4) {
                result.append(unitMap.get(10)).append(unitMap.get(50));
                num -= 40;
            } else if (number == 9) {
                result.append(unitMap.get(10)).append(unitMap.get(100));
                num -= 90;
            } else {
                result.append(unitMap.get(50));
                num -= 50;
                for (int i = 0; i < number - 5; i++) {
                    result.append(unitMap.get(10));
                    num -= 10;
                }
            }
        }
        if (num > 0) {
            number = num;
            if (number < 4) {
                for (int i = 0; i < number; i++) {
                    result.append(unitMap.get(1));
                    num -= 1;
                }
            } else if (number == 4) {
                result.append(unitMap.get(1)).append(unitMap.get(5));
                num -= 4;
            } else if (number == 9) {
                result.append(unitMap.get(1)).append(unitMap.get(10));
                num -= 9;
            } else {
                result.append(unitMap.get(5));
                num -= 5;
                for (int i = 0; i < number - 5; i++) {
                    result.append(unitMap.get(1));
                    num -= 1;
                }
            }
        }
        return result.toString();
    }

    /**
     * 思路：贪心算法
     * @param num 给定的数字
     * @return 对应的罗马数字
     */
    public String intToRomanUpgrade(int num) {
        //用数组定义字典
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int value : values) {
            int number = num / value;
            if (number == 0) {
                continue;
            }
            for (int j = number; j > 0; j--) {
                result.append(value);
            }
            num -= number * value;
            if (num == 0) {
                break;
            }
        }
        return result.toString();
    }
}
