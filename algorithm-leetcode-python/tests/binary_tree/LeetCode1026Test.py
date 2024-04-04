import unittest

from src.binary_tree.LeetCode1026 import LeetCode1026
from src.binary_tree.TreeNode import TreeNode


class LeetCode1026Test(unittest.TestCase):
    def test_one(self):
        root = TreeNode(8)
        root.left = TreeNode(3)
        root.right = TreeNode(10)
        root.left.left = TreeNode(1)
        root.left.right = TreeNode(6)
        root.right.right = TreeNode(14)
        root.left.right = TreeNode(4)
        root.left.right.right = TreeNode(7)
        root.right.right.left = TreeNode(13)
        expected = 7
        res = LeetCode1026().maxAncestorDiff(root)
        self.assertEquals(expected, res)

    def test_two(self):
        root = TreeNode(1)
        root.right = TreeNode(2)
        root.right.right = TreeNode(0)
        root.right.right.left = TreeNode(3)
        expected = 3
        res = LeetCode1026().maxAncestorDiff(root)
        self.assertEquals(expected, res)
