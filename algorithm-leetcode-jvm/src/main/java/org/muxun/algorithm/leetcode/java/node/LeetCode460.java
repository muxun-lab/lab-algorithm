package org.muxun.algorithm.leetcode.java.node;

import java.util.HashMap;

/**
 * 题号: 460
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/lfu-cache">LFU缓存</a>
 * <p>
 * 详情: 实现 LFUCache 类：
 * <p>
 * <li>LFUCache(int capacity) - 用数据结构的容量 capacity 初始化对象
 * <li>int get(int key) - 如果键 key 存在于缓存中，则获取键的值，否则返回 -1 。
 * <li>void put(int key, int value) - 如果键 key 已存在，则变更其值；如果键不存在，请插入键值对。当缓存达到其容量 capacity 时，则应该在插入新项之前，移除最不经常使用的项。在此问题中，当存在平局（即两个或更多个键具有相同使用频率）时，应该去除 最久未使用 的键。
 * 为了确定最不常使用的键，可以为缓存中的每个键维护一个 使用计数器 。使用计数最小的键是最久未使用的键。
 * <p>
 * 当一个键首次插入到缓存中时，它的使用计数器被设置为 1 (由于 put 操作)。对缓存中的键执行 get 或 put 操作，使用计数器的值将会递增。
 * <p>
 * 函数 get 和 put 必须以 O(1) 的平均时间复杂度运行。
 * @author 慕勋
 * @created 2024-03-17
 */
public class LeetCode460 {

    private final int size;
    private final HashMap<Integer, FreqNode> keyNodeMap;
    private final HashMap<Integer, FreqNode> freqNodeMap;
    private int minFreq;

    public LeetCode460(int capacity) {
        this.size = capacity;
        this.keyNodeMap = new HashMap<>();
        this.freqNodeMap = new HashMap<>();
        this.minFreq = 0;
    }

    public int get(int key) {
        FreqNode node = getNode(key);
        return node != null ? node.value : -1;
    }

    public void put(int key, int value) {
        FreqNode node = getNode(key);
        if (node != null) {
            node.value = value;
            return;
        }
        if (keyNodeMap.size() == size) {
            FreqNode dummy = freqNodeMap.get(minFreq);
            FreqNode backNode = dummy.prev;
            keyNodeMap.remove(backNode.key);
            remove(backNode);
            if (dummy.prev == dummy) {
                freqNodeMap.remove(minFreq);
            }
        }
        node = new FreqNode(key, value);
        keyNodeMap.put(key, node);
        pushFront(1, node);
        minFreq = 1;
    }

    private FreqNode getNode(int key) {
        if (!keyNodeMap.containsKey(key)) {
            return null;
        }
        FreqNode node = keyNodeMap.get(key);
        remove(node);
        FreqNode dummy = freqNodeMap.get(node.freq);
        if (dummy.prev == dummy) {
            freqNodeMap.remove(node.freq);
            if (minFreq == node.freq) {
                minFreq++;
            }
        }
        pushFront(++node.freq, node);
        return node;
    }

    private void remove(FreqNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private FreqNode newList() {
        FreqNode dummy = new FreqNode(0, 0);
        dummy.prev = dummy;
        dummy.next = dummy;
        return dummy;
    }

    private void pushFront(int freq, FreqNode node) {
        FreqNode dummy = freqNodeMap.computeIfAbsent(freq, k -> newList());
        node.prev = dummy;
        node.next = dummy.next;
        node.prev.next = node;
        node.next.prev = node;
    }

    private static class FreqNode {
        int key;
        int value;
        int freq = 1;
        FreqNode prev;
        FreqNode next;

        FreqNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
