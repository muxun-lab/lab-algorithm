package org.muxun.algorithm.leetcode.java.binarytree;

/**
 * 题号: 331
 * <p>
 * 链接:
 * <p>
 * 详情: 序列化二叉树的一种方法是使用 前序遍历 。当我们遇到一个非空节点时，我们可以记录下这个节点的值。如果它是一个空节点，我们可以使用一个标记值记录，例如 #。
 * <p>
 * 例如，上面的二叉树可以被序列化为字符串 "9,3,4,#,#,1,#,#,2,#,6,#,#"，其中 # 代表一个空节点。
 * <p>
 * 给定一串以逗号分隔的序列，验证它是否是正确的二叉树的前序序列化。编写一个在不重构树的条件下的可行算法。
 * <p>
 * 保证 每个以逗号分隔的字符或为一个整数或为一个表示 null 指针的 '#' 。
 * <p>
 * 你可以认为输入格式总是有效的
 * <p>
 * <li> 例如它永远不会包含两个连续的逗号，比如 "1,,3" 。
 * 注意：不允许重建树。
 * @author 慕勋
 * @created 2024-03-31
 */
public class LeetCode331 {

    /**
     * 思路: 计数器
     * 1. 如果遇到空节点，消耗一个槽位
     * 2. 如果遇到一个非空节点，先消耗掉一个槽位，再补充两个叶子节点的槽位
     * @param preorder 先序遍历
     * @return 是否是二叉树
     */
    public boolean isValidSerialization(String preorder) {
        int n = preorder.length();
        int i = 0;
        int count = 1;
        while (i < n) {
            if (count == 0) {
                return false;
            }
            if (preorder.charAt(i) == ',') {
                i++;
            } else if (preorder.charAt(i) == '#') {
                count--;
                i++;
            } else {
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                count--;
                count = count + 2;
            }
        }
        return count == 0;
    }
}
