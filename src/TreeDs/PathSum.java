package TreeDs;

// Leet-code 112
public class PathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null) {
            if (targetSum == root.val)
                return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

    }

    public static void main(String[] args) {

    }
}
