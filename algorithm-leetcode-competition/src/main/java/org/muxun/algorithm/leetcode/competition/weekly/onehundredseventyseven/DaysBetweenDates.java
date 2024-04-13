package org.muxun.algorithm.leetcode.competition.weekly.onehundredseventyseven;

/**
 * 题号：1360
 * 题目：日期之间隔几天
 * 详情：请你编写一个程序来计算两个日期之间隔了多少天
 * 日期以字符串形式给出，格式为 YYYY-MM-DD
 * <p>
 * 提示：
 * * 给定的日期是 1971 年到 2100 年之间的有效日期
 * @author sunshine
 * @created 2020-02-23
 */
public class DaysBetweenDates {

    int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int daysBetweenDates(String date1, String date2) {
        int count = 0;
        int daysInYear = 365;

        int[] date1Array = parse(date1);
        int[] date2Array = parse(date2);
        // 计算差几年
        int year = Math.abs(date1Array[0] - date2Array[0]);
        if (year > 1) {
            count += (year - 1) * daysInYear;
            count += date1Array[0] < date2Array[0] ? increaseLeapYears(date1Array, date2Array) : increaseLeapYears(date2Array, date1Array);
            // 计算差一年的差值
            count += date1Array[0] < date2Array[0] ? computeDaysInContiguous(date1Array, date2Array) : computeDaysInContiguous(date2Array, date1Array);
            // 相差一年
        } else if (year == 1) {
            // 相差一年，为date1补齐今年，date2已有天数
            count = date1Array[0] < date2Array[0] ? computeDaysInContiguous(date1Array, date2Array) : computeDaysInContiguous(date2Array, date1Array);
            count += date1Array[0] < date2Array[0] ? increaseLeapYear(date1Array, date2Array) : increaseLeapYear(date2Array, date1Array);
        } else {
            // 同一年，两个日期过去的天数相减
            int day1Count = 0;
            for (int i = date1Array[1] - 1; i >= 0; i--) {
                day1Count += days[i];
            }
            day1Count -= days[date1Array[1] - 1] - date1Array[2];
            int day2Count = 0;
            for (int i = date2Array[1] - 1; i >= 0; i--) {
                day2Count += days[i];
            }
            day2Count -= days[date2Array[1] - 1] - date2Array[2];
            count = Math.abs(day1Count - day2Count);
            if (isLeapYear(date1Array[0]) && Math.min(date1Array[1], date2Array[1]) <= 2 && Math.max(date1Array[1], date2Array[1]) > 2) {
                count++;
            }
        }
        return count;
    }


    public int computeDaysInContiguous(int[] ints1, int[] ints2) {
        int count = 0;
        // 相差一年，为date1补齐今年，date2已有天数
        for (int i = ints1[1] - 1; i < days.length; i++) {
            count += days[i];
        }
        count -= ints1[2];
        for (int i = 0; i < ints2[1]; i++) {
            count += days[i];
        }
        count -= days[ints2[1] - 1] - ints2[2];
        return count;
    }

    public int increaseLeapYear(int[] ints1, int[] ints2) {
        int count = 0;
        if (isLeapYear(ints1[0]) && (ints1[1] < 2 || (ints1[1] == 2 && ints1[2] <= 28))) {
            count++;
        }
        if (isLeapYear(ints2[0]) && ints2[1] > 2) {
            count++;
        }
        return count;
    }

    public int increaseLeapYears(int[] ints1, int[] ints2) {
        int count = 0;
        int start = (ints1[1] < 2 || (ints1[1] == 2 && ints1[2] <= 28)) ? ints1[0] : ints1[0] + 1;
        int end = (ints2[1] < 2 || (ints2[1] == 2 && ints2[2] <= 28)) ? ints2[0] - 1 : ints2[0];
        // 计算闰年
        for (int i = start; i <= end; i++) {
            if (isLeapYear(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public int[] parse(String date) {
        String[] stringArray = date.split("-");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }
}
