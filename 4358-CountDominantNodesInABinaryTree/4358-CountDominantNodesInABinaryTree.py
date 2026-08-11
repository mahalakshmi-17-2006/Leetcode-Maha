# Last updated: 8/11/2026, 2:13:39 PM
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countDominantNodes(self, root: TreeNode | None) -> int:
        c=0;
        def help(node):
            nonlocal c
            
            if node is None:
                return float("-inf")

            left = help(node.left)
            right=help(node.right)

            max_val = max(node.val,left,right)
            if node.val == max_val:
                c+=1
            return max_val
        help(root)
        return c
        