package org.muxun.algorithm.leetcode.competition.week.week.onehundredeightyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredeightyone.LongestPrefix;

/**
 * @author sunshine
 * @created 2020-03-22
 */
@DisplayName("最长快乐前缀单元测试")
public class LongestPrefixTest {

    @Test
    public void longestPrefixTestOne() {
        Assertions.assertEquals("l", new LongestPrefix().longestPrefix("level"));
    }

    @Test
    public void longestPrefixTestTwo() {
        Assertions.assertEquals("abab", new LongestPrefix().longestPrefix("ababab"));
    }

    @Test
    public void longestPrefixTestThree() {
        Assertions.assertEquals("leet", new LongestPrefix().longestPrefix("leetcodeleet"));
    }

    @Test
    public void longestPrefixTestFour() {
        Assertions.assertEquals("", new LongestPrefix().longestPrefix("a"));
    }

    @Test
    public void longestPrefixOptimizeTestOne() {
        Assertions.assertEquals("l", new LongestPrefix().longestPrefixOptimize("level"));
    }

    @Test
    public void longestPrefixOptimizeTestTwo() {
        Assertions.assertEquals("abab", new LongestPrefix().longestPrefixOptimize("ababab"));
    }

    @Test
    public void longestPrefixOptimizeTestThree() {
        Assertions.assertEquals("leet", new LongestPrefix().longestPrefixOptimize("leetcodeleet"));
    }

    @Test
    public void longestPrefixOptimizeTestFour() {
        Assertions.assertEquals("", new LongestPrefix().longestPrefixOptimize("a"));
    }

    @Test
    public void longestPrefixHashTestOne() {
        Assertions.assertEquals("l", new LongestPrefix().longestPrefixOptimize("level"));
    }

    @Test
    public void longestPrefixHashTestTwo() {
        Assertions.assertEquals("abab", new LongestPrefix().longestPrefixHash("ababab"));
    }

    @Test
    public void longestPrefixHashTestThree() {
        Assertions.assertEquals("leet", new LongestPrefix().longestPrefixHash("leetcodeleet"));
    }

    @Test
    public void longestPrefixHashTestFour() {
        Assertions.assertEquals("", new LongestPrefix().longestPrefixHash("a"));
    }
}
