package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 208
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/implement-trie-prefix-tree">实现 Trie (前缀树)</a>
 * <p>
 * 详情: Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼写检查。
 * <p>
 * 请你实现 Trie 类：
 * <p>
 * Trie() 初始化前缀树对象。
 * <li>void insert(String word) 向前缀树中插入字符串 word 。
 * <li>boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
 * <li>boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false 。
 * @author 慕勋
 * @created 2024-03-17
 */
public class LeetCode208 {

    private final LeetCode208[] children;
    private boolean isEnd;

    public LeetCode208() {
        this.children = new LeetCode208[26];
        this.isEnd = false;
    }

    public void insert(String word) {
        LeetCode208 node = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new LeetCode208();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        LeetCode208 node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private LeetCode208 searchPrefix(String prefix) {
        LeetCode208 node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}
