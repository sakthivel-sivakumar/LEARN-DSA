# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isCousins(self, root: Optional[TreeNode], x: int, y: int) -> bool:
        if root is None:
            return False

        queue = deque()
        queue.append(root)

        while queue:
            size = len(queue)
            isXFound = False
            isYFound = False

            for _ in range(size):
                current = queue.popleft()

                if current.val == x:
                    isXFound = True
                if current.val == y:
                    isYFound = True

                if current.left and current.right:
                    if ((current.left.val == x and current.right.val == y) or
                        (current.left.val == y and current.right.val == x)):
                        return False  # x and y are siblings

                if current.left:
                    queue.append(current.left)
                if current.right:
                    queue.append(current.right)

            if isXFound and isYFound:
                return True  # x and y found at the same level, not siblings
            if isXFound or isYFound:
                return False  # Only one found at this level

        return False
        