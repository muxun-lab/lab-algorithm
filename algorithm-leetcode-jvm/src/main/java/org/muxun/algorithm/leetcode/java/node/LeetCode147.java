package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号: 147
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/insertion-sort-list">对链表进入插入排序</a>
 * <p>
 * 详情: 给定单个链表的头 head ，使用 插入排序 对链表进行排序，并返回 排序后链表的头 。
 * 插入排序 算法的步骤:
 * 1. 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
 * 2. 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
 * 3. 重复直到所有输入数据插入完为止。
 * @author 慕勋
 * @created 2024/3/2
 */
public class LeetCode147 {

    /**
     * 思路: 插入
     * @param head 头节点
     * @return 插入排序后的头节点
     */
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode resNode = new ListNode(0);
        resNode.next = head;
        ListNode sorted = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (sorted.val <= cur.val) {
                sorted = sorted.next;
                cur = sorted.next;
            } else {
                ListNode prev = resNode;
                while (prev.next.val <= cur.val) {
                    prev = prev.next;
                }
                sorted.next = cur.next;
                cur.next = prev.next;
                prev.next = cur;
                cur = sorted.next;
            }
        }
        return resNode.next;
    }
}
