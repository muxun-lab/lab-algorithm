package org.muxun.algorithm.leetcode.java.string;

/**
 * 题号: 299
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/bulls-and-cows">猜数字游戏</a>
 * <p>
 * 详情: 你在和朋友一起玩 猜数字（Bulls and Cows）游戏，该游戏规则如下：
 * <p>
 * 写出一个秘密数字，并请朋友猜这个数字是多少。朋友每猜测一次，你就会给他一个包含下述信息的提示：
 * * 猜测数字中有多少位属于数字和确切位置都猜对了（称为 "Bulls"，公牛），
 * * 有多少位属于数字猜对了但是位置不对（称为 "Cows"，奶牛）。
 * 也就是说，这次猜测中有多少位非公牛数字可以通过重新排列转换成公牛数字。
 * <p>
 * 给你一个秘密数字 secret 和朋友猜测的数字 guess ，请你返回对朋友这次猜测的提示。
 * <p>
 * 提示的格式为 "xAyB" ，x 是公牛个数， y 是奶牛个数，A 表示公牛，B 表示奶牛。
 * <p>
 * 请注意秘密数字和朋友猜测的数字都可能含有重复数字。
 * @author 慕勋
 * @created 2024-03-10
 */
public class LeetCode299 {

    /**
     * 思路: 如果位数相等，判定是公牛计数
     * 如果位数不等，则加入到数字计数中，然后统一计算
     * @param secret 谜语
     * @param guess  猜测数字
     * @return 谜底
     */
    public String getHint(String secret, String guess) {
        int bullCount = 0;
        int s = secret.length();
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        for (int i = 0; i < s; i++) {
            char x = secret.charAt(i);
            char y = guess.charAt(i);
            if (x == y) {
                bullCount++;
            } else {
                secretCount[x - '0']++;
                guessCount[y - '0']++;
            }
        }
        int cowCount = 0;
        for (int i = 0; i < 10; i++) {
            cowCount += Math.min(secretCount[i], guessCount[i]);
        }
        return bullCount + "A" + cowCount + "B";
    }
}
