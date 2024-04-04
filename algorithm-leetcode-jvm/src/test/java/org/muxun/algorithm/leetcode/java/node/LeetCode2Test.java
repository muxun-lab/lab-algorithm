package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-02-14
 */
@DisplayName("两数相加测试用例")
public class LeetCode2Test {

    @Test
    public void addTwoNumbersTestOne() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = new LeetCode2().addTwoNumbers(l1, l2);
        StringBuilder resultBuilder = new StringBuilder();
        while (result != null) {
            resultBuilder.append(result.val);
            result = result.next;
        }
        Assertions.assertEquals(807, Integer.parseInt(resultBuilder.reverse().toString()));
    }

    @Test
    public void addTwoNumbersTestTwo() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(1);
        ListNode result = new LeetCode2().addTwoNumbers(l1, l2);
        StringBuilder resultBuilder = new StringBuilder();
        while (result != null) {
            resultBuilder.append(result.val);
            result = result.next;
        }
        Assertions.assertEquals(1110, Integer.parseInt(resultBuilder.reverse().toString()));
    }

    @Test
    public void addTwoNumbersTestThree() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        ListNode result = new LeetCode2().addTwoNumbers(l1, l2);
        StringBuilder resultBuilder = new StringBuilder();
        while (result != null) {
            resultBuilder.append(result.val);
            result = result.next;
        }
        Assertions.assertEquals(1010, Integer.parseInt(resultBuilder.reverse().toString()));
    }
}
