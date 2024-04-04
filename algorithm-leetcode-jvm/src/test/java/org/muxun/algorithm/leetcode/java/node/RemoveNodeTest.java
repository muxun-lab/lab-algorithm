package org.muxun.algorithm.leetcode.java.node;

import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @date 2019-08-27
 */
public class RemoveNodeTest {

    @Test
    public void testOne() {
        RemoveNode.ListNode header = new RemoveNode.ListNode(4);
        RemoveNode.ListNode first = header;
        header.next = new RemoveNode.ListNode(5);
        header.next.next = new RemoveNode.ListNode(1);
        header.next.next.next = new RemoveNode.ListNode(9);
        new RemoveNode().deleteNode(first.next);
    }
}
