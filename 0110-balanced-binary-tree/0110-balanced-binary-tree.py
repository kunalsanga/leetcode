class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        res = []
        def dfs(node):
            if not node:
                return 0
            l = dfs(node.left)
            r = dfs(node.right)
            bf = l - r
            if bf not in [-1, 0, 1]:
                res.append(bf)
            return 1 + max(l, r)
        dfs(root)
        return False if res else True