package org.muxun.algorithm.leetcode.competition.week.week.onehundredninety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.muxun.algorithm.leetcode.competition.weekly.onehundredninety.IsPrefixOfWord;

/**
 * @author sunshine
 * @created 2020-05-24
 */
@DisplayName("检查单词是否为句中其他单词的前缀单元测试")
public class IsPrefixOfWordTest {

    @Test
    public void isPrefixOfWordTestOne() {
        Assertions.assertEquals(4, new IsPrefixOfWord().isPrefixOfWord("i love eating burger", "burg"));
    }

    @Test
    public void isPrefixOfWordTestTwo() {
        Assertions.assertEquals(2, new IsPrefixOfWord().isPrefixOfWord("this problem is an easy problem", "pro"));
    }

    @Test
    public void isPrefixOfWordTestThree() {
        Assertions.assertEquals(-1, new IsPrefixOfWord().isPrefixOfWord("i am tired", "you"));
    }

    @Test
    public void isPrefixOfWordTestFour() {
        Assertions.assertEquals(4, new IsPrefixOfWord().isPrefixOfWord("i use triple pillow", "pill"));
    }

    @Test
    public void isPrefixOfWordTestFive() {
        Assertions.assertEquals(-1, new IsPrefixOfWord().isPrefixOfWord("hello from the other side", "they"));
    }
}
