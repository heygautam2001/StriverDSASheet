package TreeDs;
// leet-code 543
public class DiameterOfBinaryTree {
    public int height(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);
        if (root.left != null)
            mid++;
        if (root.right != null)
            mid++;
        return Math.max(leftAns, Math.max(rightAns, mid));
    }
}
