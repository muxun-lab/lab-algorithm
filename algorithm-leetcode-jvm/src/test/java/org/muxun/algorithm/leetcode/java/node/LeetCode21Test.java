package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-05-13
 */
@DisplayName("合并两个有序链表单元测试")
public class LeetCode21Test {

    @Test
    public void mergeTwoListsTestOne() {
        ListNode requestOne = new ListNode(1);
        requestOne.next = new ListNode(2);
        requestOne.next.next = new ListNode(4);
        ListNode requestTwo = new ListNode(1);
        requestTwo.next = new ListNode(3);
        requestTwo.next.next = new ListNode(4);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(1);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(3);
        expected.next.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next.next = new ListNode(4);
        ListNode result = new LeetCode21().mergeTwoLists(requestOne, requestTwo);
        while (result != null) {
            Assertions.assertEquals(expected.val, result.val);
            result = result.next;
            expected = expected.next;
        }
    }
}
