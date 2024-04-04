package org.muxun.algorithm.leetcode.java.node;

/**
 * 题号: 142
 * 题目: 环形链表II
 * 链接: <a href="https://leetcode.cn/problems/linked-list-cycle-ii">环形链表II</a>
 * 详情: 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）
 * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况
 * 不允许修改链表
 * @author 慕勋
 * @created 2024/1/31
 */
public class LeetCode142 {

    /**
     * 思路: 快慢指针
     * 和  题目类似，需要用快慢指针
     * 不同的是，需要进行一些计算：
     * 1. fast指针走过的步数是slow指针的两倍
     * 2. fast在环中走过的长度是slow在环中走过的长度的整数倍
     * 可以得到计算公式：k = a + nb，走a步到达环的入口节点，走b步回到环的入口节点
     * 所以slow指针在已经走了b步的情况下，再走a步可以到达环的入口节点
     * 那么我们不知道a，怎么再走a步呢
     * 可以再弄一个指针，从head出发，slow和head节点相遇，即为入口节点
     * @param head 头指针
     * @return 入环的第一个节点
     */
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);
        fast = head;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
