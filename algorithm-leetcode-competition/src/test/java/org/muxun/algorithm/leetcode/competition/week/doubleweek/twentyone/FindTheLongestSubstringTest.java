package org.muxun.algorithm.leetcode.competition.week.doubleweek.twentyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.doubleweekly.twentyone.FindTheLongestSubstring;

/**
 * @author sunshine
 * @created 2020-03-07
 */
@DisplayName("每个元音包含偶数次的最长子字符串测试类")
public class FindTheLongestSubstringTest {

    @Test
    public void findTheLongestSubstringTestOne() {
        Assertions.assertEquals(6, new FindTheLongestSubstring().findTheLongestSubstring("bcbcbc"));
    }
}
