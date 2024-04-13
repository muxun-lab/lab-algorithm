package org.muxun.algorithm.leetcode.competition.week.doubleweek.twentyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.twentyone.SortString;

/**
 * @author sunshine
 * @created 2020-03-07
 */
@DisplayName("上升下降字符串测试类")
public class SortStringTest {

    @Test
    public void sortStringTestOne() {
        Assertions.assertEquals("abccbaabccba", new SortString().sortString("aaaabbbbcccc"));
    }

    @Test
    public void sortStringTestTwo() {
        Assertions.assertEquals("art", new SortString().sortString("rat"));
    }


    @Test
    public void sortStringTestThree() {
        Assertions.assertEquals("cdelotee", new SortString().sortString("leetcode"));
    }

    @Test
    public void sortStringTestFour() {
        Assertions.assertEquals("ggggggg", new SortString().sortString("ggggggg"));
    }

    @Test
    public void sortStringTestFive() {
        Assertions.assertEquals("ops", new SortString().sortString("spo"));
    }
}
