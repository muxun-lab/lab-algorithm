package org.muxun.algorithm.leetcode.java.node;

/**
 * 第237题：删除链表中的节点
 * @author 慕勋
 * @date 2019-08-27
 */
public class RemoveNode {

    public void deleteNode(ListNode node) {
        // 此题需要注意审题
        // 直接将当前节点替换为下个节点，当前节点的下一个节点替换为下下个节点
        node.val = node.next.val;
        node.next = node.next.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
