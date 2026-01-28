package TreeDs;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    // Helper function to find all root-to-leaf paths
// whose sum equals targetSum
    public void helper(TreeNode root, int targetSum,
                       List<List<Integer>> ans,
                       List<Integer> arr) {

        // 1. Base case: if current node is null, stop recursion
        if (root == null)
            return;

        // 2. Check if current node is a leaf node
        if (root.left == null && root.right == null) {

            // Add current node value to the path
            arr.add(root.val);

            // 3. Check if remaining targetSum matches leaf value
            if (root.val == targetSum) {

                // Valid path found → add a copy of path to answer
                List<Integer> a = new ArrayList<>(arr);
                ans.add(a);
            }

            // 4. Backtracking: remove current node before returning
            arr.removeLast();
            return;
        }

        // 5. Add current node value to the path
        arr.add(root.val);

        // 6. Recursively search left subtree
        //    Reduce targetSum by current node value
        helper(root.left, targetSum - root.val, ans, arr);

        // 7. Recursively search right subtree
        helper(root.right, targetSum - root.val, ans, arr);

        // 8. Backtracking: remove current node
        //    to explore other paths
        arr.removeLast();
    }

    // Main function to initiate path sum calculation
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        // 1. List to store all valid root-to-leaf paths
        List<List<Integer>> ans = new ArrayList<>();

        // 2. Temporary list to store current path
        List<Integer> arr = new ArrayList<>();

        // 3. Start DFS traversal from root
        helper(root, targetSum, ans, arr);

        // 4. Return all valid paths
        return ans;
    }

}
