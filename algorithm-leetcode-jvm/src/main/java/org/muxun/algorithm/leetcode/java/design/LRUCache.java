package org.muxun.algorithm.leetcode.java.design;

import java.util.HashMap;

/**
 * 题号：146
 * 题目：LRU缓存机制
 * 题链：https://leetcode-cn.com/problems/lru-cache/
 * 详情：运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制
 * @author 慕勋
 * @created 2020-05-15
 */
public class LRUCache {

    private final int capcity;

    private int count;

    private final HashMap<Integer, LRUNode> lruMap;

    private final LRUNode head;

    private final LRUNode tail;

    /**
     * 思路：使用HashMap进行get操作
     * 在取出最久没有使用的缓存对象时，使用链表尾部移除的操作
     * 使用链表来维护节点使用的顺序
     * @param capacity 缓存容量
     */
    public LRUCache(int capacity) {
        this.capcity = capacity;
        this.lruMap = new HashMap<>();
        this.head = new LRUNode(0, 0);
        this.tail = new LRUNode(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    /**
     * 获取值
     * @param key 指定key
     * @return key对应的值
     */
    public int get(int key) {
        if (!this.lruMap.containsKey(key)) {
            return -1;
        }
        int value = this.lruMap.get(key).value;
        // 获取key，证明使用了key，则需要置为最新使用的key，需要重新插入到链表的头部
        put(key, value);
        return value;
    }

    /**
     * 更新至
     * @param key   指定key
     * @param value 指定value
     */
    public void put(int key, int value) {
        // 需要插入的节点
        LRUNode insertNode = new LRUNode(key, value);
        if (this.lruMap.containsKey(key)) {
            // 节点需要更新，先移除节点
            removeNode(this.lruMap.get(key));
        } else {
            if (count == this.capcity) {
                // 如果超过了缓存容量，则需要移除最久没有使用的节点
                LRUNode lruNode = removeLast();
                this.lruMap.remove(lruNode.key);
            }
        }
        // 更新节点，置为最新使用的key，需要重新插入到链表的头部
        this.lruMap.put(key, insertNode);
        addFirst(insertNode);
    }

    /**
     * 将节点插入到链表的头部
     * 用于节点更新
     * @param insertNode 插入的节点
     */
    private void addFirst(LRUNode insertNode) {
        // 添加到链表的头部
        insertNode.prev = head;
        insertNode.next = head.next;
        head.next.prev = insertNode;
        head.next = insertNode;
        count++;
    }

    /**
     * 删除节点
     * @param removedNode 需要删除的节点，通过HashMap进行获取
     */
    private void removeNode(LRUNode removedNode) {
        // 删除节点，节点需要通过HashMap进行获取，避免遍历
        removedNode.prev.next = removedNode.next;
        removedNode.next.prev = removedNode.prev;
        this.count--;
    }

    /**
     * @return 最久没有使用的节点
     */
    private LRUNode removeLast() {
        // 移除最久没有使用的节点
        if (tail.prev == head) {
            return null;
        }
        LRUNode lastNode = tail.prev;
        removeNode(lastNode);
        return lastNode;
    }

    /**
     * @return 缓存数据量
     */
    public int size() {
        return this.count;
    }

    private class LRUNode {

        private int key;

        private int value;

        private LRUNode prev;

        private LRUNode next;

        public LRUNode() {

        }

        public LRUNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
