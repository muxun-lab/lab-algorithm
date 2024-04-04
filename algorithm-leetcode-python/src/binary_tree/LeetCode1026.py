from typing import Optional

from src.binary_tree import TreeNode


class LeetCode1026(object):
    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
        def dfs(root, mi, ma) -> int:
            if root is None:
                return 0
            diff = max(abs(root.val - mi), abs(root.val - ma))
            mi = min(root.val, mi)
            ma = max(root.val, ma)
            diff = max(diff, dfs(root.left, mi, ma))
            diff = max(diff, dfs(root.right, mi, ma))
            return diff

        return dfs(root, root.val, root.val)
