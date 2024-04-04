package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * <p>
 * 链接:
 * <p>
 * 详情:
 * @author 慕勋
 * @created 2024/3/3
 */
@DisplayName("对链表进入插入排序测试用例")
public class LeetCode147Test {

    @Test
    public void testOne() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        ListNode resNode = new LeetCode147().insertionSortList(head);
        while (resNode != null) {
            Assertions.assertEquals(expected.val, resNode.val);
            expected = expected.next;
            resNode = resNode.next;
        }
    }

    @Test
    public void testTwo() {
        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);
        ListNode expected = new ListNode(-1);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);
        ListNode resNode = new LeetCode147().insertionSortList(head);
        while (resNode != null) {
            Assertions.assertEquals(expected.val, resNode.val);
            expected = expected.next;
            resNode = resNode.next;
        }
    }
}
