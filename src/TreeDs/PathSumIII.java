package TreeDs;

public class PathSumIII {
    // Counts number of paths starting from the current node
// whose sum equals targetSum
    public int noOfPaths(TreeNode root, long targetSum) {

        // 1. Base case: if node is null, no path possible
        if (root == null) return 0;

        int count = 0;

        // 2. Check if current node itself completes the target sum
        if ((long) root.val == targetSum)
            count++;

        // 3. Recursively count paths in left subtree
        //    with reduced targetSum
        // 4. Recursively count paths in right subtree
        //    with reduced targetSum
        return count
                + noOfPaths(root.left, targetSum - (long) root.val)
                + noOfPaths(root.right, targetSum - (long) root.val);
    }
    // Main function to count all paths in the tree
    // whose sum equals targetSum
    public int pathSum(TreeNode root, int targetSum) {

        // 1. Base case: empty tree has no paths
        if (root == null) return 0;

        // 2. Count paths starting from current root
        int count = noOfPaths(root, (long) targetSum);

        // 3. Recursively count paths starting from left subtree
        // 4. Recursively count paths starting from right subtree
        count += pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);

        // 5. Return total count of valid paths
        return count;
    }

    public static void main(String[] args) {

    }
}
