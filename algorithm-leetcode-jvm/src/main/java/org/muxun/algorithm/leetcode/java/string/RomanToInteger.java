package org.muxun.algorithm.leetcode.java.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/**
 * 题号：13
 * 题目：罗马数字转整数
 * 题链：https://leetcode-cn.com/problems/roman-to-integer/
 * 详情：罗马数字包含以下七种字符: I， V， X， L，C，D 和 M
 * * I             1
 * * V             5
 * * X             10
 * * L             50
 * * C             100
 * * D             500
 * * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV
 * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4
 * 同样地，数字 9 表示为 IX
 * 这个特殊的规则只适用于以下六种情况：
 * * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * @author 慕勋
 * @date 2020/6/10
 */
public class RomanToInteger {

    /**
     * 思路：哈希算法
     * @param s 罗马数字字符串
     * @return 转换后的整数
     */
    public int romanToInt(String s) {
        if (Objects.isNull(s) && s.length() <= 0) {
            return 0;
        }
        HashMap<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        romanMap.put("IX", 9);
        romanMap.put("IV", 4);
        romanMap.put("XL", 40);
        romanMap.put("XC", 90);
        romanMap.put("CD", 400);
        romanMap.put("CM", 900);
        HashSet<String> prefixRomanSet = new HashSet<>();
        prefixRomanSet.add("I");
        prefixRomanSet.add("X");
        prefixRomanSet.add("C");
        HashSet<String> prefixAllRomanSet = new HashSet<>();
        prefixAllRomanSet.add("IV");
        prefixAllRomanSet.add("IX");
        prefixAllRomanSet.add("XL");
        prefixAllRomanSet.add("XC");
        prefixAllRomanSet.add("CD");
        prefixAllRomanSet.add("CM");
        int result = 0;
        int index = 0;
        while (index < s.length()) {
            String current = String.valueOf(s.charAt(index));
            if (prefixRomanSet.contains(current) && index < s.length() - 1) {
                if (prefixAllRomanSet.contains(s.substring(index, index + 2))) {
                    current = s.substring(index, index + 2);
                    index++;
                }
            }
            result += romanMap.get(current);
            index++;
        }
        return result;
    }

    /**
     * 思路：哈希算法的简化
     * @param s 罗马数字字符串
     * @return 转换后的整数
     */
    public int romanToIntSimplify(String s) {
        if (Objects.isNull(s) && s.length() <= 0) {
            return 0;
        }
        HashMap<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        romanMap.put("IX", 9);
        romanMap.put("IV", 4);
        romanMap.put("XL", 40);
        romanMap.put("XC", 90);
        romanMap.put("CD", 400);
        romanMap.put("CM", 900);
        int result = 0;
        for (int i = 0; i < s.length(); ) {
            if (i + 1 < s.length() && romanMap.containsKey(s.substring(i, i + 2))) {
                result += romanMap.get(s.substring(i, i + 2));
                i += 2;
            } else {
                result += romanMap.get(s.substring(i, i + 1));
                i++;
            }
        }
        return result;
    }
}
