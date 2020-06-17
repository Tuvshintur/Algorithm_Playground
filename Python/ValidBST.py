class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def isValidBST(self, root):
        def helper(node, lower, upper):
            if not node:
                return True
            val = node.val
            if val <= lower or val >= upper:
                return False
            if not helper(node.right, val, upper):
                return False
            if not helper(node.left, lower, val):
                return False
            return True

        return helper(root, float("-inf"), float("inf"))


# Time complexity is O(N) because its visiting all nodes one time
# Space complexity is O(N) however it seems like constant the reason is recursive call stack
# usually space complexity is depth of you recurion call
# in this case if the BST well balanced it can be O(logn) but Big O describes worst case
# so it's the O(N) because BST can be one branch all way down
# Recursive call stack is storing your function with parameters

node = TreeNode(5)
node.left = TreeNode(4)
node.right = TreeNode(7)
print(Solution().isValidBST(node))

node = TreeNode(3)
node.left = TreeNode(1)
node.right = TreeNode(2)

print(Solution().isValidBST(node))

node = TreeNode(5)
node.left = TreeNode(1)
node.right = TreeNode(4)
node.right.left = TreeNode(3)
node.right.right = TreeNode(6)

print(Solution().isValidBST(node))
