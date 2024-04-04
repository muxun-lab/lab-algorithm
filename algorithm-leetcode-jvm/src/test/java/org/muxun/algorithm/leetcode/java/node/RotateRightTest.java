package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-11
 */
@DisplayName("旋转链表单元测试")
public class RotateRightTest {

    @Test
    public void rotateRightTestOne() {
        ListNode result = new ListNode(4);
        result.next = new ListNode(5);
        result.next.next = new ListNode(1);
        result.next.next.next = new ListNode(2);
        result.next.next.next.next = new ListNode(3);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = new RotateRight().rotateRight(head, 2);
        while (head != null) {
            Assertions.assertEquals(head.val, result.val);
            head = head.next;
            result = result.next;
        }
    }

    @Test
    public void rotateRightTestTwo() {
        ListNode result = new ListNode(2);
        result.next = new ListNode(0);
        result.next.next = new ListNode(1);
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head = new RotateRight().rotateRight(head, 4);
        while (head != null) {
            Assertions.assertEquals(head.val, result.val);
            head = head.next;
            result = result.next;
        }
    }

    @Test
    public void rotateRightTestThree() {
        ListNode result = new ListNode(2);
        result.next = new ListNode(3);
        result.next.next = new ListNode(1);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head = new RotateRight().rotateRight(head, 2000000000);
        while (head != null) {
            Assertions.assertEquals(head.val, result.val);
            head = head.next;
            result = result.next;
        }
    }

    @Test
    public void rotateRightUpgradeTestOne() {
        ListNode result = new ListNode(4);
        result.next = new ListNode(5);
        result.next.next = new ListNode(1);
        result.next.next.next = new ListNode(2);
        result.next.next.next.next = new ListNode(3);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = new RotateRight().rotateRightUpgrade(head, 2);
        while (head != null) {
            Assertions.assertEquals(head.val, result.val);
            head = head.next;
            result = result.next;
        }
    }

    @Test
    public void rotateRightUpgradeTestTwo() {
        ListNode result = new ListNode(2);
        result.next = new ListNode(0);
        result.next.next = new ListNode(1);
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head = new RotateRight().rotateRightUpgrade(head, 4);
        while (head != null) {
            Assertions.assertEquals(head.val, result.val);
            head = head.next;
            result = result.next;
        }
    }

    @Test
    public void rotateRightUpgradeTestThree() {
        ListNode result = new ListNode(2);
        result.next = new ListNode(3);
        result.next.next = new ListNode(1);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head = new RotateRight().rotateRightUpgrade(head, 2000000000);
        while (head != null) {
            Assertions.assertEquals(head.val, result.val);
            head = head.next;
            result = result.next;
        }
    }
}
