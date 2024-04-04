package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 慕勋
 * @created 2020-02-14
 */
@DisplayName("删除链表的倒数第N个节点测试用例")
public class LeetCode19Test {

    @Test
    public void removeNthFromEndTestOne() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = new LeetCode19().removeNthFromEndByDoublePointer(head, 2);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        Assertions.assertIterableEquals(List.of(1, 2, 3, 5), resultList);
    }

    @Test
    public void removeNthFromEndTestTwo() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = new LeetCode19().removeNthFromEndByDoublePointer(head, 2);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        Assertions.assertIterableEquals(List.of(2), resultList);
    }

    @Test
    public void removeNthFromEndTestThree() {
        ListNode head = new ListNode(1);
        ListNode result = new LeetCode19().removeNthFromEndByDoublePointer(head, 1);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        Assertions.assertIterableEquals(List.of(), resultList);
    }

    @Test
    public void removeNthFromEndTestFour() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = new LeetCode19().removeNthFromEndByComputeLength(head, 2);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        Assertions.assertIterableEquals(List.of(1, 2, 3, 5), resultList);
    }

    @Test
    public void removeNthFromEndTestFive() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode result = new LeetCode19().removeNthFromEndByComputeLength(head, 2);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        Assertions.assertIterableEquals(List.of(2), resultList);
    }

    @Test
    public void removeNthFromEndTestSix() {
        ListNode head = new ListNode(1);
        ListNode result = new LeetCode19().removeNthFromEndByComputeLength(head, 1);
        List<Integer> resultList = new ArrayList<>();
        while (result != null) {
            resultList.add(result.val);
            result = result.next;
        }
        Assertions.assertIterableEquals(List.of(), resultList);
    }
}
