package org.muxun.algorithm.leetcode.java.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-17
 */
@DisplayName("实现 Trie (前缀树)测试用例")
public class LeetCode208Test {

    @Test
    public void testOne() {
        LeetCode208 trie = new LeetCode208();
        trie.insert("apple");
        boolean expected1 = true;
        boolean res1 = trie.search("apple");
        boolean expected2 = false;
        boolean res2 = trie.search("app");
        boolean expected3 = true;
        boolean res3 = trie.startsWith("app");
        trie.insert("app");
        boolean expected4 = true;
        boolean res4 = trie.search("app");
        Assertions.assertEquals(expected1, res1);
        Assertions.assertEquals(expected2, res2);
        Assertions.assertEquals(expected3, res3);
        Assertions.assertEquals(expected4, res4);
    }
}
