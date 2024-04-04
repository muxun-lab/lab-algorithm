package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2020/5/12
 */
@DisplayName("反转链表单元测试")
public class LeetCode206Test {

    @Test
    public void testReverseListTestOne() {
        ListNode expected = new ListNode(5);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(1);
        ListNode request = new ListNode(1);
        request.next = new ListNode(2);
        request.next.next = new ListNode(3);
        request.next.next.next = new ListNode(4);
        request.next.next.next.next = new ListNode(5);
        ListNode result = new LeetCode206().reverseList(request);
        while (result != null) {
            Assertions.assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
    }

    @Test
    public void testReverseListRecursionTestOne() {
        ListNode expected = new ListNode(5);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(1);
        ListNode request = new ListNode(1);
        request.next = new ListNode(2);
        request.next.next = new ListNode(3);
        request.next.next.next = new ListNode(4);
        request.next.next.next.next = new ListNode(5);
        ListNode result = new LeetCode206().reverseListByRecursion(request);
        while (result != null) {
            Assertions.assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
    }
}
